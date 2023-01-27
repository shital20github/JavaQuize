package com.velocity.quize;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class QuizSet {
	   int roll_no;
	   String name;
	   int score;
	
	   public void display() {
        	int score = 0;
        	
        	Scanner input = new Scanner(System.in) ;
        	System.out.println("Enter your Name >> ");
    		String name = input.next();
    		
    		System.out.println("Enter your Roll_No >> ");
    		int roll_no = input.nextInt();
    		
    		System.out.println("==========LET'S START THE QUIZ==========");
    		System.out.println("****************************************");
		 try
		 {
			 
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/questions","root","root");
			
			PreparedStatement ps1 = con.prepareStatement("select * from questions where id = 1");
			ResultSet rs1 = ps1.executeQuery();
			while(rs1.next())
	         {
		        System.out.println("Q1 "+rs1.getString(2));
			System.out.println("a) "+rs1.getString(3));
			System.out.println("b) "+rs1.getString(4));
			System.out.println("c) "+rs1.getString(5));
			System.out.println("d) "+rs1.getString(6));
			      
			System.out.println("Enter your choice : ");
			String choice1 = input.next();
			       
			if (rs1.getString(7).equals(choice1)) 
			  {
			     score++;
			  }
		   }  	   
			
		    PreparedStatement ps2 = con.prepareStatement("select * from questions where id = 2");
		    ResultSet rs2 = ps2.executeQuery();
		    while(rs2.next())
		  {  
			System.out.println("Q2 "+rs2.getString(2));
			System.out.println("a) "+rs2.getString(3));
			System.out.println("b) "+rs2.getString(4));
			System.out.println("c) "+rs2.getString(5));
			System.out.println("d) "+rs2.getString(6));
			
		        System.out.println("Enter your choice : ");
		        String choice2 = input.next();
				    
			if (rs2.getString(7).equals(choice2))
			   {
			     score++;
		           }
		   }
		      PreparedStatement ps3 = con.prepareStatement("select * from questions where id = 3");
		      ResultSet rs3 = ps3.executeQuery();
		      while(rs3.next())
		    {
		          System.out.println("Q3 "+rs3.getString(2));
			  System.out.println("a) "+rs3.getString(3));
			  System.out.println("b) "+rs3.getString(4));
			  System.out.println("c) "+rs3.getString(5));
			  System.out.println("d) "+rs3.getString(6));
			
		          System.out.println("Enter your choice : ");
			  String choice3 = input.next();
				    
			  if (rs3.getString(7).equals(choice3)) 
			     {
				score++;
			     }
		     }
		      
		      PreparedStatement ps4 = con.prepareStatement("select * from questions where id = 4");
		      ResultSet rs4 = ps4.executeQuery();
		      while(rs4.next())
		    {
			  System.out.println("Q4 "+rs4.getString(2));
			  System.out.println("a) "+rs4.getString(3));
			  System.out.println("b) "+rs4.getString(4));
			  System.out.println("c) "+rs4.getString(5));
			  System.out.println("d) "+rs4.getString(6));
			
		          System.out.println("Enter your choice : ");
			  String choice4 = input.next();
				    
			  if (rs4.getString(7).equals(choice4)) 
			     {
				score++;
			     }
		    }
		      PreparedStatement ps5 = con.prepareStatement("select * from questions where id = 5");
		      ResultSet rs5 = ps5.executeQuery();
		      while(rs5.next())
		   {
			  System.out.println("Q5 "+rs5.getString(2));
			  System.out.println("a) "+rs5.getString(3));
			  System.out.println("b) "+rs5.getString(4));
			  System.out.println("c) "+rs5.getString(5));
			  System.out.println("d) "+rs5.getString(6));
			
		          System.out.println("Enter your choice : ");
			  String choice5 = input.next();
				    
			  if (rs5.getString(7).equals(choice5))
			     {
				score++;
			     }
			}
		      PreparedStatement ps6 = con.prepareStatement("select * from questions where id = 6");
		      ResultSet rs6 = ps6.executeQuery();
		      while(rs6.next())
		    {
			  System.out.println("Q6 "+rs6.getString(2));
			  System.out.println("a) "+rs6.getString(3));
			  System.out.println("b) "+rs6.getString(4));
			  System.out.println("c) "+rs6.getString(5));
			  System.out.println("d) "+rs6.getString(6));
			
		      System.out.println("Enter your choice : ");
			  String choice6 = input.next();
				    
			  if (rs6.getString(7).equals(choice6)) 
			     {
				score++;
			     }
			}
		      PreparedStatement ps7 = con.prepareStatement("select * from questions where id = 7");
		      ResultSet rs7 = ps7.executeQuery();
		      while(rs7.next())
		    {
			  System.out.println("Q7 "+rs7.getString(2));
			  System.out.println("a) "+rs7.getString(3));
			  System.out.println("b) "+rs7.getString(4));
	                  System.out.println("c) "+rs7.getString(5));
			  System.out.println("d) "+rs7.getString(6));
			
		          System.out.println("Enter your choice : ");
			  String choice7 = input.next();
				    
			  if (rs7.getString(7).equals(choice7)) 
			     {
				score++;
			     }
		    }
		      PreparedStatement ps8 = con.prepareStatement("select * from questions where id = 8");
		      ResultSet rs8 = ps8.executeQuery();
		      while(rs8.next())
		    {
			  System.out.println("Q8 "+rs8.getString(2));
			  System.out.println("a) "+rs8.getString(3));
			  System.out.println("b) "+rs8.getString(4));
			  System.out.println("c) "+rs8.getString(5));
			  System.out.println("d) "+rs8.getString(6));
			
		          System.out.println("Enter your choice : ");
			  String choice8 = input.next();
				    
			  if (rs8.getString(7).equals(choice8)) 
			     {
				   score++;
			     }
		     }
		      PreparedStatement ps9 = con.prepareStatement("select * from questions where id = 9");
		      ResultSet rs9 = ps9.executeQuery();
		      while(rs9.next())
		    {
			  System.out.println("Q9 "+rs9.getString(2));
			  System.out.println("a) "+rs9.getString(3));
			  System.out.println("b) "+rs9.getString(4));
			  System.out.println("c) "+rs9.getString(5));
			  System.out.println("d) "+rs9.getString(6));
			
		          System.out.println("Enter your choice : ");
			  String choice9 = input.next();
				    
			  if (rs9.getString(7).equals(choice9)) 
			     {
				   score++;
			     }
		     }
		      PreparedStatement ps10 = con.prepareStatement("select * from questions where id = 10");
		      ResultSet rs10 = ps10.executeQuery();
		      while(rs10.next())
		    {
			  System.out.println("Q10 "+rs10.getString(2));
			  System.out.println("a) "+rs10.getString(3));
			  System.out.println("b) "+rs10.getString(4));
			  System.out.println("c) "+rs10.getString(5));
			  System.out.println("d) "+rs10.getString(6));
			
		          System.out.println("Enter your choice : ");
		          String choice10 = input.next();
				    
			  if (rs10.getString(7).equals(choice10)) 
			     {
				score++;
			     }
		     }	    
		      
		      System.out.println("==============================================");
		      System.out.println("Your Score is 10 out of = " +  score);
		      System.out.println("==============================================");
				    
				    if ( score >= 8) {
				    	System.out.println("Congratulations you got CLASS-A");
				    } else if( score >= 6) {
				    	System.out.println("Congratulations you got CLASS-B");
				    } else if( score == 5) {
				    	System.out.println("Congratulations you got CLASS-C");
				    } else {
				    	System.out.println("You are Fail");
				    }
		      System.out.println("==============================================");
				    
		      System.out.println("Name => " + name);
		      System.out.println("Roll_No => " + roll_no);
		      System.out.println("Score => " + score);
				    
		      System.out.println("==============================================");
				    
		      Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		      String q = "insert into student(roll_no, name, score) value(?,?,?)";
		      PreparedStatement stmt1 = con1.prepareStatement(q);
					
		      stmt1.setInt(1, roll_no);
		      stmt1.setString(2, name);
		      stmt1.setInt(3, score);
				
		      stmt1.executeUpdate();
		      System.out.println("Quiz Result Inserted Successfully.....");
		      System.out.println("==============================================");
		      System.out.println("*****************THANK YOU********************");
		      con1.close();
		      nput.close();
		}	
		
		catch(Exception e)
		{
	            e.printStackTrace();
		}
}
}
        
