// Chapter - 9 Access Modifire & Constructors;


class MyEmployee{
   int id;
   String name;
 
   public String getName(){
    return name;
   }
   public void setName(String n){
    this.name = n;
   }
   public int getId(){
    return id;
   }
   public int setId(int i){
    this.id = i;
   }

}
public class Ch_9 {
    public static void main(String[] args) {
        MyEmployee vip = new MyEmployee();
        vip.id =10;
        vip.name = "Vipin Kumar";
        System.out.println(vip.id);
        System.out.println(vip.name);

       // vip.setName("Vipin kumar");
       // vip.setId(245);
       // System.out.println(vip.getId() );
       // System.out.println(vip.getName());
      
    
    }
    
}
