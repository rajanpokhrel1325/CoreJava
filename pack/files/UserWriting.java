package com.pack.files;

import java.util.LinkedList;
import java.util.Scanner;

public class UserWriting {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String choice= "1";
		String movie_name;
		LinkedList<String> ll = new LinkedList<String>();
		
		do {
			System.out.println("Enter Movie name of 'e' to exit");
			choice = scanner.next();
			
			
			
		}while(choice!="e");
	}

}
