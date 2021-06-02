package com.pack.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFile {
	public static void main(String[] args) throws Exception {
		FileInputStream fis =null;
		//int x;
		try {
		fis = new FileInputStream("Songs.txt");
		
//1 way to read through file 		
		byte[] b = new byte[fis.available()];
		fis.read(b);
		String song_name=new String(b);
		System.out.println(song_name);
		fis.close();

		
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
//2nd way to read through the file 
//try with resource used 
		try(FileReader fr = new FileReader("Songs.txt"))
		{
			int x; 
			while((x=fr.read())!=-1)
			{
				if(x==' ')
				{
					System.out.println();
				}
				System.out.print((char)x);
			}
		}
		
		
	}

}
