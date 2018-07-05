package com.bridgelabz.service;

import com.bridgelabz.utility.Person;
import com.bridgelabz.utility.Utility;

import AddressBookFactory.AddressBookFactory;
import AddressBookSerializer.Serialization;

public class AddressBookServiceImplementations implements AddressBookService{
	Person person=new Person();
	@Override
	public void createAddressBook() throws Exception {
	System.out.println("enter the serializing type..");		
	String type=Utility.userInputString();
	Serialization objectref=AddressBookFactory.getdao(type);
	objectref.create();
	}
	
	@Override
	public void viewAddressBook() throws Exception {
		System.out.println("enter the serializing type..");		
		String type=Utility.userInputString();
		Serialization objectref=AddressBookFactory.getdao(type);	
		objectref.view();
	}

	@Override
	public void deleteAddressBook() {
		System.out.println("enter the serializing type..");		
		String type=Utility.userInputString();
		Serialization objectref=AddressBookFactory.getdao(type);
		objectref.deleteAddressBook();
		
	}

	@Override
	public void doAddPerson() throws Exception {
		System.out.println("enter the serializing type..");		
		String type=Utility.userInputString();
		Serialization objectref=AddressBookFactory.getdao(type);
		objectref.addPerson();
		
	}

	@Override
	public void doUpdatePerson() throws Exception {
		System.out.println("enter the serializing type..");		
		String type=Utility.userInputString();
		Serialization objectref=AddressBookFactory.getdao(type);
		objectref.updatePerson();
		
	}

	@Override
	public void doRemovePerson() throws Exception {
		System.out.println("enter the serializing type..");		
		String type=Utility.userInputString();
		Serialization objectref=AddressBookFactory.getdao(type);
		objectref.deletePerson();
	}
	}

