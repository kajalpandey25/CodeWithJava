// Q.1 -> Write a program to sum three numbers in java.
// Q.2 -> Write a program to calculate CGPA using marks of three subjects (out of 100)
//  Q.3 -> Write a java program which asks a user to enter his/her name and greet them with "Hello <name> , have a good day" text.

import java.util.Scanner;
public class Practice2{
    public static void main(String[] args){
    //   Question 1
    //   int a = 4;
    //   int b = 7;
    //   int c = 6;
    //   int sum = a + b + c;
    //   System.out.println(sum);

    //   Question 2
        // float subject1 = 45;
        // float subject2 = 95;
        // float subject3 = 48;
        // float cgpa = (subject1 + subject2 + subject3)/30;
        // System.out.println(cgpa);

        // Question 3

        System.out.println("What is your name");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("Hello " + name + " have a good day!");

    }
}      