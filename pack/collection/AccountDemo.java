package com.pack.collection;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Scanner;

public class AccountDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		String message = "Please choose from the given menu:\n";
		message += "1. Create Account\n2. Delete Account \n3. View Account\n4. View AllAccounts";
		message += "\n5. Save Accounts \n6.Exit";
//Scanner
		int choice = 0;
		Scanner scanner = new Scanner(System.in);

//Creating HashMap	
		HashMap<Integer, Account> hm = new HashMap<>();

//File 
		File output_file = new File("output.ser");
		// OutputFile
		FileOutputStream fos = new FileOutputStream(output_file);
		// Object Loader
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		// File input_file = new File("input.txt");

//Loop 		
		while (choice != 6) {
			System.out.println(message);

			choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println("Welcome to RP Bank");

				System.out.println("Please enter your First Name: ");
				String fname = scanner.next();
				System.out.println("Please enter your Last Name: ");
				String lname = scanner.next();
				System.out.println("Please enter your account number");
				int account = scanner.nextInt();
				System.out.println("Please enter your Address");
				String address = scanner.next();
				int balance = 0;
				String name = fname + " " + lname;

				Account a1 = new Account(name, account, address, balance);
				hm.put(account, a1);
				break;
			case 2:
				System.out.println(" Delete Account");
				break;
			case 3:
				/// System.out.println("View Account");
				for (Account a : hm.values()) {
					System.out.println("| Account Information:");
					System.out.println("| Name: " + a.getName());
					System.out.println("| Account Number: " + a.getAccount_number());
					System.out.println("| Address: " + a.getAddress());
					System.out.println("| Balance: " + a.getBalance());
				}
				break;
			case 4:
				System.out.println("\tView All Account");
				System.out.println("-------------------------------");
				try {
					FileInputStream fis = new FileInputStream("output.ser");
					ObjectInputStream ois = new ObjectInputStream(fis);
					
					System.out.println(ois.available());
//here it is not reading the number of lines in the ois?
				//	int cc =  1;//ois.readInt();
					int cc=2;

					for (int i = 0; i < cc; i++) {

						Account aa = (Account) ois.readObject();

						System.out.println("| Account Information:");
						System.out.println("| Name: " + aa.getName());
						System.out.println("| Account Number: " + aa.getAccount_number());
						System.out.println("| Address: " + aa.getAddress());
						System.out.println("| Balance: " + aa.getBalance());
						System.out.println("----------------------------------");

//						Account bb = (Account) ois.readObject();
//						
//						
//						System.out.println("Account Information:");
//						System.out.println("Name: " + bb.getName());
//						System.out.println("Account Number: " + bb.getAccount_number());
//						System.out.println("Address: " + bb.getAddress());
//						System.out.println("Balance: " + bb.getBalance());
					}
					fis.close();
					ois.close();
				} catch (Exception e) {
					e.printStackTrace();
					System.out.println("FIle not read correctly or empty file");
				}
				finally {
					
				}
				break;
			case 5:
				System.out.println("Saved Information");

			case 6:
				System.out.println("here+ "+hm.size());
				for (Account a : hm.values()) {
					oos.writeObject(a);
				}
				System.out.println("Exit");
			

				break;
			}
			
		}
		oos.close();
		fos.close();
	}

}
