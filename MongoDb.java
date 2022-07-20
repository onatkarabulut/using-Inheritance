public class MongoDb extends AbstractDatabase {

   @Override
   public void get(){
      System.out.println("Mongo got data...");
   }
   @Override
   public void update(){
      System.out.println("Mongo updated...");
   }

}
