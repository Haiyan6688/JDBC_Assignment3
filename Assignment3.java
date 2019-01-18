import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class Assignment3 {

   public static Connection getConnection() throws Exception{
   try{
     String url = "jdbc:mysql://localhost:3306/sqlandjava";
     String username = "user";
     String password = "password";

     Connection conn = DriverManager.getConnection(url,username,password);
     System.out.println("Connected to database!");
     return conn;
   } catch(Exception e){System.out.println(e);}
   return null;
   }

  public static void main(String[] args) throws Exception{
    // Get connection;
    getConnection();
    Connection conn = getConnection();

    //
    Statement statement = conn.createStatement();

    //Execute SQL Query
    ResultSet res = statement.executeQuery("SELECT sqlangjava.owners.*, " +
         "sqlandjava.people.*, sqlandjava.cars.* FROM sqlandjava.owners " +
         "LEFT JOIN sqlandjava.people ON sqlandjava.owners.person_id " +
         "= sqlandjava.people.person_id LEFT JOIN sqlandjava.cars ON " +
         "sqlandjava.owners.cars_id = sqlandjava.cars.car_id");

    //Process
    while(res.next()){
      System.out.println(res.getString("owner_id") + ": " +
                         res.getString("firstname") + " " +
                         res.getString("lastname") + " " +
                         "owns an " +
                         res.getString("brand") + " of "+
                         res.getString("color") + " color ");
    }
  }
}
