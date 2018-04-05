package connection;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.api.jdbc.Statement;
//import java.sql.*;

public class ConnectionManager {

	   // JDBC driver name and database URL
	   static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";  
	   static final String DB_URL = "jdbc:mysql://localhost:3306/mydb?useTimezone=true&serverTimezone=UTC";

	   //  Database credentials
	   static final String USER = "root";
	   static final String PASS = "root";

	   public static Connection connectDB() {
		   Connection conn = null;
		   
		   
		   try{
			   
		      //STEP 2: Register JDBC driver
		      Class.forName(JDBC_DRIVER);

		      //STEP 3: Open a connection
		      System.out.println("Connecting to database...");
		      conn = DriverManager.getConnection(DB_URL,USER,PASS);

		      
		   }catch(SQLException se){
			   
		      //Handle errors for JDBC
		      se.printStackTrace();
		      
		   }catch(Exception e){
			   
		      //Handle errors for Class.forName
		      e.printStackTrace();
		      
		   }
		 
		   
		   System.out.println("Goodbye!");
		   return conn;		   
	   }
	  
	   
}//end FirstExample
