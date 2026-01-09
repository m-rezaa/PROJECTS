import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

class person {
    public static final String RESET = "\u001B[0m";
    public static final String YELLOW = "\u001B[43m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[47m";

    String name;
    String email;
    String source;
    String destination;
    String phone;
    int age;

    String issueDate;

    person() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        issueDate = now.format(formatter);
    }

}

class transport extends person {

    void displayDetails() {
        System.out.println("\n\n--- TICKET INFO ---");
        System.out.println("NAME : " + name);
        System.out.println("EMAIL : " + email);
        System.out.println("AGE : " + age);
        System.out.println("PHONE NUMBER : " + phone);
        System.out.println("SOURCE : " + source);
        System.out.println("DESIINATION : " + destination);
        System.out.println();
    }

}

class airline extends payment {

    String air;

    @Override
    void displayDetails() {
        System.out.println(BLACK + WHITE + "\n--- TICKET INFO ---");
        System.out.println(BLUE + "NAME : " + name);
        System.out.println("EMAIL : " + email);
        System.out.println("AGE : " + age);
        System.out.println("PHONE NUMBER : " + phone);
        System.out.println("SOURCE : " + source);
        System.out.println("DESIINATION : " + destination);
        System.out.println("AIRLINE : " + air);
        System.out.println("DATE OF PRINT : " + issueDate + RESET);
        System.out.println("\n\n");
    }

    void makeBooking() {
        System.out.println(BLACK + YELLOW + "\t\tAVAILABLE AIRLINES" + RESET);
        System.out.printf("%-20s %10s %19s\n", "Airlines ID", "Pricing", "Timings");
        System.out.printf(RED + "%-20s %9s %19s\n", "A101", "25000", "13:40");
        System.out.printf("%-20s %9s %19s\n", "A126", "75000", "15:20");
        System.out.printf("%-20s %9s %19s\n", "A156", "60000", "00:30");
        System.out.printf("%-20s %9s %19s\n", "A234", "90000", "04:15");
        System.out.printf("%-20s %9s %19s\n", "A278", "92500", "09:35");

        System.out.println(CYAN + "\nWhich airline do you want to select?" + RESET);
        Scanner scan_air = new Scanner(System.in);
        air = scan_air.next();
        if (air.equals("A101") || air.equals("A126") || air.equals("A156") || air.equals("A234")
                || air.equals("A278")) {

            Scanner scan_name = new Scanner(System.in);
            System.out.println("Passenger's Name:");
            name = scan_name.nextLine();
            Scanner scan_email = new Scanner(System.in);
            System.out.println("Passenger's Email:");
            email = scan_email.nextLine();
            Scanner scan_age = new Scanner(System.in);
            System.out.println("Passenger's Age:");
            age = scan_age.nextInt();
            Scanner scan_phone = new Scanner(System.in);
            System.out.println("Passenger's Phone Number:");
            phone = scan_phone.next();
            Scanner scan_source = new Scanner(System.in);
            System.out.println("Passenger's Source:");
            source = scan_source.nextLine();
            Scanner scan_destination = new Scanner(System.in);
            System.out.println("Passenger's Destination:");
            destination = scan_destination.nextLine();

            makePayment();
            displayDetails();

        } else {
            System.out.println("Unavailable airline or airline not found");
        }

    }
}

class railway extends payment {

    String rail;

    @Override
    void displayDetails() {
        System.out.println(BLACK + WHITE + "\n--- TICKET INFO ---");
        System.out.println(BLUE + "NAME : " + name);
        System.out.println("EMAIL : " + email);
        System.out.println("AGE : " + age);
        System.out.println("PHONE NUMBER : " + phone);
        System.out.println("SOURCE : " + source);
        System.out.println("DESIINATION : " + destination);
        System.out.println("TRAIN : " + rail);
        System.out.println("DATE OF PRINT : " + issueDate + RESET);
        System.out.println("\n\n");
    }

    void makeBooking() {
        System.out.println(BLACK + YELLOW + "\t\tAVAILABLE TRAINS" + RESET);
        System.out.printf("%-20s %10s %19s\n", "Train ID", "Pricing", "Timings");
        System.out.printf(RED + "%-20s %9s %19s\n", "Green Line", "25000", "13:40");
        System.out.printf("%-20s %9s %19s\n", "Pakistan Express", "15000", "15:20");
        System.out.printf("%-20s %9s %19s\n", "Awami Express", "10000", "00:30");
        System.out.printf("%-20s %9s %19s\n", "Rehman Baba", "9000", "04:15");

        System.out.println(CYAN + "\nWhich Train do you want to select?" + RESET);
        Scanner scan_rail = new Scanner(System.in);
        rail = scan_rail.nextLine();
        if (rail.equals("Green Line") || rail.equals("Pakistan Express") || rail.equals("Awami Express")
                || rail.equals("Rehman Baba")) {

            Scanner scan_name = new Scanner(System.in);
            System.out.println("Passenger's Name:");
            name = scan_name.nextLine();
            Scanner scan_email = new Scanner(System.in);
            System.out.println("Passenger's Email:");
            email = scan_email.nextLine();
            Scanner scan_age = new Scanner(System.in);
            System.out.println("Passenger's Age:");
            age = scan_age.nextInt();
            Scanner scan_phone = new Scanner(System.in);
            System.out.println("Passenger's Phone Number:");
            phone = scan_phone.next();
            Scanner scan_source = new Scanner(System.in);
            System.out.println("Passenger's Source:");
            source = scan_source.nextLine();
            Scanner scan_destination = new Scanner(System.in);
            System.out.println("Passenger's Destination:");
            destination = scan_destination.nextLine();
            makePayment();
            displayDetails();

        } else {
            System.out.println("Unavailable Train!");
        }

    }
}

