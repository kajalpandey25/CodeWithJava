import java.util.Scanner;

public class Strings{
    public static void main(String[] args){
        // String name = new String("Kajal");
        // String name = "Kajal";
        System.out.println("The name is: ");
        System.out.println(name);

        int a = 6;
        float b = 5.6454f;
        System.out.printf("The value of a is %d and value of b is %f", a,b);

        Scanner sc = new Scanner(System.in);
        // String st = sc.next(); // only take the first word
        String st = sc.nextLine(); 
        System.out.println(st);
    }
}