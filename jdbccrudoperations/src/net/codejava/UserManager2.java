package net.codejava;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class UserManager2 {
	public static void main(String[] args){
		String jdbcurl="jdbc:mysql://localhost:3306/sampledb";
		String dbusername="root";
		String dbpassword="root";
		String username="Kumar";
		String userpassword="kumarreddy";
		String userfullname="Kottekumarreddy";
		String useremail="kumareddy7@gmail.com";
		try{
		Connection connection= DriverManager.getConnection(jdbcurl, dbusername, dbpassword);
		
		
		String sql="INSERT INTO users(username, userpassword, userfullname, useremail )" +"VALUES (?, ?, ?, ?)";
		PreparedStatement statement=connection.prepareStatement(sql);
		statement.setString(1, username);
		statement.setString(2, userpassword);
		statement.setString(3, userfullname);
		statement.setString(4, useremail);
		
		int rows=statement.executeUpdate();
		if(rows>0){
			System.out.println("A new user have been inserted");
			}
		connection.close();
		}
		catch(Exception e){
			
		
		e.printStackTrace();
		
		
		
	}

	}
}
