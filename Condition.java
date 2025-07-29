// Chapter - 4 Conditionals in java;

public class Condition {
    public static void main(String[] args) {
        //Problem - 1
        int age = 18;
        if (age==18){
            System.out.println("Yes you can drive");
        }
        else{
            System.out.println("No You can not Drive");
        }

        //Problem - 2
        int b = 15;
        boolean cond = (b == 18);
        if (cond) {
            System.out.println("You can Drive");
        }
        else{
            System.out.println("you can not Drive");
        }

        //Problem - 3
        boolean a = true;
        boolean c = false;
        boolean d = true;
        if (a&&c&&d) {
            System.out.println("y");
        }
        else{
            System.out.println("N");
        }

        //Problem - 4
        boolean e = true;
        boolean f = false;
        boolean g = true;
        if (e||f||g) {
            System.out.println("y");
        }
        else{
            System.out.println("N");
        }
        

        
    }
    
}
