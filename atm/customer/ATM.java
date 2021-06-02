package com.atm.customer;

public class ATM {

	public ATM() {
		
	}

	

	public void CheckBalance(String name) {
		System.out.println(name + " is checking the balance using " + Thread.currentThread().getName());
		// Thread.yield();
	}

	public void WithdrawBalance(String name, int amount) {
		System.out.println(name + " trying to withdraw $" + amount);
	}

	
}
