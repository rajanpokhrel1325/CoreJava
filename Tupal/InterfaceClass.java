package oop.Java.Tupal;

interface Shape
{
	public void draw();
	
	
	
	//here is a question
	// methods are abstract (interface) 
	// here is default method..
//	public  default void area(int a) {
//		System.out.println("Area is "+ a);
//		}
}

class Triangle implements Shape{
	
	public void draw()
	{
		System.out.println("Triangle is drawing");
	}
	
}


public class InterfaceClass {
	
	public static void main(String[] args) {
		
		Shape s1= new Triangle();
		
		s1.draw();
		//s1.area(3);
		
		System.out.println("checked is: "+ s1);
		
	}
	
}
