package com.velocity.quize;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Database {

	  public void createTable() {
	  try 
	     {
			
		    Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/questions","root","root");
		
			String sql = "create table questions(id int(20) primary key auto_increment, question varchar(255),option1 varchar(255), option2 varchar(255), option3 varchar(255),option4 varchar(255), answer varchar(255))";
		    
		    Statement stmt = con.createStatement();
		    stmt.executeUpdate(sql);
		    System.out.println("Table created succesfully");
		    con.close();
		 }
	  
	catch(Exception e) 
	  
		{
			System.out.println(e);
		}
	}
	  
	  public void insertQuestion() {
		  
		  try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/questions","root","root");
				String q = "insert into questions(question,option1, option2, option3,option4, answer)value(' Who invented Java Programming?','Guido van Rossum','James Gosling','Dennis Ritchie','Bjarne Stroustrup','b' ),('Which one of the following is not a Java feature?','Object-oriented','Use of pointers','Portable','Dynamic and Extensible','b'),('Which environment variable is used to set the java path?','MAVEN_Path','JavaPATH','JAVA','JAVA_HOME','d'),('What is the extension of java code files?','.js','.txt','.class','.java','d'),('Which of the following is a superclass of every class in Java?','ArrayList','Abstract Class','Object Class','String','c'),('Which of these keywords are used for the block to be examined for exceptions?','check','throw','catch','try','d'),('Which one of the following is not an access modifier?','protected','void','public','private','b'),('What is the return type of the hashCode() method in the Object class?','Object','int','long','void','b'),('In which process, a local variable has the same name as one of the instance variables?','Serialization','Variable Shadowing','Abstraction','Multi-threading','b'),('Which package contains the Random class?','java.util package','java.lang package','java.awt package','java.io package','a')";
				
				Statement stmt1 = con.createStatement();
			
		        stmt1.executeUpdate(q);
				stmt1.execute(q);
				
				System.out.println("Insertion succesfully");
				con.close();
				}
			catch(Exception e) 
			    {
					System.out.println(e);
				}
				
	  }
}
	
		
	
	
		

