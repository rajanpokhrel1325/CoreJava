package com.pack.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.TimeZone;

public class InsertDatabase {

	public static void main(String[] args) {

		// utl timezone required why?
		String urldb = "jdbc:mysql://localhost:3306/First_Schema?serverTimezone=" + TimeZone.getDefault().getID();

		String usernam = "root";
		String passwd = "G4z4EyRP";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(urldb, usernam, passwd);

			PreparedStatement ps = connection.prepareStatement("insert into Employee values(?,?,?,?)");
//insert 
			ps.setInt(1, 07);
			ps.setString(2, "Sita");
			ps.setString(3, "Irving");
			ps.setString(4, "Nov");

			int i = ps.executeUpdate();
				
//updated at the same time.. UPDATED 16 TO KRISHNA
			ps = connection.prepareStatement("update Employee set Emp_name = ? where Emp_ID = ?");
			ps.setString(1, "KrisH");
			ps.setInt(2, 22);

			i+=ps.executeUpdate();
			
//DELETED FROM THE TABLE 
			
			ps= connection.prepareStatement("delete from Employee where emp_name=?");
			ps.setString(1, "KRISH");
			i+= ps.executeUpdate();
			
			System.out.println(i + " record updated");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (SQLException e) {
			System.out.println(e);
		}
	}

}
