package com.bridgelabz.utility;

import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.map.type.CollectionType;

import com.bridgelabz.model.Customer;
import com.bridgelabz.model.Stock;

public class Utility {
	private static Scanner scanner = new Scanner(System.in);

	static LinkedList<Stock> liststock = new LinkedList<>();
	static LinkedList<Customer> listcustomer = new LinkedList<>();
	public static ObjectMapper mapper = new ObjectMapper();

	/* To take String inputs from user */
	public static String userInputString() {
		return scanner.next();
	}

	/* To take Boolean inputs from user */
	public static boolean userInputBoolean() {
		return scanner.nextBoolean();
	}

	/* To take Integer inputs from user */
	public static int userInputInteger() {
		return scanner.nextInt();
	}

	public static String userInputNextLine() {
		return scanner.nextLine();
	}

	public static double userInputDouble() {
		return scanner.nextDouble();
	}

	/*public static <T> LinkedList<T> parseJSONArray(File file1, Class<T> class1) throws Exception {
		LinkedList<T> arrayList = new LinkedList<T>();
		ArrayList<T> list = new ArrayList<>();
		CollectionType javaType = mapper.getTypeFactory().constructCollectionType(List.class, class1);
		arrayList = mapper.readValue(file1, javaType);
		for(int i=0;i<) {
			
		}
		//System.out.println(arrayList.toString());
		return arrayList;

	}
*/
	public static <T> LinkedList<T> parseJSONArray(File file1, Class<T> class1) throws Exception {
		LinkedList<T> linkedList = new LinkedList<T>();
		List<T> arrayList=new ArrayList<>();
		CollectionType javaType = mapper.getTypeFactory().constructCollectionType(List.class, class1);
		arrayList = mapper.readValue(file1, javaType);
         for(int i=0;i<arrayList.size();i++) {
        	 linkedList.add(arrayList.get(i));           }
         	//arrayList = list;
		return  linkedList;

	}
	public static LinkedList<Stock> addStock(LinkedList<Stock> stocklist) {
		liststock = stocklist;
		System.out.println("enter the number Stocks to be added ...");
		int noofperson = Utility.userInputInteger();
		for (int j = 0; j < noofperson; j++) {

			System.out.println("Enter the  Stock Symbol");
			String stockname = Utility.userInputString();

			System.out.println("Enter the  NumberOfShares");
			int numberofshares = Utility.userInputInteger();

			System.out.println("Enter the SharePrice");
			double shraeprice = userInputDouble();
			Stock st = new Stock(stockname, numberofshares, shraeprice);
			liststock.add(st);
		}

		return liststock;
	}

	public static LinkedList<Customer> addCustomer(LinkedList<Customer> customerlist) {

		listcustomer = customerlist;
		System.out.println("enter the number Customers to be added ...");
		int noofperson = Utility.userInputInteger();
		for (int j = 0; j < noofperson; j++) {

			System.out.println("Enter the  CustomerName");
			String customername = Utility.userInputString();

			System.out.println("Enter the Amount");
			double amount = Utility.userInputDouble();

			System.out.println("Enter the  NumberOfShares");
			int numberofshares = userInputInteger();
			Customer ct = new Customer(customername, amount, numberofshares);
			listcustomer.add(ct);
		}

		return listcustomer;
	}

	public static LinkedList<Customer> updateCustomer(LinkedList<Customer> customerlist, int index) {
		Customer c = new Customer();

		String name = customerlist.get(index).getCustomerName();
		c.setCustomerName(name);

		System.out.println("Enter the Amount:");
		double amount = userInputDouble();
		c.setAmount(amount);

		System.out.println("Enter the Number of shares..");
		int numberofshares = userInputInteger();
		c.setNumberOfShares(numberofshares);

		customerlist.add(c);
		return customerlist;
	}
}
