package com.atm.customer;

public class Customer implements Runnable {
	public ATM atm;
	private String name;
	private double amount;

	public Customer() {

	}

	public Customer(ATM atm, String name, double amount) {
		this.atm = atm;
		this.name = name;
		this.amount = amount;
	}

	synchronized public void useAtm() {
		atm.CheckBalance(name);
		atm.WithdrawBalance(name, 120);
	}

	@Override
	public void run() {
		useAtm();
		
	}

}
