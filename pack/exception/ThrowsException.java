package com.pack.exception;

import oop.Java.Tupal.Employee;

public class ThrowsException {
	public static void main(String[] args) throws ClassNotFoundException{
		
		System.out.println("Start");
		
		Class<Employee> employee = (Class<Employee>) Class.forName("oop.Java.Tupal.Employee111");
//Question????
		//cannot use this employee as an object or instance of Employee class.
		
//prints the name and package combine 
		System.out.println(employee.getName());
		System.out.println("end");
		
	}

}


/*
    	 The main function is load my JVM so JVM will be responsible to handel this exception.
    	IF a method calls another method who throws exception, then the same method is responsible
    	  to handel that exception.. 
 */


/*
	Here oop.Java.Tupal does not contain Employee111 so exception ClassNotFoundException is generated.
*/