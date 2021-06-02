package oop.Java.Tupal;
import tupal_package.First_program;
public class Employee_Test {

	{
		System.out.println("This block  is always executed||");
	}
	
	static {
		System.out.println("Static is always load first");
		
	}
	static {
		System.out.println("Second static");
	}
	public static void main(String[] args) {
		
		//not working without empty constructor 
		Employee e1 = new Employee();
		
		System.out.println(e1.getName());
		
		Employee_Test et1 = new Employee_Test();
		
	//	Employee2 e2 = new Employee2(19, "Amit");
		
		
		
		//call from another package 
		
		First_program fp = new First_program();
		fp.method();
			
		
		
		//DemoClass demo = new ExtendedClass();
		
		
		
		
	}
}
