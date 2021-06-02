package com.pack.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.TimeZone;



public class getConnection {
	
	public static void main(String[] args) throws Exception{
		getConnection();
	}
	
	
	public static void getConnection()
	{
		String urldb = "jdbc:mysql://localhost:3306/First_Schema?serverTimezone=" + TimeZone.getDefault().getID();

		String usernam = "root";
		String passwd = "G4z4EyRP";

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(urldb, usernam, passwd);
			System.out.println("Connected");
		}catch (Exception e)
		{
			System.out.println(e);
		}
	}

}
