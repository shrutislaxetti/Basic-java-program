package com.bridgelabz.objectorientedprograms;

public class StackPortfolio {
	
	private String StockNames;
	private long NumberofShare;
	private long SharePrice;

	public String getStockNames() {
		return StockNames;
	}

	public void setStockNames(String stockNames) {
		this.StockNames = stockNames;
	}

	public long getNumberofShare() {
		return NumberofShare;
	}

	public void setNumberofShare(long numberofShare) {
		NumberofShare = numberofShare;
	}

	public long getSharePrice() {
		return SharePrice;
	}

	public void setSharePrice(long sharePrice) {
		SharePrice = sharePrice;
	}
}