public class MySqlDatabase extends AbstractDatabase{

   @Override
   void get() {
      System.out.println("MySql updated...");
   }

   @Override
   void update() {
      System.out.println("MySql got data...");
   }
   
}