public class MySqlDatabase implements IDatabase {
   @Override 
   public void add(){
      System.out.println("add the Mysql database");
   }

   @Override 
   public void delete(){
      System.out.println("delete the Mysql database");
   }
   @Override
   public void get(){
      System.out.println("get the Mysql database");
   }
   @Override
   public void update(){
      System.out.println("update the Mysql database");
   }
}