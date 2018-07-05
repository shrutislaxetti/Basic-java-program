package com.bridgelabz.objectorientedprograms;

import com.bridgelabz.utility.Utility;

public class AddressBook {
	
	
	boolean changedSinceLastSave;
    
	public void addPerson() throws Exception {
		
		System.out.println("enter 1. to add person to new Address book");
		System.out.println("enter 2. to add person to existing Address book");
		System.out.println("enter your chioice");
	     switch(Utility.userInputInteger()) {
			
	     case 1:
	    	 UtilityAddressBook.addPerson();
	     break;
		
	     case 2:	
	    	  
	    	 UtilityAddressBook.addPersonToexistingfile();
	     break;
		}
	}

	public void doEdit() throws Exception {
		System.out.println("enter the index value ");
		int index = Utility.userInputInteger();
		UtilityAddressBook.editinformation(index);

	}

	public void remove() throws Exception {
		
		System.out.println("enter the file name from whrere it has to be  be deleted");
		String filename = Utility.userInputString();
		System.out.println("enter the index value ");
		int index = Utility.userInputInteger();
		String file1 = "/home/bridgrlabz/Addressbook/"+filename+".json";
		UtilityAddressBook.remove(index,file1);

	}

	public void sort() throws Exception {
		
		UtilityAddressBook.sort();
	}

	
	
}