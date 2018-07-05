package com.bridgelabz.controller;

import com.bridgelabz.service.CustomerService;
import com.bridgelabz.service.StockAcccountService;
import com.bridgelabz.service.TransactionService;
import com.bridgelabz.serviceimplementation.CustomerServiceImlementation;
import com.bridgelabz.serviceimplementation.StockAccountServiceImplementation;
import com.bridgelabz.serviceimplementation.TransactionServiceImplementation;
import com.bridgelabz.utility.Utility;

public class Controller {

	public static void main(String[] args) throws Exception {
		TransactionService transactionservice = new TransactionServiceImplementation();
		StockAcccountService stockservice = new StockAccountServiceImplementation();
		CustomerService customerservice = new CustomerServiceImlementation();
		int i = 0;
		System.out.println("Welcome to StockManagement:");
		while (i <= 8) {
			System.out.println("Enter 1. TO VIEW STOCK PORTFOLIO ");
			System.out.println("Enter 2. TO VIEW CUSTOMER PORTFOLIO ");
			System.out.println("Enter 3. TO BUY");
			System.out.println("Enter 4. TO ADD  STOCKACCOUNT:");
			System.out.println("Enter 5. TO DELETE STOCKACCOUNT:");
			System.out.println("Enter 6. TO ADDCUSTOMER:");
			System.out.println("Enter 7. TO UPDATECUSTOMER:");
			System.out.println("Enter 8. TO DELETECUSTOMER: ");
			System.out.println("enter 9. Exit");
			System.out.println("Enter your choice:  ");
			int choice = Utility.userInputInteger();
			switch (choice) {
			case 1:
				transactionservice.showStockDetails();
				
				break;
			case 2:
				transactionservice.showCustomerDetails();
				break;
			case 3:
				transactionservice.buy();
				break;
			case 4:
				stockservice.addStock();
				break;
			case 5:
				stockservice.deleteStock();
				break;
			case 6:
				customerservice.addCustomer();
				break;
			case 7:
				transactionservice.showStockDetails();
				customerservice.updatecustomer();
				
				break;
			case 8:
				customerservice.deletecustomer();
				break;
			case 9:
				System.exit(0);
				break;

			}

		}
	}
}
