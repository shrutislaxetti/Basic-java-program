package com.bridgelabz.service;

public interface AddressBookService {

	public void createAddressBook() throws Exception;
	
	public void viewAddressBook() throws Exception;

	public void deleteAddressBook();

	public void doAddPerson() throws Exception;

	public void doUpdatePerson() throws Exception;

	public void doRemovePerson() throws Exception;

}
