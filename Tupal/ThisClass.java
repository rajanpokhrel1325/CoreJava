package oop.Java.Tupal;


class GrandParent {
	public int id=10;
	public void something()
	{
		System.out.println("This is from grandparent");
	}
	
}
class Parent extends GrandParent
{
	int pid = 11;
	public void something()
	{
		System.out.println("This is a parent class");
	}
}

class Child extends Parent
{
	
}

public class ThisClass {
	
	

}
