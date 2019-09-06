public class TestLetterGrader {
    public static void main(String[] args) {
        // test if there are two valid arguments, then creates the object
        // if not give right message and exit
        LetterGrader LetterGrader = new LetterGrader(args[0], args[1]);
        // LetterGrader is your main class
        // args[0] has input file name, and args[1] has output file name
        LetterGrader.readScore(); // read score and stores the data in member variables
        LetterGrader.calcLetterGrader(); // determines letter grade and stores information
        LetterGrader.printGrade(); // writes the grade in output file
        LetterGrader.displayAverages(); // displays the averages in console
        LetterGrader.doCleanup(); // use it to close files and other resources

        // remember you need to take care of any errors or exceptions
        // in any of these activities must be taken care of
    }
}
