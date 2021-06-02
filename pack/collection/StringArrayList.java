package com.pack.collection;

import java.util.ArrayList;

public class StringArrayList {

	
	public static void main(String[] args) {
		ArrayList<String> sa = new ArrayList<>();
//adding data 
		
		sa.add("Name");
		sa.add("Price");
		sa.add("Type");
		sa.add("Qty");
		
		for (String string : sa) {
			System.out.println(string);
		}
	}
}
