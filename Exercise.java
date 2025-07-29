// Question - 1] Write a java Program to calculate percentage of a given student in CBSE board exam .His marks from 5 subjects must be take as input from the keyboard(Marks are out of 100).

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Hindi - ");
        int H =sc.nextInt();
        System.out.print("English - ");
        int E =sc.nextInt();
        System.out.print("Maths - ");
        int M =sc.nextInt();
        System.out.print("Science - ");
        int S =sc.nextInt();
        System.out.print("Computer - ");
        int C =sc.nextInt();
        System.out.print("Percentage of totalmarks = ");
        float p = ((H+E+M+S+C)/5);
        System.out.print(p +"%");
    }
    
    
}




//Question - 2] Write a java Program to add three number?
/*public class Exercise {
    public static void main(String[] args) {
        int a =56;
        int b = 55;
        int c = 67;
        int sum =a+b+c;
        System.out.println("Sum of three number = " +sum);
    }
}*/

//Question - 3] Write a java program to find the CGPA of three subjects?
/*public class Exercise {
    public static void main(String[] args) {
      
        float subject1 = 45;
        float subject2 = 95;
        float subject3 = 48;
        float CGPA = (subject1+subject2+subject3)/30;
        
        System.out.println(CGPA);
    }
}*/


//Question - 4] Write a java program to print user name which is given by the user?

/*import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");
        String name = sc.next();
        System.out.println( "Hello " + name + "  Have a good day");
    }
}*/

//Question - 5] Write a java Program to converts Kilo Meters into Mile?
/*import java.util.*;
public class Exercise {
    public static void main(String[] args) {
        System.out.println("Kilometer to Miles Convertor");
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the Value of Kilometer = ");
    double KM = sc.nextInt();
    double miles = ((KM)/1.609);
    System.out.print("Miles = "+miles);
    }
}*/


//Question - 6] Write a java Program to check the given no is integer or not the no. which is given by the userimport java.util.*;

/*import java.util.*;

public class Exercise {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter the value of a = ");
      double a = sc.nextDouble(); 
      if (a%1==0) {
        System.out.println("Value is integer");
        
      }
      else
     { 
      System.out.println("Value is not integer");
    }

    }
}*/



//Question - 6] Write a java Program to