import java.util.Scanner;

public class HW2{
    //    homework 2_6
    public static void homework2_6(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number between 0 and 1000:");
        int number = input.nextInt();
        int cal = 0;

        int last = number % 10;
        int remainNumber = number / 10;
        int second = remainNumber % 10;
        remainNumber = remainNumber / 10;
        int first = remainNumber % 10;
        System.out.println("The sum of the digits is " + (last + second + first));

//        if (number >= 100) {
//            cal = number % 10;
//            number = number / 10;
//            cal += number % 10;
//            number = number / 10;
//            cal += number;
//        } else if (number >= 10) {
//            cal = number % 10;
//            number = number / 10;
//            cal += number;
//        } else {
//            cal = number;
//        }

//        System.out.println("The sum of the digits is " + cal);


    }

    //    homework 2_8
    public static void homework2_8(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the time zone offset to GMT:");
        long offset = input.nextLong();
        long offsetSecond = offset * 60 * 60;
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long adjustTimeZoneSeconds = totalSeconds + offsetSecond;
        long currentSecond = adjustTimeZoneSeconds % 60;
        long totalMinutes = adjustTimeZoneSeconds / 60;
        long currentMinute = totalMinutes % 60;
        long totalHours = totalMinutes / 60;
        long currentHour = totalHours % 24;
        System.out.println("The current time is " + currentHour + ":" + currentMinute + ":" + currentSecond );
    }

    //    homework 2_13
    public static void homework2_13(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the monthly saving amount:");
        double saving = input.nextDouble();
        double rate = 0.00417;
        double firstMonth = saving * (1 + rate);
        double secondMonth = (saving + firstMonth) * (1 + rate);
        double thirdMonth = (saving + secondMonth) * (1 + rate);
        double fourthMonth = (saving + thirdMonth) * (1 + rate);
        double fifthMonth = (saving + fourthMonth) * (1 + rate);
        double sixthMonth = (saving + fifthMonth) * (1 + rate);
        System.out.println("After the sixth month, the account value is $" + sixthMonth);
    }

    //    homework 2_23
    public static void homework2_23(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the driving distance:");
        double drivingDistance = input.nextDouble();

        System.out.print("Enter miles per gallon:");
        double fuelEfficiency = input.nextDouble();

        System.out.print("Enter price per gallon:");
        double fuelPrice = input.nextDouble();

        double cost = drivingDistance / fuelEfficiency * fuelPrice;
        System.out.println("The cost of driving is $" + cost);
    }

    //    homework 3_4
    public static void homework3_4(){
        int number = (int)(Math.random() * 12) + 1;

        switch (number){
            case 1: System.out.println("January"); break;
            case 2: System.out.println("February"); break;
            case 3: System.out.println("March"); break;
            case 4: System.out.println("April"); break;
            case 5: System.out.println("May"); break;
            case 6: System.out.println("June"); break;
            case 7: System.out.println("July"); break;
            case 8: System.out.println("August"); break;
            case 9: System.out.println("September"); break;
            case 10: System.out.println("October"); break;
            case 11: System.out.println("November"); break;
            case 12: System.out.println("December"); break;
        }

    }

    //    homework 3_33
    public static void homework3_33(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter weight and price for package 1:");
//        String packageOne = input.nextLine();
//        String[] arrOne = packageOne.split(" ");
//
//        int wOne = Integer.parseInt(arrOne[0]);
//        double pOne = Double.parseDouble(arrOne[1]);
        double wOne = input.nextDouble();
        double pOne = input.nextDouble();
        double one = wOne / pOne;

        System.out.print("Enter weight and price for package 2:");
//        String packageTwo = input.nextLine();
//        String[] arrTwo = packageTwo.split(" ");
//
//        int wTwo = Integer.parseInt(arrTwo[0]);
//        double pTwo = Double.parseDouble(arrTwo[1]);
        double wTwo = input.nextDouble();
        double pTwo = input.nextDouble();
        double two = wTwo / pTwo;

        if (one > two) {
            System.out.println("Package 1 has a better price.");
        } else if (two > one){
            System.out.println("Package 2 has a better price.");
        } else {
            System.out.println("Package 1 and Package 2 have the same price.");
        }

    }

    public static void main(String[] args) {
        homework2_6();
        homework2_8();
        homework2_13();
        homework2_23();
        homework3_4();
        homework3_33();
    }
}

