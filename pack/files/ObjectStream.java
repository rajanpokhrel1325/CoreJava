package com.pack.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;

public class ObjectStream {
	
	public static void main(String[] args) {
//File Object
		File file = new File("Employee.txt");
		
//ArrayList created 
		ArrayList<Employee> array_employee = new ArrayList<Employee>();
//Add to Arraylist 1 way 		
		array_employee.add(new Employee());
		array_employee.add(new Employee(555,"Shiva"));
		array_employee.add(new Employee(777,"Ganesh"));
		
//creating employee objects and add to arraylist
		Employee e1= new Employee(111,"Lopo");
		Employee e2= new Employee(222,"Kundan");
		Employee e3 = new Employee(333,"Sudip");
//Initializing the Stream
		FileOutputStream fos=null;
		ObjectOutputStream oos=null; 
		
		try {
			 fos = new FileOutputStream(file);
			 oos = new ObjectOutputStream(fos);
			for (Employee employee : array_employee) {
				oos.writeObject(employee);
			}
			
			fos.close();
			oos.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {	
			e.printStackTrace();
		}
		
		
		
		
	}

}
