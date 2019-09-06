import java.util.Scanner;

public class HW4{
    // homework6_3
    public static boolean isPalindrome(int number) {
        if (number == reverse(number)) {
            return true;
        } else {
            return false;
        }
    }

    public static int reverse(int number){
        int reverseNum = 0;
        while (number != 0) {
            reverseNum = reverseNum * 10;
            reverseNum = reverseNum + number%10;
            number = number / 10;
        }
        return reverseNum;
    }

    // homework 6_6
    public static void displayPattern(int n){
        String[] myList = new String[n];
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j <= i; j++) {
                sb.append(i+1-j);
                if (i != j) {
                    sb.append(" ");
                }
            }
            myList[i] = sb.toString();
        }
        int len = myList[n-1].length();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < len-myList[i].length(); j++) {
                System.out.print(" ");
            }
            System.out.println(myList[i]);
        }
    }

    // homework 6_25
    public static void convertMillis(long millis){
        long s = millis / 1000;
        long m = s / 60;
        s = s % 60;
        long h = m / 60;
        System.out.println(h + ":" + m + ":" + s);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter an integer:");
        int number  = input.nextInt();

        boolean res = isPalindrome(number);
        System.out.println(res);

        System.out.println("Please enter a number:");
        int n  = input.nextInt();
        displayPattern(n);

        System.out.println("Please enter a milliseconds:");
        int ms  = input.nextInt();
        convertMillis(ms);
    }
}

