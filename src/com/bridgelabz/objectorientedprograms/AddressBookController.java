package com.bridgelabz.objectorientedprograms;

import java.io.File;

import com.bridgelabz.utility.Utility;

public class AddressBookController {

	public static void main(String[] args) throws Exception {
		System.out.println("Welcome to Address Book");
		AddressBook addressbook = new AddressBook();
        while(true) {
		System.out.println("Enter 1 TO VIEW ADDRESS BOOK");
		System.out.println("Enter 2 TO ADD A ADDRESS BOOK ");
		System.out.println("Enter TO EXIT");
		int choice = Utility.userInputInteger();
		switch (choice) {
		case 1: 
		
			File folder = new File("/home/bridgrlabz/Addressbook/");
			File[] listOfFiles = folder.listFiles();
			for (File file : listOfFiles) {
				if (file.isFile()) {
					System.out.println(file.getName());
				}
			}
			System.out.println("Enter the file name you want View");
			String filename = Utility.userInputString();
			String file = "/home/bridgrlabz/Addressbook/" + filename + ".json";

			UtilityAddressBook.print(file);

			break;

	
		case 2:

		{
			System.out.println("Enter 1 to Add Person ");
			System.out.println("Enter 2 to Edit Person");
			System.out.println("Enter 3 to Delete Person");
			int choice1 = Utility.userInputInteger();

			switch (choice1) {
			case 1: {

				addressbook.addPerson();

				break;
			}
			case 2: {

				addressbook.doEdit();

				break;
			}
			case 3: {

				addressbook.remove();

				break;
			}
			case 4:
				addressbook.sort();
			}
		}
			
		

		case 3:
			break;
		}
	}
	}
}
