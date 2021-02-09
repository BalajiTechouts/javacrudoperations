package net.codejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class RetriveUserManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dburl="jdbc:mysql://localhost:3306/sampledb";
		String dbusername="root";
		String dbpassword="root";
		
		try{
			Connection connection=DriverManager.getConnection(dburl, dbusername, dbpassword);
			String sql="SELECT* FROM users";
			Statement statement=connection.createStatement();
			ResultSet result=statement.executeQuery(sql);
			while(result.next()){
				int userid=result.getInt("user_id");
				String username=result.getString("username");
				String userpassword=result.getString("userpassword");
				String userfullname=result.getString("userfullname");
				String useremail=result.getString("useremail");
				System.out.println(userid);
				System.out.println(username);
				System.out.println(userpassword);
				System.out.println(userfullname);
				System.out.println(useremail);
				}
			connection.close();
			
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
