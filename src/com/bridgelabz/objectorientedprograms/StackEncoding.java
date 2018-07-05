package com.bridgelabz.objectorientedprograms;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.utility.Utility;

public class StackEncoding {

	public static void main(String[] args) throws Exception {

		Map<String, List<StackPortfolio>> map = new HashMap<>();
		String file = "/home/bridgrlabz/shruthi/basicjavaprograms/src/com/bridgelabz/objectorientedprograms/Stock.json";

		StackPortfolio getsetvalue = new StackPortfolio();

		System.out.println("enter the number of stocks");
		int noofstocks = Utility.userInputInteger();

		for (int i = 0; i < noofstocks; i++) {
			System.out.println("Enter the Stock Name");
			String name = Utility.userInputString();
			System.out.println("Enter the number of types in each Share ..");
			int number = Utility.userInputInteger();
			ArrayList<StackPortfolio> list = new ArrayList<>();

			for (int j = 0; j < number; j++) {
				System.out.println("enter the Share Name");
				getsetvalue.setStockNames(Utility.userInputString());
				System.out.println("enter the Number of Share's..");
				getsetvalue.setNumberofShare(Utility.userInputInteger());
				System.out.println("enter the Share Price");
				getsetvalue.setSharePrice(Utility.userInputInteger());
				list.add(getsetvalue);
			}
			map.put(name, list);
		}
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File(file), map);

		System.out.println("writing successfull...");

	}
}