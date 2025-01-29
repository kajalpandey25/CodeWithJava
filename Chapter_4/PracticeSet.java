// Question:1 Write a java program to convert a string to lowercase.
// Question:2 Write a java program to replace spaces with underscores.
// Question:3 Write a java program to fill letter template which looks like below:
//   letter = "Dear <|name|>, Thanks a lot"
// Replace <|name|> with a String (some name)
// Question:4 Write a java program to detect double and triple spaces in a string
// Question:5 Write a program to format the following letter using escape sequence characters.
//  letter = "Dear Kajal, This java course is nice. Thanks"
public class PracticeSet{
    public static void main(String[] args){
        // Problem 1
        String name = "Jack Parker";
        name = name.toLowerCase();
        System.out.println(name);

        // Problem 2
    String text = "To Lower Case";
    text = text.replace(" ", "_");
    System.out.println(text);

     // Problem 3
    String letter = "Dear <|name|>, Thanks a lot!";
    letter = letter.replace("<|name|>", "Kajal");
    System.out.println(letter);

    // Problem 4
    String myString = "This string contains double and  triple spaces";
    System.out.println(myString.indexOf(" "));
    System.out.println(myString.indexOf("   "));

    // Problem 5
     String myLetter = "Dear Kajal, \n\tThis Java Course is Nice. \n\tThanks!";
     System.out.println(myLetter);
  }
}