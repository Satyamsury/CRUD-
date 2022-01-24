##Delete student data from Student table
package CRUD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Deletes { 
   static final String DB_URL = "jdbc:mysql://localhost/assingment";
   static final String USER = "root";
   static final String PASS = "Sa1Ty9Am99";
   static final String QUERY = "SELECT id, name FROM assingment";

   public static void main(String[] args) {
      // Open a connection
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
      ) {		      
         String sql = "DELETE FROM assingment " +
            "WHERE id = 401";
         stmt.executeUpdate(sql);
         ResultSet rs = stmt.executeQuery(QUERY);
         while(rs.next()){
            //Display values
            System.out.print("ID: " + rs.getInt("id"));
            System.out.print(", name: " + rs.getString("name"));
           
         }
         rs.close();
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}
