public class Factorial {
    public static void main(String[] args) {
        // Problem -> 6
        System.out.println("Problem ->6");
        int n = 7;
        int factorial= 1;
        for(int i=1;i<=n;i++){
            factorial = factorial* i;
        }
          System.out.println(factorial);
 


          //Problem -> 7
          System.out.println("Problem ->7");
          int sum =0;
          int p=7;
          int m =10;
          for(int j= 1; j<=m; j++){
           int  table= p*j;
           sum+=p*j;
           System.out.println("7*i="+table);
          }
           System.out.println("Sum of the table = "+sum);

          

    }
    
}
