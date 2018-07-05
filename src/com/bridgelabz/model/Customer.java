package com.bridgelabz.model;

public class Customer {
	String customerName;
	double amount;
	int numberOfShares;

	public Customer(){
		
	}
	public Customer(String customerName, double amount, int numberOfShares) {
		super();
		this.customerName = customerName;
		this.amount = amount;
		this.numberOfShares = numberOfShares;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public int getNumberOfShares() {
		return numberOfShares;
	}

	public void setNumberOfShares(int numberOfShares) {
		this.numberOfShares = numberOfShares;
	}

}
