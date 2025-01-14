// Q.1 -> Write a program to sum three numbers in java.
// Q.2 -> Write a program to calculate CGPA using marks of three subjects (out of 100)
//  Q.3 -> Write a java program which asks a user to enter his/her name and greet them with "Hello <name> , have a good day" text.
// Q.4 -> Write a java program to convert kilometers to miles.
// Q.5 -> write a java program to detect whether a number entered by the user is integer or not. 

import java.util.Scanner;
public class Practice2{
    public static void main(String[] args){
    //   Question 1
      int a = 4;
      int b = 7;
      int c = 6;
      int sum = a + b + c;
      System.out.println(sum);

    //   Question 2
        float subject1 = 45;
        float subject2 = 95;
        float subject3 = 48;
        float cgpa = (subject1 + subject2 + subject3)/30;
        System.out.println(cgpa);

        // Question 3

        System.out.println("What is your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello " + name + " have a good day!");


        //  Question 4

         // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the distance in kilometers
        System.out.print("Enter distance in kilometers: ");
        double kilometers = scanner.nextDouble();

        // Conversion factor
        double conversionFactor = 0.621371;

        // Convert kilometers to miles
        double miles = kilometers * conversionFactor;

        // Display the result
        System.out.println(kilometers + " kilometers is equal to " + miles + " miles.");

        // Close the scanner
        scanner.close();


        // Question 5

         System.out.println("Enter your number");
         Scanner sc = new Scanner(System.in);
        System.out.println(sc.hasNextInt());



    }
}      