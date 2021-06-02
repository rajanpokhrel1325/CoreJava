package com.atm.customer;

public class AtmTester {
	
	
	public static void main(String[] args) {
		ATM atm=new ATM();
		Customer c1 = new Customer(atm,"Rajan",500);
		Thread t1 = new Thread(c1);
		t1.setName("t1");
		t1.start();
		Customer c2 = new Customer(atm,"Lopo",1000);
		Thread t2 = new Thread(c2);
		t2.setName("t2");
		t2.start();
		
	}
	

}
