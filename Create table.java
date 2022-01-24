## Create table in java
package CRUD;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

 
   static final String DB_URL = "jdbc:mysql://localhost/assingment";
   static final String USER = "root";
   static final String PASS = "Sa1Ty9Am99";

   public static void main(String[] args) {
      // Open a connection
      try(Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
         Statement stmt = conn.createStatement();
      ) {		      
          String sql = "CREATE TABLE assingment " +
        		  "(id INTEGER not NULL, " +
                  " name VARCHAR(30), " + 
                  " dob VARCHAR(30), " + 
                  " doj VARCHAR(30), " + 
                  " PRIMARY KEY ( id ))"; 
         stmt.executeUpdate(sql);
         System.out.println("Created table in assingment database...");   	  
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}

