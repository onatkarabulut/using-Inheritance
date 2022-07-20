
public class Main {

   public static void main(String[] args) {

      AbstractDatabase abstractDatabase1 = new MySqlDatabase();
      AbstractDatabase abstractDatabase2 = new MongoDb();

      abstractDatabase1.update();
      abstractDatabase2.add();

   }

}
