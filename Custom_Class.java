// Chapter - 8 Introductin to OOPs;

class Employee {
    int id;
    int salory;
    String name;
    public void printDetails(){
        System.out.println("My id is : "+id);
        System.out.println("My name is : "+name);
        System.out.println("My salory is : "+salory);

    }
}
public class Custom_Class {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee vipin =new Employee();
        Employee ravi =new Employee();

        vipin.id=12;
        vipin.name="Vipin Kumar";
        vipin.salory=30000;
        ravi.id=13;
        ravi.name="Ravi Shankar";
        ravi.salory=30000;
        vipin.printDetails();
        ravi.printDetails();
      //  System.out.println(vipin.id);
      //  System.out.println(vipin.name);
    }
    
}
