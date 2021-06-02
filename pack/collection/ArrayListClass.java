package com.pack.collection;

import java.util.ArrayList;

public class ArrayListClass {
	
	public static void main(String[] args) {
		
		
		ArrayList<Book> al = new ArrayList<>();
		
		Book b1 = new Book("Social  ", 199.99);
		Book b2 = new Book("Science ", 111.99);
		Book b3 = new Book("English ", 299.99);
		Book b4 = new Book("Math    ", 100);
		
		al.add(b1);
		al.add(b2);
		al.add(b3);
		al.add(b4);
		al.add(new Book("Physican", 49.99));
		al.add(new Book("Mental  ", 69.99));
		al.add(new Book("History ", 14.49));
		System.out.println("--------------------------");

		System.out.println("BOOKs:\n| NAME      |  PRICE     |");
		System.out.println("--------------------------");
		int c =0;
		for (Book book : al) {
			System.out.println(c+"| "+book.getName()+"  |  "+ book.getPrice() +" |");
			c++;
			
		}
//Remove method		
		al.remove(5);
		
//changing the price of English.	
		
		if(al.contains(b3))
		{
			b3.setPrice(19.49);
		}
		
		System.out.println("\n\nAfter update");
		
		
		System.out.println("--------------------------");

		System.out.println("BOOKs:\n| NAME      |  PRICE     |");
		System.out.println("--------------------------");
		c=0;
		for (Book book : al) {
			System.out.println(c+"| "+book.getName()+"  |  "+ book.getPrice() +" |");
			c++;
			
		}
	}



}
