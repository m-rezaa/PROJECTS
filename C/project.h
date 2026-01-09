int TotalBill(int rate, int quantity)
{
    int total;
    total = rate * quantity;
    return total;
}
float CalculateBill(int current_total, int item_total)
{
    float total;
    total = current_total + item_total;
    return total;
}
float BillAfterGST(float total)
{
    float totalgst;
    totalgst = total * 0.13;
    return totalgst;
}
float OverallTotal(float total_bill, float AfterGST)
{
    float total = total_bill + AfterGST;
    return total;
}