package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.api.jdbc.Statement;

import connection.ConnectionManager;
import dto.UserDTO;

public class UserDAO {
	
	Connection connection;

	
	public List<UserDTO> getUsers() {
		
		//Declaration of user list;
		List<UserDTO> users = new ArrayList<UserDTO>();
		
		//Database connection variables
		connection = ConnectionManager.connectDB();
		Statement stmt = null;
		
		
		String query = "SELECT * FROM users";
		
		try {
			
			//execute query
			stmt = (Statement) connection.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			
			
			
			
		    while(rs.next()){
		          //Retrieve by column name
		          int id  = rs.getInt("id");
		          String name = rs.getString("name");
		          String email = rs.getString("email");
		          int age = rs.getInt("age");
		          
		          users.add(new UserDTO(id, name, email, age ));
		          
		          //Display values
		          System.out.print("ID: " + id);
		          System.out.print(", Age: " + age);
		          System.out.print(", First: " + name);
		          System.out.println(", Email: " + email);
		     }
		     rs.close();
			
		} catch (SQLException e) {
		
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return users;	
	}
	
}
