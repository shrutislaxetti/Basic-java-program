package AddressBookSerializer;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.map.ObjectMapper;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import com.bridgelabz.utility.Person;
import com.bridgelabz.utility.Utility;

public class JsonSerialization implements Serialization{
	Person person=new Person();
	public static List<Object> list = new ArrayList<>();
	
	@Override
	public void create() throws Exception {
	System.out.println("enter the name of address book you want to create");
	String filename=Utility.userInputString();
	String file = "/home/bridgrlabz/Addressbook/" + filename + ".json";	
	System.out.println("Do you want to Save ...Press Y/N");
	String choice = Utility.userInputString();
	if ("Y".equalsIgnoreCase(choice)) {
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File(file),list);
		System.out.println("New address book is created");
	  }
	}
	
	@Override
	public void view() throws Exception {
		File folder = new File("/home/bridgrlabz/Addressbook/");
		File[] listOfFiles = folder.listFiles();
		for (File file : listOfFiles) {
			if (file.isFile()) {
				System.out.println(file.getName());
			}
		}
		System.out.println("Enter the file name you want View");
		String filename = Utility.userInputString();
		String file = "/home/bridgrlabz/Addressbook/" + filename + ".json";

		Utility.print(file);
	
		
	}
	@SuppressWarnings("unchecked")
	@Override
	public void addPerson() throws Exception {
		System.out.println("enter the address book name");
		String filename = Utility.userInputString();
				
	try {	
	String file = "/home/bridgrlabz/Addressbook/"+filename+".json";
	list = Utility.pareseFile(file);
		list=Utility.userInputs(list);
		System.out.println("Do you want to Save ...Press Y/N");
		String choice = Utility.userInputString();
		if ("Y".equalsIgnoreCase(choice)) {
			ObjectMapper mapper = new ObjectMapper();
			mapper.writeValue(new File(file), list);

			System.out.println("writing successfull...");

		   }
	}
	catch(Exception e) {
	System.out.println("file not found!! create an address book");
	 }
	}	
		
	
	@Override
	public void updatePerson() throws Exception {
		File folder = new File("/home/bridgrlabz/Addressbook/");
		File[] listOfFiles = folder.listFiles();
		for (File file : listOfFiles) {
			if (file.isFile()) {
				System.out.println(file.getName());
			}
		}
	    System.out.println("enter your address book to be edited");
	    String filename = Utility.userInputString();
		String file = "/home/bridgrlabz/Addressbook/" + filename + ".json";

		Utility.print(file);
	
	    System.out.println("enter the index value ");
		int index = Utility.userInputInteger();
		
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
	@Override
	public void deletePerson() throws Exception {
	File folder = new File("/home/bridgrlabz/Addressbook/");
		File[] listOfFiles = folder.listFiles();
		for (File file : listOfFiles) {
			if (file.isFile()) {
				System.out.println(file.getName());
			}
		}
		System.out.println("enter particular the address book name to delete a person");
		
		String filename = Utility.userInputString();
		
		String file = "/home/bridgrlabz/Addressbook/"+filename+".json";
		Utility.print(file);
		
		System.out.println("enter the index value ");
		int index = Utility.userInputInteger();
		
		remove(index,file);
	}

	private void remove(int index, String file) throws Exception{
		list = Utility.pareseFile(file);
		if (!list.isEmpty()) {
			//System.out.println(list.toString());
			//list.remove(index);
			System.out.println("Do you want to Save ...Press Y/N");
			String choice = Utility.userInputString();
			if ("Y".equalsIgnoreCase(choice)) {
				ObjectMapper mapper = new ObjectMapper();
				
				System.out.println(list.toString());
				
				list.remove(index);
				
				mapper.writeValue(new File(file), list);
			}
       
		} else {
			System.out.println(" No items to be deleted!!");
		}
		
	}

	@Override
	public void deleteAddressBook() {
		System.out.println("Enter the address book you want to delete");
		File file = new File("/home/bridgrlabz/Addressbook/"+Utility.userInputString()+".json");
		if(file.delete()) {
		System.out.println("file deletion successfull");	
		}
		else {
			System.out.println("Deletion not successfull");
		}
	}
}
