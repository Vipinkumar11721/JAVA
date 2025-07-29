//Practice Set - 7;

public class Table {
    static void multiplication(int n){
        n=5;
        for(int i =1;i<=10;i++){
            System.out.format("%d X %d = %d\n",n,i,n*i);
        }
    }
    static void pattern1(int n){
     for(int i=0;i<n;i++){
        for(int j=0;j<i+1;j++){
            System.out.print("*");
        }
        System.out.println();
     }
    }

    static int sumRect(int n){
    
        if(n==1){
            return 1;
        }
        return n+ sumRect(n-1);
    }

    static void pattern2(int n){
        for(int i =0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    static int fib(int n){
        
        if(n==1){
            return 0;
        }
        else if (n==2) {
            return 1;
        }
        else{
            return fib(n-1)+ fib(n-2);
        }
    }


    static void pattern1_rec(int n){
        if(n>0){
            pattern1_rec(n-1);
            for(int i=0; i<n;i++){
                for(int j =0;j<n-i;j++)
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        //Problem -> 1 Tables
        System.out.println("//Problem -> 1 Tables");
        multiplication(7);
       
        //Problem -> 2 Patterns
        System.out.println("//Problem -> 2 Patterns");
          pattern1(5);

          //Problem -> 3 Sum
          System.out.println("//Problem -> 3 Sum of first n number");
          int C =sumRect(4);
          System.out.println(C);


          //Problem -> 4 Pattern
          System.out.println("//Problem -> 4 Patterns");
          pattern2(5);


           //Problem -> 5 Fibonacci  Serice
           System.out.println("//Problem -> 5 Fibonacci Series");
           int result = fib(7);
           System.out.println(result);

        


           //Problem -> 6 Pattern
          System.out.println("//Problem -> 4 Patterns");
          pattern1_rec(3);
    }

    
}
