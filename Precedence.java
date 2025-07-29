//Chaptre - 2  Operators & Expressions;
//lecture-2  Precedence & Asociativity

import java.util.*;
public class Precedence {
    public static void main(String[] args) {
        //Presedence & Asociativity
       // int a =6*5-34/2;
        /*
         * highest Precedence goes to * and /.They are then evaluated  on the basis of left to right associativity
         * =30-34/2
         * =30-17
         * =13
         */
       // int b =60/5 -34*2;
        /*
         * 12-34*2
         * 12-68
         * -56
         */
       // System.out.println(a);
        //System.out.println(b);
        

        //Quies 
        int x = 6;
        int y = 3;
        int z = 4;
        int k = x*y/z/2;
       int s= x*x - (4*y*z)/(2*y);
        System.out.println(k);
        System.out.println(s);
    }
}
