//Practice set 5;

import java.util.*;
public class Pattern {
    public static void main(String[] args) {
        // Problem -> 1
        System.out.println("** Problem ->1");
        int n = 5;
        for(int i = n; i>0; i--){
            for(int j = 0; j<i;j++){
                System.out.print("*");   
            }
            System.out.print("\n");
        }
         System.out.println();
         System.out.println();
         System.out.println();

        // Problem ->2
        System.out.println("** Problem ->2");
        int sum = 0;
        int m = 4;
        for(int i = 1;i<m;i++){
            sum = sum + (2*i);
        }
            System.out.print("Sum of even numbers is: ");
            System.out.print(sum);
        
    
           System.out.println();
           System.out.println();
           System.out.println();
           
           //  Problem ->3

           System.out.println("Problem ->3");
           Scanner sc = new Scanner(System.in);
           System.out.print("Enter the value of x: ");
           int x =sc.nextInt();
           System.out.println("The table of given no. by the user: ");
          int k=0;
          int table =0;
          for(k=1;k<=10;k++){
            table= x*k;
            System.out.println(table);
          
          }
           // System.out.println("The table of given no. by the user: ");
           // System.out.println(table);
        
           
           System.out.println();
           System.out.println();
           System.out.println();
    
    
        // Problem ->4
        System.out.println(" ** Problem ->4");
        Scanner A = new Scanner(System.in);
        System.out.print("Enter the value of x: ");
        int y =A.nextInt();
        System.out.println("The reverse table of given no. by the user: ");
       int l=10;
       int table_of =0;
       for(l=10;l>=1;l--){
         table_of= y*l;
         System.out.println(table_of);
       
       }

       // Problem ->5
       System.out.println("Problem ->5");
       Scanner B = new Scanner(System.in);
       System.out.print("Enter the value of z: ");
       int z =sc.nextInt();
       System.out.println("The factorial of given no. by the user: ");
       int p=1;
       int factorial =1;
       while (p<=z) {
       factorial *=p;
       p++;
        
      }
        System.out.println(factorial);
      
      
       
    }

    
}