class bus extends payment {
    String bus_ID;

    @Override
    void displayDetails() {
        System.out.println(BLACK + WHITE + "\n--- TICKET INFO ---");
        System.out.println(BLUE + "NAME : " + name);
        System.out.println("EMAIL : " + email);
        System.out.println("AGE : " + age);
        System.out.println("PHONE NUMBER : " + phone);
        System.out.println("SOURCE : " + source);
        System.out.println("DESIINATION : " + destination);
        System.out.println("BUS : " + bus_ID);
        System.out.println("DATE OF PRINT : " + issueDate + RESET);
        System.out.println("\n\n");
    }

    void makeBooking() {
        System.out.println(BLACK + YELLOW + "\t\tAVAILABLE BUSSES" + RESET);
        System.out.printf("%-20s %10s %19s\n", "Bus ID", "Pricing", "Timings");
        System.out.printf(RED + "%-20s %9s %19s\n", "Faisal Movers", "5000", "09:40");
        System.out.printf("%-20s %9s %19s\n", "Daewoo Express", "7500", "12:20");
        System.out.printf("%-20s %9s %19s\n", "Niazi Express", "6000", "16:30");
        System.out.printf("%-20s %9s %19s\n", "Skyways", "9000", "20:15");

        System.out.println(CYAN + "\nWhich bus do you want to select?" + RESET);
        Scanner scan_bus = new Scanner(System.in);
        bus_ID = scan_bus.nextLine();
        if (bus_ID.equals("Faisal Movers") || bus_ID.equals("Daewoo Express") || bus_ID.equals("Niazi Express")
                || bus_ID.equals("Skyways")) {

            Scanner scan_name = new Scanner(System.in);
            System.out.println("Passenger's Name:");
            name = scan_name.nextLine();
            Scanner scan_email = new Scanner(System.in);
            System.out.println("Passenger's Email:");
            email = scan_email.nextLine();
            Scanner scan_age = new Scanner(System.in);
            System.out.println("Passenger's Age:");
            age = scan_age.nextInt();
            Scanner scan_phone = new Scanner(System.in);
            System.out.println("Passenger's Phone Number:");
            phone = scan_phone.next();
            Scanner scan_source = new Scanner(System.in);
            System.out.println("Passenger's Source:");
            source = scan_source.nextLine();
            Scanner scan_destination = new Scanner(System.in);
            System.out.println("Passenger's Destination:");
            destination = scan_destination.nextLine();
            makePayment();
            displayDetails();

        } else {
            System.out.println("Bus unavailable.");
        }

    }
}

class payment extends transport {
    Scanner scan_card = new Scanner(System.in);
    Scanner scan_acc = new Scanner(System.in);
    Scanner scan_choice = new Scanner(System.in);
    int choice;

    void makePayment() {
        System.out.println("\nChoose Your Payment Method:");
        System.out.println(RED + WHITE + "1. Credit Card" + RESET);
        System.out.println(RED + WHITE + "2. Easypaisa/Jazzcash" + RESET);
        choice = scan_choice.nextInt();
        switch (choice) {
            case 1:
                System.out.println(GREEN + "\nENTER YOUR CARD DETAILS:\n" + RESET);
                System.out.println("Name on card:" + PURPLE);
                String C_name = scan_card.nextLine();
                System.out.println(RESET + "Card number:" + PURPLE);
                String C_number = scan_card.nextLine();
                System.out.println(RESET + "Expiry mm/yy:" + PURPLE);
                String C_date = scan_card.nextLine();
                System.out.println(RESET + "Security Code:" + PURPLE);
                int C_code = scan_card.nextInt();

                System.out.println(RESET + GREEN + "\nPayment Successful!\n" + RESET);
                break;
            case 2:
                System.out.println(GREEN + "\nENTER YOUR ACCOUNT DETAILS:\n" + RESET);
                System.out.println("Account title:" + PURPLE);
                String A_name = scan_acc.nextLine();
                System.out.println(RESET + "Account number:" + PURPLE);
                String A_number = scan_acc.nextLine();
                System.out.println(RESET + "Security Code:" + PURPLE);
                int A_code = scan_acc.nextInt();

                System.out.println(RESET + GREEN + "\nPayment Successful!\n" + RESET);
                break;
            default:
                throw new AssertionError();
        }
    }
}

public class project {

    public static final String BROWN = "\u001B[38;2;139;69;19m";
    public static final String RESET = "\u001B[0m";
    public static final String YELLOW = "\u001B[43m";
    public static final String GREEN = "\u001B[32m";
    public static final String BLACK = "\u001B[30m";

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int choice;

        do {

            System.out.println("Welcome To The Transport Reservation System.");
            System.out.println("1. Airline\n2. Railway\n3. Bus\n4. Exit");
            System.out.print("Enter your choice: ");
            System.out.println();
            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    airline air1 = new airline();
                    System.out.println(BROWN + "\nYou chose Airline\n" + RESET);
                    air1.makeBooking();
                    break;
                case 2:
                    railway rail1 = new railway();
                    System.out.println(BROWN + "\nYou chose Railway\n" + RESET);
                    rail1.makeBooking();
                    break;
                case 3:
                    bus bus1 = new bus();
                    System.out.println(BROWN + "\nYou chose Bus\n" + RESET);
                    bus1.makeBooking();
                    break;
                case 4:
                    System.out.println("Exiting the system. Thank you!\n\n");
                    System.out.println(BLACK + YELLOW + "OOP LAB PROJECT MADE BY:" + RESET);
                    System.out.println(GREEN + "\nANUM SAJID SE-241043");
                    System.out.println("MUHAMMAD REZA SE-241014");
                    System.out.println("MARIAM FATIMA SE-241015\n\n" + RESET);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scan.close();
    }
}