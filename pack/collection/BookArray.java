package com.pack.collection;

public class BookArray {
	
	
	public static void main(String[] args) {
		
	
	Book b1 = new Book("Social", 199.99);
	Book b2 = new Book("Science", 111.99);
	Book b3 = new Book("English", 299.99);
	Book b4 = new Book("Math", 100);
	
	Book[] books = new Book[4];
	
	books[0]= b1;
	books[1]= b2;
	books[2]= b3;
	books[3]= b4;
	
	System.out.println("Book Name |  Book Price ");
	System.out.println("-------------------------");
	for (Book book : books) {
		
		System.out.println(book.getName()+"  |   "+book.getPrice());
	}
	System.out.println("-------------------------");
	}
}
