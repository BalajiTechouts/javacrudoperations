package net.codejava;


// in this Programs we gave Valuesc Directly While Writing Sql Statement

//in next javaprogram i.e UserManager  lets see how if the values Comes dynamically Should be Stored in db

import java.sql.DriverManager;
import java.sql.Statement;

import com.mysql.jdbc.Connection;

public class UserManager1 {
	
	public static void main(String[] args){
		String jdbcurl="jdbc:mysql://localhost:3306/sampledb";
		String username="root";
		String password="root";
		try{
		Connection connection=(Connection) DriverManager.getConnection(jdbcurl, username, password);
		
		String sql="INSERT INTO users(username, useremail, userfullname, userpassword)" +"VALUES('BALAJI', 'BALU@GMAIL.COM','KOTTNAGABALAJIREDDY','BALAJILOVESBALAJI')";
		Statement statement=connection.createStatement();
		int rows=statement.executeUpdate(sql);
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
