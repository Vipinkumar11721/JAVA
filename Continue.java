public class Continue {
    public static void main(String[] args) {

        //Using for loop
        System.out.println("Using for loop");
        for (int i = 0; i<50; i++){
            if (i==2) {
                System.out.println("Ending the loop");
                continue;
            
            }
            System.out.println(i);
            System.out.println("Java is great");
        }

        //Using while loop
    /*     System.out.println("Using while loop");
        int j = 0;
      while ( j<50){
            if (j==50)
            {
               System.out.println("Ending the loop");
                continue;
    
            }
            j++;
            System.out.println(j);
            System.out.println("Java is great");
        }*/
    
      //Using do while loop
      System.out.println("Using do while loop");
      int k = 0;
      do{
        k++;
          if (k==2) {
              System.out.println("Ending the loop");
              continue;
          }
          System.out.println(k);
          System.out.println("Java is great");
        }while(k<5);
        System.out.println("loops end here");

    }

    
}
