import java.util.Scanner;
import java.util.*;

public class HW5 {
    // homework7_7
    public static void homework7_7() {
        ArrayList<Integer> randomList = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++) {
            randomList.add((int)(Math.random() * 10));
        }
        for (int i = 0; i < 10; i++) {
            System.out.println("The counts for " + i + " is " + Collections.frequency(randomList, i));
        }
    }

    // homework 7_10
    public static int indexOfSmallestElement(double[] array) {
        double small = Double.MAX_VALUE;
        int idx = 0;
        for (int i = 0; i < array.length; i ++) {
            if (array[i] > 1 && array[i] < small) {
                small = array[i];
                idx = i;
            }
        }
        System.out.println(idx);
        return idx;
    }

    public static void testIndexOfSmallestElement() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter ten numbers, separated by a space:");
        double[] tenNumbersArray = new double[10];
        for (int i = 0; i < 10; i++) {
            tenNumbersArray[i] = input.nextDouble();
        }
        System.out.println(indexOfSmallestElement(tenNumbersArray));
    }

    // homework 7_12
    public static void homework7_12() {
        int[] lst_1 = {1, 2, 3, 4, 5, 6};
        int[] lst_2 = reverse(lst_1);
    }

    public static int[] reverse(int[] lst) {
        int len = lst.length/2;
        for (int i = 0; i < len; i++) {
            int tmp = lst[i];
            lst[i] = lst[lst.length-1-i];
            lst[lst.length-1-i] = tmp;
        }
        return lst;
    }

    public static void testReverse() {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter ten numbers, separated by a space:");
        int[] tenNumbersArray = new int[10];
        for (int i = 0; i < 10; i++) {
            tenNumbersArray[i] = input.nextInt();
        }
        int[] res = reverse(tenNumbersArray);
        for (int i = 0; i < 10; i++) {
            System.out.println(res[i]);
        }
    }

    // homework 7_17
    public static void homework7_17() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int num = input.nextInt();
        String[] names = new String[num];
        double[] score = new double[num];
        for(int i = 0; i < num; i++) {
            System.out.print("Enter the student's name: ");
            names[i] = input.next();
            System.out.print("Enter the student's score: ");
            score[i] = input.nextInt();
        }
        selectionSort(names, score);
        System.out.println(Arrays.toString(names));
    }

    public static void selectionSort(String[] names, double[] score) {
        for(int i = score.length - 1; i >= 1; i--) {
            String temp;
            double currentMax = score[0];
            int currentMaxIndex = 0;
            for(int j = 1; j <= i; j++) {
                if (currentMax > score[j]) {
                    currentMax = score[j];
                    currentMaxIndex = j;
                }
            }
            if (currentMaxIndex != i) {
                temp = names[currentMaxIndex];
                names[currentMaxIndex] = names[i];
                names[i] = temp;
                score[currentMaxIndex] = score[i];
                score[i] = currentMax;
            }
        }
    }

    public static void main(String[] args) {
        homework7_7();
        testIndexOfSmallestElement();
        testReverse();
        homework7_17();
    }

}


