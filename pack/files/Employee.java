package com.pack.files;

import java.io.Serializable;

public class Employee implements Serializable{
	private int id;
	private String name="Suman Raila";
	
	
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Employee() {
		id=0;
		name=null;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void salary(double a)
	{
		System.out.println(a);
	}
	public void salary(double a , int b)
	{
		System.out.println("The salary is: "+a*b);
	}
	
}

class Teacher extends Employee
{
	
}