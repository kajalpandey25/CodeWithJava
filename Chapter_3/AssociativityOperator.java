public class AssociativityOperator{
    public static void main(String[] args){
         // Precedence & Associativity
        int a =  6*5-34/2;
        /*
        Highest precedence goes to * and /. They are then evaluated on the basis of left to right associativity.
        = 30-34/2
        =30-17
        =13
        */
        int b = 60/5-34*2;
        /*
           = 12-34*2
           = 12-68
           = -54
        */
        System.out.println(a);
        System.out.println(b);

        // Quick Quiz

        //  int x = 6;
        //  int y = 1;
        // int k = x * y/2;

        int x = 5;
        int y = 1;
        int z = 4;
        int k = y*y - (4*x*z)/(2*x);
         System.out.println(k);
    }
}