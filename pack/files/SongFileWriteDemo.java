package com.pack.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class SongFileWriteDemo {
	public static void main(String[] args) {
		
		File file = new File("Songs.txt");
		FileOutputStream fos= null;
		try {
			fos = new FileOutputStream(file);
			String[] songs= {"junkiri", "haasa", "hawaijahaj", "hamro Nepal maa"};
			 
			for(int i=0; i<songs.length;i++)
			{
				String song_name= songs[i]+"\n";
				//byte[] b = (byte[])fos.write(song_name);
				fos.write(song_name.getBytes());
				
				
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("Writing to file successfully performed");
		try {
			fos.flush();
			fos.close();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		
		
		
		
		
	}

}
