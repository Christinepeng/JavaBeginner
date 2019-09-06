import java.util.Scanner;


class OOPCalculator {
    Scanner scanner = new Scanner(System.in);
    double value_f = -1;
    double value_s = -1;
    int menuChoiceInt = -1;

    int askCalcChoice() {
        System.out.println("What would you like to do?");
        do {
            String menuChoice = scanner.nextLine();
            if ("1".equals(menuChoice) || "A".equals(menuChoice) || "a".equals(menuChoice)) {
                menuChoiceInt = 1;
                break;
            } else if ("2".equals(menuChoice) || "S".equals(menuChoice) || "s".equals(menuChoice)) {
                menuChoiceInt = 2;
                break;
            } else if ("3".equals(menuChoice) || "M".equals(menuChoice) || "m".equals(menuChoice)) {
                menuChoiceInt = 3;
                break;
            } else if ("4".equals(menuChoice) || "D".equals(menuChoice) || "d".equals(menuChoice)) {
                menuChoiceInt = 4;
                break;
            } else if ("5".equals(menuChoice) || "X".equals(menuChoice) || "x".equals(menuChoice)) {
                menuChoiceInt = 5;
                break;
            } else {
                System.out.println("You have entered an invalid choice, please re-enter your choice:");
            }
        } while (true);
        return menuChoiceInt;
    }

    void askTwoValues() {
        System.out.println("Please enter two floats to " + "operate" + ", separated by a space:");
        do {
            try {
                String twoValues = scanner.nextLine();
                String[] valueList = twoValues.split(" ");
                if (valueList.length == 2) {
                    value_f = Double.valueOf(valueList[0]);
                    value_s = Double.valueOf(valueList[1]);
                    if (menuChoiceInt == 4 && value_s == 0) {
                        System.out.println("You can't divide by zero please re-enter both floats:");
                    } else {
                        break;
                    }
                } else {
                    System.out.println("You have entered invalid floats please re-enter:");
                }
            } catch(Exception e) {
                System.out.println("You have entered invalid floats please re-enter:");
            }
        } while (true);
    }

    void displayResult() {
        if (menuChoiceInt == 1) {
            System.out.printf("%.2f + %.2f = %.2f\n", value_f, value_s, value_f + value_s);
        } else if (menuChoiceInt == 2) {
            System.out.printf("%.2f - %.2f = %.2f\n", value_f, value_s, value_f - value_s);
        } else if (menuChoiceInt == 3) {
            System.out.printf("%.2f X %.2f = %.2f\n", value_f, value_s, value_f * value_s);
        } else if (menuChoiceInt == 4) {
            System.out.printf("%.2f / %.2f = %.2f\n", value_f, value_s, value_f / value_s);
        }
        scanner.nextLine();
    }

    void displayBye() {
        System.out.println("Thank you for using <Yiying Peng's> Handy Calculator ");
    }
}

public class TestOOPCalculator {
    public static void main(String[] args) {
        OOPCalculator calc = new OOPCalculator();
        while(calc.askCalcChoice() != 5) {
            calc.askTwoValues();
            calc.displayResult();
        }
        calc.displayBye();
    }
}