const form = document.getElementById("healthForm");
const scoreSpan = document.getElementById("score");
const emoji = document.getElementById("emoji");
const ctx = document.getElementById("chart").getContext("2d");
const historyTable = document.querySelector("#historyTable tbody");

form.addEventListener("submit", function (e) {
    e.preventDefault();
    const age = +document.getElementById("age").value;
    const sleep = +document.getElementById("sleep").value;
    const exercise = +document.getElementById("exercise").value;
    const water = +document.getElementById("water").value;

    // Custom logic: weighted formula
    let score = 0;
    score += Math.min(30, (sleep - 6) * 10);     // 0–30
    score += Math.min(30, (exercise / 30) * 30); // 0–30
    score += Math.min(30, (water / 8) * 30);     // 0–30
    score = Math.min(100, Math.max(0, score));

    scoreSpan.innerText = Math.round(score);
    emoji.innerText = score > 80 ? "😄" : score >= 50 ? "😐" : "😟";

    drawChart(score);
    storeAndRender(age, sleep, exercise, water, Math.round(score));
});

function drawChart(score) {
    const canvas = document.getElementById("chart");
    const ctx = canvas.getContext("2d");
    ctx.clearRect(0, 0, 200, 200);

    ctx.beginPath();
    ctx.arc(100, 100, 80, 0, 2 * Math.PI);
    ctx.strokeStyle = "#ddd";
    ctx.lineWidth = 20;
    ctx.stroke();

    ctx.beginPath();
    ctx.arc(100, 100, 80, -0.5 * Math.PI, (score / 100) * 2 * Math.PI - 0.5 * Math.PI);
    ctx.strokeStyle = "green";
    ctx.lineWidth = 20;
    ctx.stroke();
}

function storeAndRender(age, sleep, exercise, water, score) {
    const data = JSON.parse(localStorage.getItem("healthData") || "[]");
    data.push({ age, sleep, exercise, water, score });
    localStorage.setItem("healthData", JSON.stringify(data));
    renderTable(data);
}

function renderTable(data) {
    historyTable.innerHTML = "";
    data.forEach(row => {
        const tr = document.createElement("tr");
        tr.innerHTML = `<td>${row.age}</td><td>${row.sleep}</td><td>${row.exercise}</td><td>${row.water}</td><td>${row.score}</td>`;
        historyTable.appendChild(tr);
    });
}

// Render on load
renderTable(JSON.parse(localStorage.getItem("healthData") || "[]"));

document.getElementById("clearData").addEventListener("click", () => {
  if (confirm("Are you sure you want to delete your data?")) {
    localStorage.removeItem("healthData");
    historyTable.innerHTML = "";
    scoreSpan.innerText = "--";
    emoji.innerText = "🤔";
    drawChart(0); // Clear chart
    alert("Your health data has been deleted.");
  }
});
