public class Strings_2p {
    public static void main(String[] args) {
        String name = "Vipin kumar";

        System.out.println(name);
        int value = name.length();
        System.out.println(value);
        String lstring = name.toLowerCase();
        System.out.println(lstring);
        String uString = name.toUpperCase();
        System.out.println(uString);
        String trim = name.trim();
        System.out.println(trim);

        System.out.println(name.substring(4));

        System.out.println(name.substring(1,6));

        System.out.println(name.replace("V","v"));

        System.out.println(name.startsWith("V"));

        System.out.println(name.endsWith("k"));

        System.out.println(name.charAt(3));

        System.out.println(name.indexOf("r"));

        String modifiedName ="harrryrry";
        System.out.println(modifiedName.indexOf("rry"));
        System.out.println(modifiedName.lastIndexOf("y"));

        System.out.println(modifiedName.equals("Harrryrry"));
        System.out.println(modifiedName.equalsIgnoreCase("harryrry"));


        System.out.println("I am escape secquence \n double quote");
        System.out.println("I am escape secquence \t double quote");
        System.out.println("I am escape secquence \\ double quote");
        System.out.println("I am escape secquence \t double quote");
    }
    
    
    //String a1 = new String()
    
}
