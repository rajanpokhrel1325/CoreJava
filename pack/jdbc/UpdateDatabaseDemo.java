package com.pack.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.TimeZone;

public class UpdateDatabaseDemo {
	
	public static void main(String[] args) {
		
//		//utl timezone required why?
//		String urldb= "jdbc:mysql://localhost:3306/First_Schema?serverTimezone=" + TimeZone.getDefault().getID();
//
//		String usernam="root";
//		String passwd = "G4z4EyRP";
		
		ParentClass pc =new  ParentClass();
		
		Connection connection = pc.getconnection();
		
		try {
			PreparedStatement ps = connection.prepareStatement("update Employee set Emp_name=? where Emp_id=?");
			ps.setString(1, "Krishna");
			ps.setInt(2, 15);
//			
//			int i =ps.executeUpdate();
//			System.out.println(i+" record updated");
			
		} catch (SQLException e) {
				System.out.println("Here");
						
		}
//		
//		ps.setString(1, "Krishna");
//		ps.setInt(2, 16);
//		
//		int i =ps.executeUpdate();
//		System.out.println(i+" record updated");

		
//		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
//			Connection connection= DriverManager.getConnection(urldb, usernam, passwd);
//			
//			PreparedStatement ps = connection.prepareStatement("update Employee set Emp_name=? where Emp_id=?");
//			
//			ps.setString(1, "Krishna");
//			ps.setInt(2, 16);
//			
//			int i =ps.executeUpdate();
//			System.out.println(i+" record updated");
//			
//			
//		}catch(ClassNotFoundException e)
//		{
//			System.out.println(e);
//		}
//		catch(SQLException e)
//		{
//			System.out.println(e);
//		}
	}

}
