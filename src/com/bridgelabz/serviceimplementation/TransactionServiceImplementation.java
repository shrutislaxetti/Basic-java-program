package com.bridgelabz.serviceimplementation;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.model.Customer;
import com.bridgelabz.model.Stock;
import com.bridgelabz.model.Transaction;
import com.bridgelabz.service.TransactionService;
import com.bridgelabz.utility.Utility;

public class TransactionServiceImplementation implements TransactionService {

	File transactionfile = new File("/home/bridgrlabz/shruthi/Stock/src/com/bridgelabz/file/Transaction.json");
	File customerfile = new File("/home/bridgrlabz/shruthi/Stock/src/com/bridgelabz/file/Customer.json");
	File stockfile = new File("/home/bridgrlabz/shruthi/Stock/src/com/bridgelabz/file/StockAccount.json");

	static ObjectMapper mapper = new ObjectMapper();

	LinkedList<Transaction> transactionlist = new LinkedList<>();
	LinkedList<Customer> customerlist = new LinkedList<>();
	LinkedList<Stock> stocklist = new LinkedList<>();

	public void buy() throws Exception {

		stocklist = Utility.parseJSONArray(stockfile, Stock.class);
		customerlist = Utility.parseJSONArray(customerfile, Customer.class);
		transactionlist = Utility.parseJSONArray(transactionfile, Transaction.class);
		boolean found = false;
        boolean found1=false;
		Stock stock = new Stock();
		Transaction transaction = new Transaction();
		Customer customer = new Customer();
        int customerindex=0;
		int stockindex = 0;
		System.out.println("Enter the stock name you want to buy from:");
		showStockDetails();
		String stockname = Utility.userInputString();
		
		for (int i = 0; i < stocklist.size(); i++) {
			if (stocklist.get(i).getStocksymbol().equalsIgnoreCase(stockname)) {
				found = true;
				stockindex = i;
				break;
			}
		}
		
		/**
		 * fuction to update the stock json file
		 */
		if (found) {
			System.out.println("enter the number of shares that you want to buy...");
			int numofshares = Utility.userInputInteger();
			
			if (stocklist.get(stockindex).getNumberOfShares() >= numofshares) {
				
				int finalshare = stocklist.get(stockindex).getNumberOfShares() - numofshares;
				stock.setNumberOfShares(finalshare);
				stock.setStocksymbol(stocklist.get(stockindex).getStocksymbol());
				stock.setSharePrice(stocklist.get(stockindex).getSharePrice());
				stocklist.remove(stockindex);
				stocklist.add(stock);
				mapper.writeValue(stockfile, stocklist);
			
			}
			/*
			else {
				System.out.println("Not enough shares...");
				return;
			}*/
		
			/**
			 * function to update the cutomer json file
			 */

		System.out.println("Enter the customer name :");
		showCustomerDetails();
		String customername = Utility.userInputString();
		double amount=0;
		for (int i = 0; i < customerlist.size(); i++) {
			if (customerlist.get(i).getCustomerName().equalsIgnoreCase(customername)) {
				 found1 = true;
				 customerindex = i;
				 
				break;
			}
		}
		if(found1) {	
			double initialamount = stocklist.get(stockindex).getSharePrice();
			System.out.println(".....");
			double finalamout = initialamount * numofshares;
			if(customerlist.get(customerindex).getAmount()>finalamout ) {
			 amount = customerlist.get(customerindex).getAmount() -finalamout;
			
			int initialshare = customerlist.get(customerindex).getNumberOfShares();
			int sharefinal = initialshare + numofshares;
			customer.setNumberOfShares(sharefinal);
			customer.setAmount(amount);
			customer.setCustomerName(customerlist.get(customerindex).getCustomerName());
			customerlist.remove(customerindex);
			customerlist.add(customer);
			System.out.println("...");
			mapper.writeValue(customerfile, customerlist);
			
			}
			
			/**
			 * function to update the transaction json file
			 */
			
			System.out.println("enter the transaction type:");
			String type = Utility.userInputString();
			transaction.setTransactionType(type);
			transaction.setCustomerName(stocklist.get(stockindex).getStocksymbol());
			
			transaction.setSharesBouught(numofshares);
			transaction.setCustomerName(customername);
			transaction.setTimestamp(new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()));
			transactionlist.add(transaction);
			mapper.writeValue(transactionfile, transactionlist);
			}
		}
		

			else {
				System.out.println("sorry not posssible to buy ....Not enough money");
			}
	}


	/**
	 * function to view Customer list from the customer json file
	 */
	public void showCustomerDetails() throws Exception {
		customerlist = Utility.parseJSONArray(customerfile, Customer.class);
		for (int i = 0; i < customerlist.size(); i++) {
			System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(customerlist.get(i)));
		}
	}

	/**
	 * function to View Stock Details from the stock json file
	 */
	public void showStockDetails() throws Exception {
		stocklist = Utility.parseJSONArray(stockfile, Stock.class);
		for (int i = 0; i < stocklist.size(); i++) {
			System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(stocklist.get(i)));
		}

	}

}
