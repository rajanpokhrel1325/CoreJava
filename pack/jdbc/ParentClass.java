package com.pack.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.TimeZone;

public class ParentClass {

	static String className = "com.mysql.cj.jdbc.Driver";
	static public String urldb = "jdbc:mysql://localhost:3306/First_Schema?serverTimezone=" + TimeZone.getDefault().getID();
	static public String username = "root";
	static public String passord = "G4z4EyRP";
	static public String querey = "jnn";

	
	Connection connection; 

	public Connection getconnection() {
			try{
				Class.forName(className);
				connection = DriverManager.getConnection(urldb, username, className);
		
				}catch (ClassNotFoundException ce)
			{
					System.out.println("class not found ");
			} catch (SQLException e) {
					
					e.printStackTrace();
				}
			
			return connection;
		}

}
