public class Break {
    public static void main(String[] args) {
        //Break using loops
        // Using for loop  
        System.out.println(" ** Using for loop");
        for (int i = 0; i<5; i++){
            System.out.println(i);
            System.out.println("java is great");
            if (i==2){
                System.out.println("Ending the loop");
                break;
            }
        }
        System.out.println("Loop End Hear");
    
    // Using While loop
    System.out.println(" **Using While loop");
        int i = 0;
        while (i<5) {
            System.out.println(i);
            System.out.println("Java is great");
            if (i==2){
                System.out.println("Ending the loop");
                break;
            }
            i++;
        }
        System.out.println("loop end hear");



         // Using  do While loop
    System.out.println(" ** Using do while loop");
    int j = 0;
    do {
        System.out.println(i);
        System.out.println("Java is great");
        if (i==2){
            System.out.println("Ending the loop");
            break;
        }
        i++;
    }while(j<5);
    System.out.println("loop end hear");
    }

    
}
