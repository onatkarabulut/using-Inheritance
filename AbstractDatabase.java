public abstract class AbstractDatabase {
   
   public void add(){
      System.out.println("Added...");
   }
   
   public void delete(){
      System.out.println("Deleted...");
   }

   abstract void update();
   abstract void get();
   
}
