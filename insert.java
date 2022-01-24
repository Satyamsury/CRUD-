##Insert student data into Student table
package CRUD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert 
 {
   static final String DB_URL = "jdbc:mysql://localhost/assingment";
   static final String USER = "root";
   static final String PASS = "Sa1Ty9Am99";

   public static void main(String[] args) {
      // Open a connection
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
      ) {		      
         // Execute a query
        System.out.println("Inserting records into the table assingment...");                    
         String sql = "INSERT INTO assingment VALUES (567, 'anfss', '10/05/1998', 12/01/2020)";
         stmt.executeUpdate(sql);
         sql = "INSERT INTO  assingment  VALUES (45, 'Saftyam', '12/04/1999', 25/01/2017)";
         stmt.executeUpdate(sql);
         sql = "INSERT INTO  assingment VALUES (333, 'ffmfd', '22/13/1999', 28/01/2019)";
         stmt.executeUpdate(sql);
         sql = "INSERT INTO  assingment VALUES(4022, 'Sumifx nt', '11/01/1998', 24/11/2019)";
         stmt.executeUpdate(sql);
         sql = "INSERT INTO  assingment VALUES(512, 'mansefnsnasi', '11/05/1998', 24/11/2019)";
         stmt.executeUpdate(sql);
         System.out.println("Insert records into the table  assingment...");  	  
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}

