public class MySqlDatabase implements IDatabase {
   @Override 
   public void add(){
      System.out.println("add Mysql");
   }

   @Override 
   public void delete(){
      System.out.println("delete Mysql");
   }

   @Override
   public void get(){
      System.out.println("get Mysql");
   }

   @Override
   public void update(){
      System.out.println("update Mysql");
   }
}
