// Write a program to calculate percentage of a given student in CBSE board exam. His marks from 5 subjects must be taken as input from the keyboard(marks are out of 100).
import java.util.Scanner;

public class Practice1{
    public static void main(String[] args){
           Scanner scanner = new Scanner(System.in);

        //    Array to store the marks of 5 subjects
        int[] marks = new int[5];
        int totalMarks = 0;

        System.out.println("Enter the marks for 5 subjects (out of 100: )");

        // Loop to take input for each subject
        for(int i = 0; i < 5; i++){
            System.out.print("Marks for subject " + (i + 1) + ": ");
            marks[i] = scanner.nextInt();

            // validate the marks are between 0 and 100
            if(marks[i] < 0 || marks[i] > 100){
                System.out.println("Invalid input! marks should be between 0 and 100. Please try again.");
                i--; // Retake the input for the same subject
                continue;
            }

            totalMarks += marks[i];

        }

        // calculate the percentage
        double percentage = (totalMarks / 500.0) * 100;

        // Display the result
        System.out.println("Total Marks: " + totalMarks+ "/500");
        System.out.println("Percentage: " + percentage + "%");

        scanner.close();
    }
}