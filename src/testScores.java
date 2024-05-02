import java.util.Random;
import java.util.Scanner;

public class testScores {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scnr = new Scanner(System.in);

//        final int size = rand.nextInt(5);
        final int size = rand.nextInt(8) + 3;
        int input;

        int[] testScores = new int[size];
        char[] letterGrade = new char[size];

        System.out.println("Enter your " + size + " test scores");

        for (int i = 0; i < size; i++) {
            System.out.println("Enter test " + (i+1) + " score");
            input = scnr.nextInt();
            testScores[i] = input;
        }
        for (int i = 0; i < testScores.length; i++) {
            char grade = getLetterGrade(testScores, i);
            letterGrade[i] = grade;
        }
        printGrades(testScores, letterGrade);
        printHighestScore(testScores);
        printLowestScore(testScores);
        printAverageScore(testScores);
    }
    public  static char getLetterGrade(int[] scores, int index){
        if (scores[index] >= 90) {
            return 'A';
        } else if (scores[index] >= 80) {
            return 'B';
        } else if (scores[index] >= 70) {
            return 'C';
        } else if (scores[index] >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
    public static void printGrades(int[] scores, char[] grade){
        System.out.printf("%s %10s \n", "Score", "Grade");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%4d %10c \n", scores[i], grade[i]);
        }
    }
    public  static void printHighestScore(int[] scores){
        int highestScore = scores[0];
        for (int j = 0; j < scores.length; j++) {
            if (scores[j] > highestScore ) {
                highestScore = scores[j];
            }
        }
        System.out.println("The highest score is " + highestScore);
    }
    public  static void printLowestScore(int[] scores){
        int lowestScore = scores[0];
        for (int j = 0; j < scores.length; j++) {
            if (scores[j] < lowestScore ) {
                lowestScore = scores[j];
            }
        }
        System.out.println("The lowest score is " + lowestScore);
    }

    public static void printAverageScore(int[] scores){
        int sum = 0;
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        double average = (double) sum / scores.length;
        System.out.printf("Average score is %.2f ", average);
    }
}
