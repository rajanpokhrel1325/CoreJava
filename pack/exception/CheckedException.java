package com.pack.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedException {
	
	public void show() throws FileNotFoundException, IOException
	{
	
		FileInputStream fileStream = new FileInputStream("/BasicOops/src/com/pack/exception/euta.txt");
		//System.out.println(fileStream.getFD());
	    
	}
	
	public void callingMethod()
	{
		try {
			show();
		} catch (Exception e)
		{
			System.out.println("Exception Handeled");
		}
	}
	
	
	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		System.out.println("Start");
		
		CheckedException ce = new CheckedException();
		try {
			ce.show();
		
			
		}catch(Exception e)
		{
			System.out.println("Exception Occured");
		}
		ce.callingMethod();
		System.out.println("End");
		
	}

}


/*
 
 Used topic: throws multiple exception 
  			  method calling another method which throws exception(calling method handels the exception)

Knowledge: calling method handeled the exception 
*/