package com.pack.collection;

import java.util.Collections;

public class BookComp implements Comparable<BookComp>{
	
	private String name; 
	private double price;
	
	
	public BookComp() {
		super();	
		
	}
	
	
	
	public BookComp(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	@Override
	public String toString() {
		return "BookComp [name=" + name + ", price=" + price + "]";
	}



	public int compareTo(BookComp book) {
		if(this.price<book.getPrice())
			return -1;
		else if(this.price>book.getPrice())
			return 1;
			
		
		return 0;
		
	}


//Implementation inside main of BookComparatorTester line 46 Collections.sort( books);
	

	
}
