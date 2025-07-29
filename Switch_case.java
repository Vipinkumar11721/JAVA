
import java.util.*;
public class Switch_case {
    public static void main(String[] args) {
        int age;
        System.out.print("Enter Your Age :");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        switch (age) {
                case 20:
                System.out.println("You are going to become an new adult.");
                break;
                case 25:
                System.out.println("You are going to become an semi adult.");
                break;
                case 30:
                System.out.println("You are going to become an adult.");
                break;
                case 35:
                System.out.println("You are going to become an semi old adult.");
                break;
                case 40:
                System.out.println("You are going to become an old adult.");
                break;
        
                default:
                System.out.println("Enjoy your life.");
                break;
        }
        
    }
    
}
