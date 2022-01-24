 ##Get a list of all students
package CRUD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Show {


   static final String DB_URL = "jdbc:mysql://localhost/assingment";
   static final String USER = "root";
   static final String PASS = "Sa1Ty9Am99";
   static final String QUERY = "SELECT id, name, dob, doj FROM assingment";

   public static void main(String[] args) {
    
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
         ResultSet rs = stmt.executeQuery(QUERY);
      ) {		      
         while(rs.next()){
            
            System.out.print("ID: " + rs.getInt("id"));
            System.out.print(", name: " + rs.getString("name"));
            System.out.print(", dob: " + rs.getString("dob"));
            System.out.println(", doj: " + rs.getString("doj"));
         }
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}
