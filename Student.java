//Problem - 2
import java.util.*;
public class Student {
    public static void main(String[] args) {
        Float percentage;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the no of Sub-1:");
        Float Sub_1 = sc.nextFloat();
        System.out.print("Enter the no of Sub-2:");
        Float Sub_2 = sc.nextFloat();
        System.out.print("Enter the no of Sub-3:");
        Float Sub_3 = sc.nextFloat();
        percentage = ((Sub_1+Sub_2+Sub_3)/3);
        System.out.println(percentage +"%");

       // int result;
        if(percentage >=44 && Sub_1>33 && Sub_2>33 && Sub_3>33){
           System.out.println("Student pass");
        }
        else{
          System.out.println("Student is fail");
        }
    }
    
}
