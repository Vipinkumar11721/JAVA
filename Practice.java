// Practice Set - 3;

public class Practice {
    public static void main(String[] args) {
        //Problem 1
        String name = "JAIMAHAKAL";
        System.out.println(name.toLowerCase());

        //Problem 2
         String  space = "ram nam dam";
        space = space.replace(" ", "_");
        System.out.println(space);

        //Problem 3
         String letter = "Dear <|name|>,Thanks a lots!";
         System.out.println(letter.replace("<|name|>","vipin"));

         //Problem - 4
         String mystring = "This string contains    double and triple space";
         System.out.println(mystring.indexOf(" "));

         //Problem - 5
         String myletter = "Dear Vipin,\n\t This java course is nice.\nThanks!";
         System.out.println(myletter);
    }
}
