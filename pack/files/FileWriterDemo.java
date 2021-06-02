package com.pack.files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("Books.txt",true);
			String name= "Advance Java";
			fw.write("\n");
			fw.write("Amazon ");
			fw.append('A');
			fw.append(name, 7, name.length());
			fw.close();
			
			
		} catch (IOException e) {

			e.printStackTrace();
		}
		

	}

}
