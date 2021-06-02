package com.pack.exception;

import java.util.Scanner;

public class ThrowException {

	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Please enter your name\n");
		String name = scanner.nextLine();
		
		if(name.length()>20)
			throw new NullPointerException();
		else 
			System.out.println(name);
	}
}
