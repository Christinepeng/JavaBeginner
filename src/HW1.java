// student name: Yiying Peng

public class HW1 {
    // Here you write the complete code for exercise# 1
    public static void excercise_1_0() {
        System.out.println("I completed all questions and got 90% right in first try");
        System.out.println();
    }
    //Here you write the complete code for exercise# 2
    public static void excercise_1_1() {
        System.out.println("My Eclipse is running perfect and I am able to get started with my homework");
        System.out.println();
    }
    // Here you write the complete code for exercise# 3 v
    public static void excercise_1_3() {
        System.out.println("    J    A     V     V    A");
        System.out.println("    J   A A     V   V    A A");
        System.out.println("J   J  AAAAA     V V    AAAAA");
        System.out.println(" J J  A     A     V    A     A");
        System.out.println();
    }
    // Here you write the complete code for exercise# 4
    public static void excercise_1_5() {
        System.out.println((9.5*4.5-2.5*3)/(45.5-3.5));
        System.out.println();
    }
    // Here you write the complete code for exercise# 5
    public static void excercise_1_9() {
        System.out.println("area = " + 4.5 * 7.9);
        System.out.println("perimeter = " + 2 * (4.5 + 7.9));
        System.out.println();
    }
    // Here you write the complete code for exercise# 6
    public static void excercise_1_11() {
        double num_secs = 365 * 24 * 60 * 60;
        double num_birth = num_secs / 7.0;
        double num_death = num_secs / 13.0;
        double num_immigrant = num_secs / 45.0;
        double num_increase_per_year = num_birth - num_death + num_immigrant;
        double original_population = 312032486;

        for (int i = 1; i <= 5; i++)
            System.out.println("year" +  i + ": " + (original_population + i * num_increase_per_year));
    }
    public static void main(String[] args) {
        excercise_1_0();
        excercise_1_1();
        excercise_1_3();
        excercise_1_5();
        excercise_1_9();
        excercise_1_11();
    }
}


