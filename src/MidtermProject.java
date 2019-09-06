import java.util.InputMismatchException;
import java.util.Scanner;

public class MidtermProject {

    public static int userChoice(Scanner readInput) {
        int inputInt;
        do {
            System.out.println("What would you like to do?");
            try {
                inputInt = readInput.nextInt();
                if (inputInt == 5) {
                    System.out.println("Thank you for using <Yiying Peng's> Handy Calculator ");
                    break;
                } else if (inputInt == 1) {
                    break;
                } else if (inputInt == 2) {
                    break;
                } else if (inputInt == 3) {
                    break;
                } else if (inputInt == 4) {
                    break;
                } else {
                    System.out.println("You have entered an invalid choice, please re-enter your choice:");
                    continue;
                }
            } catch (final InputMismatchException e) {
                System.out.println("You have entered an invalid choice, please re-enter your choice:");
                readInput.nextLine();
                continue;
            }
        } while (true);
        readInput.nextLine();
        return inputInt;
    }
    public static void twoFloats(float[] myFloats, Scanner readInput) {
        do {
            System.out.println("Please enter two floats to " + "operate" + ", separated by a space:");
            try {
                myFloats[0] = readInput.nextFloat();
                myFloats[1] = readInput.nextFloat();
                break;
            } catch (final InputMismatchException e) {
                System.out.println("You have entered invalid floats please re-enter:");
                readInput.nextLine();
                continue;
            }
        } while (true);
    }
    public static void main(String[] args) {
        Scanner rI = new Scanner(System.in);
        int userChoice;
        String operator;
        System.out.println("\nWelcome to <Yiying Peng's> Handy Calculator\n\n\t1. Addition\n\t2. Subtraction\n\t3. Multiplication\n\t4. Division\n\t5. Exit\n ");
        while (true) {
            userChoice = userChoice(rI);

            if (userChoice == 1) {
                operator = "adding";
            } else if (userChoice == 2) {
                operator = "subtract";
            } else if (userChoice == 3) {
                operator = "multiply";
            } else if (userChoice == 4){
                operator = "divide";
            } else {
                break;
            }

            boolean zero = true;;
            float[] myFloats = new float[2];
            do {
                twoFloats(myFloats, rI);
                if (operator == "divide" && myFloats[1] == 0) {
                    System.out.println("You can't divide by zero please re-enter both floats:");
                } else {
                    zero = false;
                }
            } while (zero);

            if (operator == "adding") {
                System.out.printf("Result of adding %.2f and %.2f is %.2f\n", myFloats[0], myFloats[1], (myFloats[0] + myFloats[1]));
            } else if (operator == "subtract") {
                System.out.printf("Result of subtracting %.2f and %.2f is %.2f\n", myFloats[0], myFloats[1], (myFloats[0] - myFloats[1]));
            } else if (operator == "multiply") {
                System.out.printf("Result of multiplying %.2f and %.2f is %.2f\n", myFloats[0], myFloats[1], (myFloats[0] * myFloats[1]));
            } else {
                System.out.printf("Result of dividing %.2f by %.2f is %.2f\n", myFloats[0], myFloats[1], (myFloats[0] / myFloats[1]));
            }
            System.out.println("Press enter key to continue ....");
            Scanner scanner = new Scanner(System.in);
            scanner.nextLine();
        }

    }
}