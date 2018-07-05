package com.bridgelabz.objectorientedprograms;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.codehaus.jackson.map.ObjectMapper;

import com.bridgelabz.utility.Utility;

public class InventoryManager {

	public static void main(String[] args) throws Exception {

		Map<String, List<Inventoryinitialization>> map = new HashMap<>();
		String file = "/home/bridgrlabz/test3.json";
		
		System.out.println("enter the number of products in each inventory");
		int type = Utility.userInputInteger();

		for (int i = 0; i < type;i++) {

			System.out.println("enter the each inventory type..");
			int numoftimes = Utility.userInputInteger();

			for (int l = 0; l < numoftimes; l++) {
				
				System.out.println("enter the  Name of  inventory");
				String s=(Utility.userInputString());
				
				ArrayList<Inventoryinitialization> list = new ArrayList<>();

				for (int j = 0; j < numoftimes; j++) {
					
					Inventoryinitialization ob = new Inventoryinitialization();
					
					System.out.println("enter the product name");
					ob.setName(Utility.userInputString());

					System.out.println("enter the price");
					long price = Utility.userInputInteger();
					ob.setPrice(price);

					System.out.println("enter the wieght");
					long weight = Utility.userInputInteger();
					ob.setWeight(weight);
					list.add(ob);
				}
				map.put(s, list);
			}
		}
			ObjectMapper mapper = new ObjectMapper();
			mapper.writeValue(new File(file), map);
			
			System.out.println("writing successfull...");
           return;
		
	}
}