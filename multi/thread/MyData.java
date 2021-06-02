package com.multi.thread;
public class MyData {
	 synchronized public void display(String message)
	{
		for(int i=0;i<message.length();i++) {
		System.out.print(message.charAt(i));
		}
	}
	 
	  public void message(String data)
	 {
		 for(int i=0;i<data.length();i++) {
				System.out.print(data.charAt(i));
				}
		 }
public static void main(String[] args) {
		
		MyData md1 = new MyData();
		MyData md2 = new MyData();
		
		T1 t1= new T1(md1);
		
		T2 t2= new T2(md2);
		t1.start();
		t2.start();
	}
}
