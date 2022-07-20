
class DatabaseManager{

   public void AddDatabase(IDatabase database){
      database.add();
   }

   public void UpdateDatabase(IDatabase database){
      database.update();
   }


   public void GetDatabase(IDatabase database){
      database.get();
   }


   public void DeleteDatabase(IDatabase database){
      database.delete();
   }

}



public class Main {
   public static void main(String[] args) {
      DatabaseManager manager = new DatabaseManager();
      manager.AddDatabase(new MongoDatabase());
   }
}