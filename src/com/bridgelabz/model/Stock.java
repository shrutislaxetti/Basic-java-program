package com.bridgelabz.model;

public class Stock {
	String stocksymbol;
	int numberOfShares;
	double sharePrice;

	public Stock(){
		
	}
	public String getStocksymbol() {
		return stocksymbol;
	}

	public void setStocksymbol(String stocksymbol) {
		this.stocksymbol = stocksymbol;
	}

	public int getNumberOfShares() {
		return numberOfShares;
	}

	public void setNumberOfShares(int numberOfShares) {
		this.numberOfShares = numberOfShares;
	}

	public double getSharePrice() {
		return sharePrice;
	}

	public void setSharePrice(double sharePrice) {
		this.sharePrice = sharePrice;
	}

	public Stock(String stocksymbol, int numberOfShares, double sharePrice) {
		this.stocksymbol = stocksymbol;
		this.numberOfShares = numberOfShares;
		this.sharePrice = sharePrice;
	}

}
