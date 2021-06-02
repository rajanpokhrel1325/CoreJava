package com.pack.collection;

import java.io.Serializable;

public class Account implements Serializable{
	
	private String name; 
	private int account_number; 
	private String address; 
	private double balance;
	
	
	
//public Account(String name, int account_number, String address, double balance) {
//		super();
//		this.name = name;
//		this.account_number = account_number;
//		this.address = address;
//		this.balance = balance;
//	}
	
	
//this is a protected constructor... can make protected and private for security.. 
//only affect the defult constructor
	protected Account() {}
	public Account(String name, int account_number, String address, int balance)
	{
		this.name= name; 
		this.account_number= account_number; 
		this.address = address;
		this.balance= balance;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAccount_number() {
		return account_number;
	}
	public void setAccount_number(int account_number) {
		this.account_number = account_number;
	}
	public String getAddress() {
		return address;
	}
//	public void setAddress(String address) {
//		this.address = address;
//	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	} 
	
	
	
	public void depositeBalance(double amount)
	{
		this.balance+=amount;
	}
	
	public void withdrawBalance(double amount)
	{
		if (this.balance>amount) {
			balance-=amount;
			System.out.println("$"+amount+ " is deductive from your checking account");
		}
		else 
			System.out.println("Not Enough Amount to Withdraw");
	}

}
