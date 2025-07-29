//import java.util.Scanner;
import java.util.Scanner;
public class CHW_5_taking_input {
    public static void main(String[] args) {
        System.out.println("Taking input from the User");
        Scanner sc = new Scanner(System.in);
       //int a =sc.nextInt();
        System.out.println("Enter number 1");
       // int a =sc.nextInt();
        float c =sc.nextFloat();
        System.out.println("Enter number 2");
       // int b =sc.nextInt();
        float d =sc.nextFloat();
       // int sum = a+b;
        float add = c+d;
        System.out.println("The sum of these number is");
       // System.out.println(sum);
        System.out.println(add);
        boolean b1 =sc.hasNext();
        System.out.println(b1);
        String str =sc.nextLine();
        System.out.println(str);
    }
    
}
