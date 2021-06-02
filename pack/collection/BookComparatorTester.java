package com.pack.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Bc implements Comparator<BookComp>{
	
	
	public int compare(BookComp a, BookComp b) {
		if(a.getPrice()<b.getPrice())
			return -1;
		else if (a.getPrice()> b.getPrice())
			return 1;
		return 0;
	}

	
	


}
public class BookComparatorTester{
	
	public static void main(String[] args) {
		BookComp bc1= new BookComp("Java", 111.99);
		BookComp bc2= new BookComp("C++", 111.9);
		BookComp bc3= new BookComp("#C", 111.00);
		BookComp bc4= new BookComp("JavaScript", 333.33);
		BookComp bc5= new BookComp("Python", 222.22);
		
		BookComp[] b = {bc1, bc2, bc3, bc4, bc5};
		List<BookComp> books = new ArrayList<BookComp>();
		books.add(new BookComp("Java", 111.99));
		books.add( new BookComp("C++", 111.9));
		books.add(new BookComp("#C", 111.00));
		books.add(new BookComp("JavaScript", 333.33));
		books.add(new BookComp("Python", 222.22));
		
		
		System.out.println("Before Sorting List");
		for (BookComp bookComp : books) {
			System.out.println(bookComp);
		}
		//System.out.println(bc1.compareto(bc2));
		Collections.sort( books);
		
		System.out.println("\nAfter Sorting\n");
		for (BookComp bookComp : books) {
			System.out.println(bookComp);
		}
		
		System.out.println("\n\nBefore Sorting array\n");
		for (BookComp bookComp : b) {
			System.out.println(bookComp);
		}
		System.out.println("\n\nAfter Sorting Array\n");
		Arrays.sort(b,new Bc());
		for (BookComp bookComp : b) {
			System.out.println(bookComp);
		}
		
	}
	

}
