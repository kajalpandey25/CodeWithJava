public class StringMethod{
    public static void main(String[] args){
        String name = "Kajal";
        System.out.println(name);
        int value = name.length();
        System.out.println(value);

         String lstring = name.toLowerCase();
        System.out.println(lstring);

         String ustring = name.toUpperCase();
        System.out.println(ustring); 

        String nonTrimmedString = "          Kajal";
        System.out.println(nonTrimmedString);
        System.out.println(nonTrimmedString.trim());  

        System.out.println(name.substring(2));  
        System.out.println(name.substring(1,4));

        System.out.println(name.replace('j', 'p'));  
        System.out.println(name.replace("jal", "ipy"));  

        System.out.println(name.startsWith("Kaj"));
        System.out.println(name.endsWith("al"));  

        System.out.println(name.charAt(1)); 
        System.out.println(name.indexOf("ja"));

    }
}

