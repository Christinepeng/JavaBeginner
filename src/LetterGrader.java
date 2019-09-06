import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.io.Writer;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.FileOutputStream;
import java.util.Collections;
import java.util.Scanner;

import static java.lang.Math.max;
import static java.lang.Math.min;

public class LetterGrader {
    String inputFileName;
    String outputFileName;
    ArrayList<String> names;
    ArrayList<ArrayList<Double>> scores;
    ArrayList<Character> finalScore;
    final double[] weights = new double[] {0.1, 0.1, 0.1, 0.1, 0.2, 0.15, 0.25};
    ArrayList<String> nameGrade;
    ArrayList<Integer> nameLength;


    LetterGrader(String inputFileName, String outputFileName) {
        this.inputFileName = inputFileName;
        this.outputFileName = outputFileName;
        scores = new ArrayList<>();
        names = new ArrayList<>();
        finalScore = new ArrayList<>();
        nameGrade = new ArrayList<>();
        nameLength = new ArrayList<>();
    }

    void readScore() {
        File file = new File(inputFileName);
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                String[] scoreOfOnePerson = line.split(",");
                names.add(scoreOfOnePerson[0]);
                nameLength.add(scoreOfOnePerson[0].length());

                ArrayList<Double> score = new ArrayList<>();
                for (int j = 0; j < 7; j++) {
                    score.add(Double.valueOf(scoreOfOnePerson[j+1]));
                }
                scores.add(score);
            }
        } catch (IOException e) {
            System.err.println(e);
            return;
        }
    }

    void calcLetterGrader() {
        char grade = ' ';
        for (int i = 0; i < names.size(); i++) {
            double sum = 0;
            for (int j = 0; j < 7; j++) {
                sum += scores.get(i).get(j) * weights[j];
                if (sum >= 90) {
                    grade = 'A';
                } else if (90 > sum && sum >= 80) {
                    grade = 'B';
                } else if (80 > sum && sum >= 70) {
                    grade = 'C';
                } else if (70 > sum && sum >= 60) {
                    grade = 'D';
                } else {
                    grade = 'F';
                }
            }
            finalScore.add(grade);
        }
        int max = Collections.max(nameLength);
        for (int i = 0; i < names.size();i++) {
            int spaceSize = max - nameLength.get(i);
            String spaces = new String(new char[spaceSize]).replace("\0", " ");
            nameGrade.add(names.get(i) + ":" + spaces + "\t\t" + finalScore.get(i));
        }
        Collections.sort(nameGrade);
    }

    void printGrade() {
        Writer writer = null;

        try {
            writer = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(outputFileName), "utf-8"));
            writer.write("Letter grade for " + names.size() + " of students given in " + inputFileName + " file is:\n");
            writer.write('\n');
            for (String str: nameGrade) {
                writer.write(str);
                writer.write('\n');
            }
        } catch (IOException ex) {
            // Report
        } finally {
            try {writer.close();} catch (Exception ex) {/*ignore*/}
        }
        System.out.println("Letter grades has been calculated for students listed in the input data file " +
                inputFileName + " and outputted in the output file " + outputFileName);

    }

    void displayAverages() {
        System.out.println("\nHere is the class averages:");
        System.out.println("\t\t\tQ1\t\tQ2\t\tQ3\t\tQ4\t\tMidI\tMidII\tFinal");  // title

        double[][] scoresInfo = new double[3][7];
        for (int j = 0; j < 7; j++) {
            scoresInfo[1][j] = Double.MAX_VALUE;

            for (int i = 0; i < names.size(); i++) {
                Double value = scores.get(i).get(j);

                // calculate summation
                scoresInfo[0][j] += value;

                // calculate min
                scoresInfo[1][j] = min(scoresInfo[1][j], value);

                // calculate max
                scoresInfo[2][j] = max(scoresInfo[2][j], value);
            }

            // calculate average
            scoresInfo[0][j] /= names.size();
        }

        System.out.print("Average:");
        for (int j = 0; j < 7; j++) {
            System.out.print("\t" + new DecimalFormat("#0.00").format(scoresInfo[0][j]));
        }
        System.out.println();

        System.out.print("Minimum:");
        for (int j = 0; j < 7; j++) {
            System.out.print("\t");
            System.out.print((int)scoresInfo[1][j]);
            System.out.print("\t");
        }
        System.out.println();

        System.out.print("Maximum:");
        for (int j = 0; j < 7; j++) {
            System.out.print("\t");
            System.out.print((int)scoresInfo[2][j]);
            System.out.print("\t");
        }
        System.out.println("\n");

        System.out.println("Press ENTER to continue...");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }

    void doCleanup() {

    }

}
