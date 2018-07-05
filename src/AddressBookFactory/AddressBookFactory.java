package AddressBookFactory;

import AddressBookSerializer.JDBCSerialization;
import AddressBookSerializer.JsonSerialization;
import AddressBookSerializer.Serialization;

public class AddressBookFactory {
	public static Serialization getdao(String type) {

		if (type.equalsIgnoreCase("json")) {

			return new JsonSerialization();
		} else if (type.equalsIgnoreCase("jdbc")) {
			return new JDBCSerialization();
		} else {
			System.out.println("invalid input");
		}
		return null;
	}
}
