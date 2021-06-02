package com.pack.collection;

import java.util.Iterator;

public class ArrayCopy {
	
	public static void main(String[] args) {
		
		int[] array1 = new int[4];
		
		array1[0]= 1; 
		array1[1]=2;
		array1[2]= 3;
		array1[3]=4;
		
		System.out.println(array1);
		
		int[] array2 = new int[5];
//a3 copy array1	
		int [] a3= array1.clone();
		int a=0;
		
		System.out.println("-------------------");
		for (int i : a3) {
			System.out.println(a3[a]);
			a++;
		}
		
		
		System.out.println("-------------------");

		
		System.out.println(array2);
		
		//COPY data from array1 to array2 
		int c=0;
		for (int i : array1) {
			array2[c]=i;
			c++;
		}
		
		array1= array2;
		System.out.println(array1);
	}

}
/*
   MAKING THE ARRAY BIGGER 
OUTPUT: 
[I@d716361
[I@6ff3c5b5
[I@6ff3c5b5

*/