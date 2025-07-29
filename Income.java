// Problem ->1
import java.util.*;
public class Income {
    public static void main(String[] args) {
        int income ;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Income Tax value = ");
        income = sc.nextInt();
        if(income >=250000 && income<=500000){
            System.out.println("Tax is 5%");
        }
        else if (income>=500000 && income<=1000000) {
            
            System.out.println("Tax is 20%");
        } else if(income>=1000000) {
            System.out.println("Tax is 30%");
            
        }else{
            System.out.println("Tax is more than 30%");
        }
    }
    
}
