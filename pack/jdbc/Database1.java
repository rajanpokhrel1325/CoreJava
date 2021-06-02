package com.pack.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.TimeZone;

public class Database1 {

	public static void main(String[] args) {
		String className = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/First_Schema?serverTimezone=" + TimeZone.getDefault().getID();
		String usernamedb = "root";
		String passworddb = "G4z4EyRP";
		String quere = "Select * from Employee where Emp_id !=16";
		try {
//1. load the mysql driver 
			Class.forName(className);

//2. create connection 
			Connection connection = DriverManager.getConnection(url, usernamedb, passworddb);

//3. create satatement 
			Statement statement = connection.createStatement();

//4. generate result set to \store the result of query. 
			ResultSet resultSet = statement.executeQuery(quere);

//checking if resultset has something now 

			if (resultSet.next()) {
				String name = resultSet.getString("Emp_Name");
				String id = resultSet.getString("Emp_id");

				System.out.println("NameOfEmployee: " + name + " \nID number: " + id);
			} else {
				System.out.println("Noting is in result");
			}
// checked over 

//first information is already printed by if statement .next();
//if the result contain multiple results. using loop to print the information 

			while (resultSet.next()) {
				String name = resultSet.getString("Emp_Name");
				String id = resultSet.getString("Emp_id");

				System.out.println("NameOfEmployee: " + name + " \nID number: " + id);
			}

//end of loop 
		}

		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
