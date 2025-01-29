// Question:1 Write a java program to convert a string to lowercase.
// Question:2 Write a java program to replace spaces with underscores.
// Question:3 Write a java program to fill letter template which looks like below:
//   letter = "Dear <|name|>, Thanks a lot"
// Replace <|name|> with a String (some name)
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
  }
}