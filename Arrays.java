// Chapter - 6 Arrays;

public class Arrays {
    public static void main(String[] args) {
        // Classroom of 500 students
        /*
        You have 2 option
        1. Create 500 vaariable
        2. Use array(recommended)
         */ 
        //There are three main way to create an array in java
        
        // 1. Declaration & then memory allocation
         int [] marks;    //Declaration
        marks = new int[5];    //Memory allocation
        //Initialization
        marks[0] =100;
        marks[1]=78;
        marks[2]=86;
        marks[3]=67;
        marks[4]=67;
    
        System.out.println(marks[4]);


                // 2. Declaration & memory allocation
                int [] name = new int[5];
                System.out.println(name);
        
        // 3. Declaration ,memory allocation and initialization together
        int [] data ={100,70,80,71,98};
          System.out.println(data[4]);
          System.out.println(data.length);


          //Floting no use in array
          System.out.println("//Floting no use in array");
          float[] rank = {44.5f,74.09f,78.6f,75.34f};
          System.out.println("The no of particular order = "+rank[3]);
          System.out.println("Rank of length = "+rank.length);



          // String use  in array
          System.out.println("// String use  in array");
          String[] names = {"vipin","ram","shyam","mohan"};
          System.out.println("Name length = "+names.length);
          System.out.println("Name of given order = "+names[3]);



          //Displaying the array(naive way)
          System.out.println("//Displaying the array(naive way)");
          System.out.println(names[0]);
          System.out.println(names[1]);
          System.out.println(names[2]);
          System.out.println(names[3]);


          //Displaying the array (for loop)
          System.out.println("//Displaying the array (for loop)");
          for(int i =0;i<names.length;i++){
            System.out.println(names[i]);
          }

          
          //Displaying the array in reverse order (for loop)
          System.out.println("//Displaying the array in reverseorder ");
          for(int i =names.length -1;i>=0;i--){
            System.out.println(names[i]);
          }


          //Displaying the array using for-each loop
          System.out.println("//Displaying the array using for-each loop ");
          for(int element: marks){
            System.out.println(element);
          }



          


    }
    
}
