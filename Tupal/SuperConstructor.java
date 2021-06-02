package oop.Java.Tupal;


//This is an example of use of empty constructor 


class Forest 
{
//static method call x, so variable made static 
	final static int x = 123;
	private String name="Amazon Forest";
	
	public Forest(){
		System.out.println("Forest class ");
	}
	
	public static void  area()
	{
		System.out.println("The area of the land is "+ x);
		
//Static method cannot call non static methods.
		//location();
	}
	
	public void location() {
		System.out.println("The location is called for forest!!!");
		
//Calling static method from non static method.
		area();
		
	}
	
	public void name()
	{
		System.out.println("Name of the Forest"+name);
	}
	
}

class Tree extends Forest
{
	public int x; 
	public Tree()
	{
		
		System.out.println("Tree Classs");
		x =3;
//super must always be called at the first 
		//super();

//Try to get final static from the Parent class Forest 
		System.out.println("Parent value of static x is: "+super.x);
			
	}
	

	
	
}
public class SuperConstructor {
	
	public static void main(String[] args) {
		
//How the empty constructor works 
		Tree tree = new Tree();
		
//We don't have forest object... calling static method of forest 
		Forest.area();
	}

}
