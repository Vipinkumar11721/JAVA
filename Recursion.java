public class Recursion {
    
        //factorial(n)=n*n-1*....1
        //factorial(5)=5*4*3*2*1=120
        //factorial(0)=1
        static int factorial(int n){
         if(n==0||n==1){
            return 1;

         }
        // else{
          //  return n * factorial(n-1);
        // }
        else{
            int Product = 1;
            for(int i=1;i<=n;i++){
                Product *= i;
            }
            return Product;
        }

    }
    public static void main(String[] args) {
        int x = 5;
        System.out.println("The value of Factorial n is:"+factorial(x));
        System.out.println("The value of Factorial n is:"+factorial(x));
        
    }
    
}
