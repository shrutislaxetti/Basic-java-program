package com.bridgelabz.objectorientedprograms;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.bridgelabz.utility.Utility;

public class UtilityAddressBook {
	public static List<Object> list = new ArrayList<>();

	public static void addPerson() throws Exception {
		System.out.println("Enter the Name of address book");
		String filename = Utility.userInputString();
		String file = "/home/bridgrlabz/Addressbook/" + filename + ".json";
		System.out.println("enter the number persons");
		int noofperson = Utility.userInputInteger();
		for (int j = 0; j < noofperson; j++) {

			System.out.println("enter detail information about person");
			System.out.println("Enter the  FirstName");
			String firstname = Utility.userInputString();
			System.out.println("Enter the  LastName");
			String lastname = Utility.userInputString();
			System.out.println("Enter the  Address");
			String address = Utility.userInputString();
			System.out.println("Enter the city");
			String city = Utility.userInputString();
			System.out.println("Enter the state");
			String state = Utility.userInputString();
			System.out.println("Enter the  Zipcode");
			String zip = Utility.userInputString();
			System.out.println("Enter the  Phonenumber");
			String phonenumber = Utility.userInputString();
			Person p = new Person(firstname, lastname, address, city, state, zip, phonenumber);
			list.add(p);
		}

		System.out.println("Do you want to Save ...Press Y/N");
		String choice = Utility.userInputString();
		if ("Y".equalsIgnoreCase(choice)) {
			ObjectMapper mapper = new ObjectMapper();
			mapper.writeValue(new File(file), list);

			System.out.println("writing successfull...");
			System.out.println("New file is created");

		}
	}

	public static void print(String file) throws Exception {

		list = pareseFile(file);
		ObjectMapper mapper = new ObjectMapper();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(list.get(i)));
		}
		//System.out.println(list.toString());
	}

	public static void editinformation(int index) throws Exception {
		
		System.out.println("enter your address book to be edited");
		String filename = Utility.userInputString();
		String file = "/home/bridgrlabz/Addressbook/" + filename + ".json";
		Object object = new JSONParser().parse(new FileReader(file));
		JSONArray array = (JSONArray) object;
		for (int i = 0; i < array.size(); i++) {
			//JSONObject obj = (JSONObject) array.get(i);
			list.add(array.get(i));
		}
   
		JSONObject obj = (JSONObject) array.get(index);
		String firstname = (String) obj.get("firstName");
		String lastname = (String) obj.get("lastName");
		System.out.println("Enter the  Address");
		String address = Utility.userInputString();
		System.out.println("Enter the city");
		String city = Utility.userInputString();
		System.out.println("Enter the state");
		String state = Utility.userInputString();
		System.out.println("Enter the  Zipcode");
		String zip = Utility.userInputString();
		System.out.println("Enter the  Phonenumber");
		String phonenumber = Utility.userInputString();
		Person p1 = new Person(firstname, lastname, address, city, state, zip, phonenumber);
		list.remove(index);
		list.add(index, p1);
		System.out.println("Do you want to Save ...Press Y/N");
		String choice = Utility.userInputString();
		if ("Y".equalsIgnoreCase(choice)) {
			ObjectMapper mapper = new ObjectMapper();
			mapper.writeValue(new File(file), list);

			System.out.println("Editing successfull...");
		}
	}

	public static void remove(int index, String file1) throws Exception {
		list = pareseFile(file1);
		if (!list.isEmpty()) {
			//list.remove(index);
			System.out.println("Do you want to Save ...Press Y/N");
			String choice = Utility.userInputString();
			if ("Y".equalsIgnoreCase(choice)) {
				ObjectMapper mapper = new ObjectMapper();
				list.remove(index);
				mapper.writeValue(new File(file1), list);
			}
       
		} else {
			System.out.println(" No items to be deleted!!");
		}
		
	}

	public static List<Object> pareseFile(String file) throws FileNotFoundException, IOException, ParseException {
		Object object = new JSONParser().parse(new FileReader(file));
		JSONArray array = (JSONArray) object;
		for (int i = 0; i < array.size(); i++) {
			//JSONObject obj = (JSONObject) array.get(i);
			list.add(array.get(i));
			
		}
		return list;
	}

	public static void sort() throws Exception {
		System.out.println("enter the address book to be sorted");
		String filename = Utility.userInputString();
		String file1 = "/home/bridgrlabz/Addressbook/"+filename+".json";
		list = pareseFile(file1);

		for (int i = 0; i < list.size() - 1; i++) {
			for (int j = 0; j < list.size() - i - 1; j++) {

				JSONObject person1 = (JSONObject) list.get(j);
				JSONObject person2 = (JSONObject) list.get(j + 1);
				if ((person1.get("lastName").toString()).compareToIgnoreCase(person2.get("lastName").toString()) > 0) {
					JSONObject temp = person1;
					list.set(j, person2);
					list.set(j + 1, temp);
				}
			}
			ObjectMapper mapper = new ObjectMapper();
			mapper.writeValue(new File(file1), list);

		}
	}

	public static void addPersonToexistingfile() throws Exception {
		System.out.println("enter the file name");
		String filename = Utility.userInputString();
		 String file1 = "/home/bridgrlabz/Addressbook/"+filename+".json";
		list = pareseFile(file1);
		System.out.println("enter the name of address book you want to add");
		System.out.println("enter the number of person's");
		int noofperson = Utility.userInputInteger();
		for (int j = 0; j < noofperson; j++) {

			System.out.println("enter detail information about person");
			System.out.println("Enter the  FirstName");
			String firstname = Utility.userInputString();
			System.out.println("Enter the  LastName");
			String lastname = Utility.userInputString();
			System.out.println("Enter the  Address");
			String address = Utility.userInputString();
			System.out.println("Enter the city");
			String city = Utility.userInputString();
			System.out.println("Enter the state");
			String state = Utility.userInputString();
			System.out.println("Enter the  Zipcode");
			String zip = Utility.userInputString();
			System.out.println("Enter the  Phonenumber");
			String phonenumber = Utility.userInputString();
			Person p = new Person(firstname, lastname, address, city, state, zip, phonenumber);
			list.add(p);
		}

		System.out.println("Do you want to Save ...Press Y/N");
		String choice = Utility.userInputString();
		if ("Y".equalsIgnoreCase(choice)) {
			ObjectMapper mapper = new ObjectMapper();
			mapper.writeValue(new File(file1), list);

			System.out.println("writing successfull...");

		}
	}
}