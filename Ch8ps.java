// Practice Set - 8;


 //Problem ->1
class Employee{
    int salory;
    String name;

    public int getSalory(){
        return salory;
    }
    public String getname(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}

 //Problem ->2
class Cellphone{
    public void ringing(){
        System.out.println("Ringing....");
    }
    public void vibrating(){
        System.out.println("Vibrating....");
    }
    public void callfriend(){
        System.out.println("Calling Ravi....");
    }
}


 //Problem ->3
 class Square {
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
    
 }


  //Problem ->4
  class Rectangle{
    int length;
    int wiedth;
    public int area(){
        return length*wiedth;
    }
    public int perimeter(){
        return 2*(length+wiedth);
    }
  } 


   //Problem ->5
   class Tommy {
      public void hit(){
        System.out.println("Hitting the enemy");
      }
      public void run(){
        System.out.println("Running the enemy");
      }
      public void fire(){
        System.out.println("Firing the enemy");
      }
    
   }


   //Problem ->6
   class Circle{
    double Radious;
    public double area(){
        return 3.14*(Radious*Radious);
    }
    public double perimeter(){
        return 2*(3.14*Radious);
    }
   }
public class Ch8ps {
    public static void main(String[] args) {
        //Problem -> 1
        System.out.println(" //Problem -> 1");
        Employee vipin = new Employee();
        vipin.setName("Vipin Kumar");
        vipin.salory = 2000;
        System.out.println(vipin.getSalory());
        System.out.println(vipin.getname());


        //Problem ->2
        System.out.println(" //Problem -> 2");
        Cellphone asus = new Cellphone();
        asus.callfriend();
        asus.ringing();
        asus.vibrating();



         //Problem ->3
         System.out.println(" //Problem -> 3");
         Square sc = new Square();
         sc.side = 12;
         System.out.println("Area of Square : "+sc.area());
         System.out.println("Perimeter of Square : "+sc.perimeter());

        

          //Problem ->4
          System.out.println(" //Problem -> 4");
          Rectangle re = new Rectangle();
          re.length = 5;
          re.wiedth = 6;
          System.out.println("Area of Rectangle : "+re.area());
          System.out.println("Perimeter of Rectangle : "+re.perimeter());



           //Problem ->5
           System.out.println(" //Problem -> 5");
           Tommy to = new Tommy();
           to.hit();
           to.run();
           to.run();


           //Problem ->6
           System.out.println(" //Problem -> 6");
           Circle cr = new Circle();
           cr.Radious =3;
           System.out.println("Area of Circle : "+cr.area());
           System.out.println("Perimeter of Circle : "+cr.perimeter());

    }
    
}
