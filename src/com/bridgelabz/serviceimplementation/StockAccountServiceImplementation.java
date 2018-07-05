package com.bridgelabz.serviceimplementation;

import java.io.File;
import java.util.LinkedList;

import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.model.Stock;
import com.bridgelabz.service.StockAcccountService;
import com.bridgelabz.utility.Utility;

public class StockAccountServiceImplementation implements StockAcccountService  {
	File stockfile = new File("/home/bridgrlabz/shruthi/Stock/src/com/bridgelabz/file/StockAccount.json");
	
	static ObjectMapper mapper = new ObjectMapper();
	LinkedList<Stock> stocklist=new LinkedList<>();
	
	public void addStock() throws Exception {
	
		stocklist = (LinkedList<Stock>) Utility.parseJSONArray(stockfile,Stock.class);
		stocklist = Utility.addStock(stocklist);
		System.out.println("Do you want to Save ...Press Y/N");
		String choice = Utility.userInputString();
		if ("Y".equalsIgnoreCase(choice)) {
			mapper.writeValue(stockfile, stocklist);
			System.out.println("Writing successful..");
		}	
	}

	
	public void deleteStock() throws Exception {
	
		stocklist = (LinkedList<Stock>) Utility.parseJSONArray(stockfile, Stock.class);
		System.out.println("Enter the Stock Symbol to be deleted");
		if (!stocklist.isEmpty()) {
			
			String stocksymbol = Utility.userInputString();

			for (int i = 0; i < stocklist.size(); i++) {

				if (stocklist.get(i).getStocksymbol().equalsIgnoreCase(stocksymbol))
					stocklist.remove(i);
			}
			mapper.writeValue(stockfile, stocklist);
			System.out.println("Do you want to Save ...Press Y/N");
			String choice = Utility.userInputString();
			if ("Y".equalsIgnoreCase(choice)) {
				mapper.writeValue(stockfile, stocklist);
			}

		} else {
			System.out.println("list is empty...");
		}
	}

}
