package com.pack.exception;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    System.out.println("Enter a number: ");
	    int a = scan.nextInt();
	    System.out.println("Enter a number: ");
	    int b = scan.nextInt();
	    int c;
	    
	    try {
	    	 c = a/b;
	    }catch(Exception e)
	    {
	    	c=0;
	    	System.out.println("Divided by zero so c=0");
	    }
	   
	    finally {
	    	System.out.println("closed all files");
	    }
	    System.out.println("the value of c is: "+c);
	}
    

}


//Used try catch 
// finally 
