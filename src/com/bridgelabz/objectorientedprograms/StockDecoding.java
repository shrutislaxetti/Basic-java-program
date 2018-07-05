package com.bridgelabz.objectorientedprograms;

import java.io.FileReader;
import java.util.Set;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class StockDecoding {
	public static void main(String[] args) throws Exception {

		Object object = new JSONParser().parse(new FileReader("/home/bridgrlabz/shruthi/basicjavaprograms/src/com/bridgelabz/objectorientedprograms/Stock.json"));

		JSONObject jsonoobj = (JSONObject) object;
		@SuppressWarnings("unchecked")

		Set<String> keys = jsonoobj.keySet();
 
		for (String stackkeys : keys) {
			JSONArray stackarray = (JSONArray) jsonoobj.get(stackkeys);
			System.out.println(stackkeys);
			long totalprice = 0;

			for (Object object2 : stackarray) {
				JSONObject stack = (JSONObject) object2;
				long Numberofshare = (long) stack.get("numberofShare");
				long shareprice = (long) stack.get("sharePrice");
				totalprice += (Numberofshare * shareprice);
			}
			System.out.println("price of" + " " + stackkeys + " " + "is " + totalprice);
		}
	}
}