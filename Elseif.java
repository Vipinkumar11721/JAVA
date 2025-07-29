

import java.util.Scanner;
public class Elseif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age:");
         int  age = sc.nextInt();
        //int age = 56;
        if(age>56){
            System.out.println("You are experienced");

        }
        else if(age>40){
            System.out.println("you are semi experienced");

        }
        else if(age>36){
            System.out.println("you are semi semi experienced");

        }
        else{
            System.out.println("You are not experienced");
        }
    }
    
}
