package com.bridgelabz.utility;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Utility {
	public static List<Object> list = new ArrayList<>();
	private static Scanner scanner = new Scanner(System.in);

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
	public static void print(String file) throws Exception {
		list = pareseFile(file);
		ObjectMapper mapper = new ObjectMapper();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(list.get(i)));
		}
		
	}
	public static List<Object> pareseFile(String file) throws FileNotFoundException, IOException, ParseException {
		Object object = new JSONParser().parse(new FileReader(file));
		JSONArray array = (JSONArray) object;
		for (int i = 0; i < array.size(); i++) {
			JSONObject obj = (JSONObject) array.get(i);
			list.add(array.get(i));
			
		}
		return list;
	}
	public static String getproperty(String keys) {
		Properties prop = new Properties();
		FileReader input = null;
		String driver=null;
		try {
			input = new FileReader("/home/bridgrlabz/shruthi/BatchProgram/path.properties");
			prop.load(input);
			 driver=prop.getProperty(keys);
		} catch (IOException e) {
			System.out.println("failed to get the path");
		}
		return driver;
	}

	public static List userInputs(List<Object> list2) {
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
		
		return list2;
		
		
	}

	
     static Person person=new Person();
	public static Person userInputs() {
		System.out.println("Enter first name");
		person.setFirstName(Utility.userInputString());
		System.out.println("Enter last name");
		person.setLastName(Utility.userInputString());
		System.out.println("Enter address");
		person.setAddress(Utility.userInputString());
		System.out.println("Enter city ");
		person.setCity(Utility.userInputString());
		System.out.println("Enter state");
		person.setState(Utility.userInputString());
		System.out.println("Enter Zip");
		person.setZip(Utility.userInputString());
		System.out.println("Enter phone number");
		person.setPhone(Utility.userInputString());
		return person;
		
	}

	public static com.bridgelabz.utility.Person userupdateinputs() {
		System.out.println("Enter address");
		String address=Utility.userInputString();
		person.setAddress(address);
		System.out.println("Enter city ");
		String city=Utility.userInputString();
		person.setCity(city);
		System.out.println("Enter state");
		String state=Utility.userInputString();
		person.setState(state);
		System.out.println("Enter Zip");
		String zip=Utility.userInputString();
		person.setZip(zip);
		System.out.println("Enter phone number");
		String phone=Utility.userInputString();
		person.setPhone(phone);
		
		return person;
	}
	
}
