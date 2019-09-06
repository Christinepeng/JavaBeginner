import java.util.Scanner;

public class HW3{
    // homework 4_15
    public static void homework4_15(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a letter:");
        char ch = input.next().toLowerCase().charAt(0);
        
        if (ch == 'a' || ch == 'b' || ch == 'c') {
            System.out.println("The corresponding number is " + 2);
        } else if (ch == 'd' || ch == 'e' || ch == 'f') {
            System.out.println("The corresponding number is " + 3);
        } else if (ch == 'g' || ch == 'h' || ch == 'i') {
            System.out.println("The corresponding number is " + 4);
        } else if (ch == 'j' || ch == 'k' || ch == 'l') {
            System.out.println("The corresponding number is " + 5);
        } else if (ch == 'm' || ch == 'n' || ch == 'o') {
            System.out.println("The corresponding number is " + 6);
        } else if (ch == 'p' || ch == 'q' || ch == 'r' || ch == 's') {
            System.out.println("The corresponding number is " + 7);
        } else if (ch == 't' || ch == 'u' || ch == 'v') {
            System.out.println("The corresponding number is " + 8);
        } else {
            System.out.println("The corresponding number is " + 9);
        }
    }

    // homework 4_17
    public static void homework4_17(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a year:");
        int year = input.nextInt();

        System.out.println("Enter a month:");
        String month = input.next();

        if (month.equals("Jan") || month.equals("Mar") || month.equals("May") || month.equals("Jul") ||
                month.equals("Aug") || month.equals("Oct") || month.equals("Dec")) {
            System.out.println(month + " " + year + " has 31 days");
        } else if (month.equals("Feb")) {
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(month + " " + year + " has 29 days");
            } else {
                System.out.println(month + " " + year + " has 28 days");
            }
        } else {
            System.out.println(month + " " + year + " has 30 days");
        }
    }

    // homework 4_21
    public static void homework4_21(){
        Scanner input = new Scanner(System.in);

        boolean suc = false;
        while (suc == false) {
            System.out.println("Enter a SSN:");
            String ssn = input.next();

            String[] parts = ssn.split("-");

            if (parts.length == 3 && parts[0].length() == 3 && parts[1].length() == 2 && parts[2].length() == 4) {
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < parts[i].length(); j++) {
                        if (Character.isDigit(parts[i].charAt(j))) {
                            suc = true;
                        } else {
                            System.out.println(ssn + " is an invalid social security number");
                        }
                    }
                } if(suc) {
                    System.out.println(ssn + " is an valid social security number");
                }
            } else {
                System.out.println(ssn + " is an invalid social security number");
            }
        }
//
//        System.out.println("Enter a SSN:");
//        String ssn = input.next();
//
//        String[] parts = ssn.split("-");
//
//        boolean suc = true;
//        // check the length
//        if (parts.length == 3 && parts[0].length() == 3 && parts[1].length() == 2 && parts[2].length() == 4) {
//            // check each character is an integer
//            for (int i = 0; i < 3; i++) {
//                for (int j = 0; j < parts[i].length(); j++) {
////                    System.out.println(suc);
//                    if (!Character.isDigit(parts[i].charAt(j))) {
//                        suc = false;
//                    }
//                }
//            }
//        } else {
//            suc = false;
//        }
//
//        if (suc) {
//            System.out.println(ssn + " is a valid social security number");
//        } else {
//            System.out.println(ssn + " is an invalid social security number");
//        }
    }

    // homework 4_24
    public static void homework4_24(){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first city:");
        String firstCity = input.nextLine();
        System.out.println("Enter the second city:");
        String secondCity = input.nextLine();
        System.out.println("Enter the third city:");
        String thirdCity = input.nextLine();

        System.out.print("The three cities in alphabetical order are ");
        if (firstCity.compareTo(secondCity) <= 0) { // AB -> ACB, ABC, CAB
            if (firstCity.compareTo(thirdCity) <= 0) {
                if (secondCity.compareTo(thirdCity) <= 0) {
                    System.out.println(firstCity + " " + secondCity + " " + thirdCity);
                } else {
                    System.out.println(firstCity + " " + thirdCity + " " + secondCity);
                }
            } else {
                System.out.println(thirdCity + " " + firstCity + " " + secondCity);
            }
        } else { // BA -> BAC, BCA, CBA
            if (firstCity.compareTo(thirdCity) <= 0) {
                System.out.println(secondCity + " " + firstCity + " " + thirdCity);
            } else {
                if (secondCity.compareTo(thirdCity) <= 0) {
                    System.out.println(secondCity + " " + thirdCity + " " + firstCity);
                } else {
                    System.out.println(thirdCity + " " + secondCity + " " + firstCity);
                }
            }

        }
    }

    // homework 4_25
    public static void homework4_25(){
        String vehiclePlate = "";
        for (int i = 0; i < 3; i++) {
            vehiclePlate += (char)('A' + (int)(Math.random() * 26));
        }
        for (int i = 0; i < 4; i++) {
            vehiclePlate += (char)('0' + (int)(Math.random() * 10));
        }
        System.out.println(vehiclePlate);
    }

    public static void main(String[] args) {
        homework4_15();
        homework4_17();
        homework4_21();
        homework4_24();
        homework4_25();
    }
}

