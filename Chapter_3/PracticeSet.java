// Question:1 What will be  the result of the following expression
// float a = 7/4*9/2


public class PracticeSet{
    public static void main(String[] args){
        float a = 7/4.0f * 9/2.0f;
        System.out.println(a);


// Question:2 Write a java program to encrypt a grade by adding 8 to it. Decrypt it to show the correct grade.
       char grade = '8';
       grade = (char)(grade + 8);
       System.out.println(grade);

    //    Decrypting the grade
    grade = (char) (grade - 8);
    System.out.println(grade);
    
    }
}