// Practice set 4;
// Problem ->3
import java.util.*;
public class Exercise_4_th{
    public static void main(String[] args) {
 /*        int a = 10;
        if(a==10){
            System.out.println("I am 10");
        }
        else{
            System.out.println("i am not 10");
        }*/



      //  Problem -> 4
  /*    Scanner sc = new Scanner(System.in);
     System.out.print("Enter the Case no.:");
     int day = sc.nextInt();

     switch (day) {
        case 1 -> System.out.println("Monday");
        case 2 -> System.out.println("Tuesday");
        case 3 -> System.out.println("Wednusday");
        case 4 -> System.out.println("Thursday");
        case 5 -> System.out.println("Friday");
        case 6 -> System.out.println("Saturday");
        case 7 -> System.out.println("Sunday");
        
     }
*/

    //Problem -> 5

 /*     Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Year : ");
    int year = sc.nextInt();
    if(year%4==0){
     System.out.println("The Year is Leap year.");
    }
    else{
        System.out.println("The Year is not a Leap Year");
    }
        */


      // Problem 6



    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Website Url : ");
    String website = sc.next();
    if(website.endsWith(".org") ){
        System.out.println("This is an Oraganizational Website.");
    }
    else if(website.endsWith(".com") ){
        System.out.println("This is an Comercial Website.");
    }
    else if(website.endsWith(".in") ){
        System.out.println("This is an Indian Website.");
    }

    }
    
}
