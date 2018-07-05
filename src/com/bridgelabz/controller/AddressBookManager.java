package com.bridgelabz.controller;

import com.bridgelabz.service.AddressBookService;
import com.bridgelabz.service.AddressBookServiceImplementations;
import com.bridgelabz.utility.Utility;

public class AddressBookManager {

	public static void main(String[] args) throws Exception {
		System.out.println("Welcome to Address Book");
		while (true) {
			System.out.println("Enter 1 CREATE ADDRESS BOOK");
			System.out.println("ENTER 2 VIEW ADDRESS BOOK");
			System.out.println("Enter 3 DELETE ADDRESS BOOK ");
			System.out.println("Enter 4 ADD PERSON ");
			System.out.println("ENTER 5 TO UPDATE PERSON ");
			System.out.println("ENTER 6 TO DELETE PERSON");
			System.out.println("ENETR 7 TO EXIT");
			AddressBookService addressbook = new AddressBookServiceImplementations();
			int choice = Utility.userInputInteger();
			switch (choice) {
			case 1: {
				addressbook.createAddressBook();
				break;
			   }
			case 2:{
				addressbook.viewAddressBook();
				break;
			}
			case 3: {
				addressbook.deleteAddressBook();
				break;
			}
			case 4:{
				addressbook.doAddPerson();
				break;
			}
			case 5:
			{
				addressbook.doUpdatePerson();
				break;
			}
			case 6:
			{
				addressbook.doRemovePerson();
				break;
			}
			case 7:{
				System.exit(0);
				break;
			}
			}
		}

	}
}