// Practice Set - 6;

public class Practice{
    public static void main(String[] args) {
        // Practice Problem - 1 -> Sum the array element
        System.out.println(" // Practice Problem - 1");
        float[] marks = {45.4f,23.54f,56.54f,55.89f};
        float sum = 0;
        for(float element:marks){
        sum = sum+element;
        }
        System.out.println("The value of sum is : "+sum);



         // Practice Problem - 2  -> Check the given no is present in the array or not
         System.out.println(" // Practice Problem - 2");
         float[] data = {45.4f,23.54f,56.54f,55.89f};
        float num = 45.6f;
        boolean isInArray = false;
        for(float element:marks){
        if (num==element){
            isInArray = true;
            break;
        } }
        if(isInArray){
            System.out.println("The values is present in array ");
        }
        else{
            System.out.println("The values is not present in array ");
        }
            
        

         // Practice Problem - 3  ->  Find the average of the array
         System.out.println(" // Practice Problem - 3");
         float[] array = {45.4f,23.54f,56.54f,55.89f};
         float add = 0;
         for(float element:array){
         add = add+element;
         }
         System.out.println("The value of Average is : "+add/array.length);




          // Practice Problem - 4   ->Print and sum the two matrix
          System.out.println(" // Practice Problem - 4");
          int [][] mat1 = {{1,2,3},
                           {4,5,6}};
          int [][] mat2 = {{1,2,3},
                           {4,5,6}};
          int [][] result= {{0,0,0},
                            {0,0,0}};
                            
          for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[i].length;j++){
                System.out.format("Setting value for i%d and j%d\n",i,j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
          }  
          for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[i].length;j++){
                System.out.print(result[i][j]+" ");
                result[i][j] = mat1[i][j] + mat2[i][j];                
            } 
            System.out.println(" "); 
        }


        // Practice Problem - 5  -> Recerse the array element
        System.out.println(" // Practice Problem - 5");
        int [] A = {55,67,47,37,28,37};
        for(int i =A.length -1;i>=0;i--){
        System.out.println(A[i]);
        }



         // Practice Problem - 6  -> Print maximum element from the array element
         System.out.println(" // Practice Problem - 6");
         int [] B = {55,67,47,37,28,37};
         int max =0;
         for(int e:B){
            if(e>max){
                max = e;
            }
         }
         System.out.println("The value of the maximum element in the array is:"+max);
         
         
        
      // Practice Problem - 7  -> Print minimum element from the array element
      System.out.println(" // Practice Problem - 7");
      int [] C = {55,67,47,37,28,37};
      int min =0;
      for(int e:C){
         if(e>min){
             min = e;
         }
      }
      System.out.println("The value of the minimum element in the array is:"+min);
      System.out.println(Integer.MIN_VALUE);
      System.out.println(Integer.MAX_VALUE);



       // Practice Problem - 8  -> Check the array is sorted or not 
       System.out.println(" // Practice Problem - 8");
       boolean isSorted =true;
       int [] D = {1,2,3,4,5};
       for(int i = 0; i<D.length-1;i++){
            if(D[i]>D[i+1]){
            isSorted = false;
            break;
            }
        }
        if(isSorted){
            System.out.println("The array is sorted ");
        } 
        else{
            System.out.println("Array is not sorted ");
        }

    }

}
    

