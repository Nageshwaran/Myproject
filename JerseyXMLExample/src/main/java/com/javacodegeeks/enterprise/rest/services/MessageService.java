package com.javacodegeeks.enterprise.rest.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.Statement;

import com.javacodegeeks.enterprise.rest.jersey.Result;
import com.javacodegeeks.enterprise.rest.jersey.Student;

public class MessageService {
	public List<Result> getAllMessages(Student student) throws ClassNotFoundException, SQLException
	{
		
		System.out.println("Haiiiiiiiiiiiiiiiiiiiii");
		System.out.println(student.getId());
		   Connection connection=null;
		   ArrayList<Result> list = new ArrayList<Result>();
		   try{
		    Class.forName("com.mysql.jdbc.Driver");  
			connection=DriverManager.getConnection("jdbc:mysql://192.168.6.14:3306/bug","root","redhat");  
			System.out.println("working"); 
			PreparedStatement pstmt= connection.prepareStatement("select * from `persons` where `PersonID` between ? and ?	");
			pstmt.setInt(1, student.getId());
			pstmt.setInt(2, student.getAge());
			ResultSet rs=pstmt.executeQuery(); 
			while(rs.next())  
			{
			Result k = new Result();	
			k.setAdf(rs.getInt("PersonID"));	
			k.setAddress(rs.getString("Address"));
			k.setCity(rs.getString("City"));
			list.add(k);
			}
			pstmt.close();
			connection.close();
	}
		   catch (Exception e) {
			   e.printStackTrace();	
			   }
			return list; 
			
			
		
			
			
			
		}
	public List<Result> getInformation() throws ClassNotFoundException, SQLException
	{
		
		System.out.println("Haiiiiiiiiiiiiiiiiiiiii-second");
		
		   Connection connection=null;
		   ArrayList<Result> list = new ArrayList<Result>();
		   try{
		    Class.forName("com.mysql.jdbc.Driver");  
			connection=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/test","rootu","");  
			System.out.println("working-second"); 
			Statement stmt=connection.createStatement();
			
			ResultSet rs=stmt.executeQuery("select * from persons"); 
			while(rs.next())  
			{
			Result k = new Result();	
			k.setAdf(rs.getInt("PersonID"));	
			k.setAddress(rs.getString("Address"));
			k.setCity(rs.getString("City"));
			list.add(k);
			}
			stmt.close();
			connection.close();
	}
		   catch (Exception e) {
			   e.printStackTrace();	
			   }
			return list; 
			
			
		
			
			
			
		}


		
	}


