package com.velocity.quize;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class StudentRecord extends QuizSet {
	
	public void studentTable() {
	 try {
			
		    Class.forName("com.mysql.cj.jdbc.Driver");
		    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		    
			String sql = "create table student(roll_no int(20) , name varchar(255), score int(255))";
		    
		    Statement stmt = con.createStatement();
		    stmt.executeUpdate(sql);
		    con.close();
		 }
	  
	catch(Exception e) 
	  
		{
			System.out.println(e);
		}	
		
	}
	
	
	public void studentInfo() {
		
		try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
				String q = "insert into student(roll_no, name, score) value(?,?,?)";
				
				PreparedStatement stmt1 = con.prepareStatement(q);
				
				stmt1.setInt(1, roll_no);
				stmt1.setString(2, name);
				stmt1.setInt(3, score);
			
		        stmt1.executeUpdate();
				con.close();
		     }
		catch(Exception e) 
			 {
			    System.out.println(e);
			 }
		 
	}

}
