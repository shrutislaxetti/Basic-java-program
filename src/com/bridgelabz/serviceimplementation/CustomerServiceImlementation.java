package com.bridgelabz.serviceimplementation;

import java.io.File;
import java.util.LinkedList;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.model.Customer;
import com.bridgelabz.service.CustomerService;
import com.bridgelabz.utility.Utility;

public class CustomerServiceImlementation implements CustomerService {
	File customerfile = new File("/home/bridgrlabz/shruthi/Stock/src/com/bridgelabz/file/Customer.json");
	LinkedList<Customer> customerlist=new LinkedList<>();
	static ObjectMapper mapper = new ObjectMapper();

	/**
	 * function to add customer to the customer file
	 */
	public void addCustomer() throws Exception {
		customerlist = Utility.parseJSONArray(customerfile, Customer.class);
		customerlist = Utility.addCustomer(customerlist);
		System.out.println("Do you want to Save ...Press Y/N");
		String choice = Utility.userInputString();
		if ("Y".equalsIgnoreCase(choice)) {
			mapper.writeValue(customerfile, customerlist);
			System.out.println("Writing successful..");
		}
	}

	/**
	 * function to Update a customer in the customer file based on the index
	 */

	public void updatecustomer() throws Exception {
	
		customerlist = Utility.parseJSONArray(customerfile, Customer.class);
		if (!customerlist.isEmpty()) {
			System.out.println("enter the index where it need to be updated..");
			int index = Utility.userInputInteger();
			customerlist = Utility.updateCustomer(customerlist, index);
			
			System.out.println("Do you want to Save ...Press Y/N");
			String choice = Utility.userInputString();
			if ("Y".equalsIgnoreCase(choice)) {
				customerlist.remove(index);
				mapper.writeValue(customerfile, customerlist);
				System.out.println("Writing successful..");
			}
		} else {
			System.out.println("No data to update..");
		}
	}

	/**
	 * function to delete customer from the customer file based on customer name
	 */
	public void deletecustomer() throws Exception {

		customerlist = Utility.parseJSONArray(customerfile, Customer.class);
		if (!customerlist.isEmpty()) {
			System.out.println("Enter the Customer Name to be deleted");
			String customerNAme = Utility.userInputString();

			for (int i = 0; i < customerlist.size(); i++) {

				if (customerlist.get(i).getCustomerName().equalsIgnoreCase(customerNAme))
					customerlist.remove(i);
			}
			mapper.writeValue(customerfile, customerlist);
			System.out.println("Do you want to Save ...Press Y/N");
			String choice = Utility.userInputString();
			if ("Y".equalsIgnoreCase(choice)) {
				mapper.writeValue(customerfile, customerlist);
			}

		} else {
			System.out.println("list is empty...");
		}
	}

}
