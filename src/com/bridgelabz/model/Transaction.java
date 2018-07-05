package com.bridgelabz.model;

public class Transaction {
	String transactionType;
	String customerName;
	int sharesBouught;
	String stockSymbol;
	
	String timestamp;
	
	public Transaction(String transactionType, String customerName, int sharesBouught, String stockSymbol,
			double amount, String timestamp) {
		super();
		this.transactionType = transactionType;
		this.customerName = customerName;
		this.sharesBouught = sharesBouught;
		this.stockSymbol = stockSymbol;
		
		this.timestamp = timestamp;
	}
	public String getTransactionType() {
		return transactionType;
	}
	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public int getSharesBouught() {
		return sharesBouught;
	}
	public void setSharesBouught(int sharesBouught) {
		this.sharesBouught = sharesBouught;
	}
	public String getStockSymbol() {
		return stockSymbol;
	}
	public void setStockSymbol(String stockSymbol) {
		this.stockSymbol = stockSymbol;
	}
	
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}
	public Transaction() {
		super();
	}
	
	
	
}
