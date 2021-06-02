package com.pack.files;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class AppendToFile {
	public static void main(String[] args) {
		String[] songs_list= {"Resham"," Sunko bala"," Maitighar"};
		String index_song;
		
//Here is the code to append to a file
		try {
			FileWriter fw = new FileWriter("Songs.txt",true);
			fw.write("\n");
			fw.write("\n");
			for(int i=0; i<songs_list.length;i++)
			{
				index_song=songs_list[i];
				fw.write(index_song+" ");
			}
			
			fw.close();
			//FileReader fr = new FileReader("Songs.txt");
			String read_song= new String(Files.readAllBytes(Paths.get("Songs.txt")));
			System.out.println(read_song);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
