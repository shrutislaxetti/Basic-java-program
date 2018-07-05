package AddressBookSerializer;

public interface Serialization {
	
	public void create() throws Exception;

	public void view() throws Exception;

	public void deleteAddressBook();

	public void addPerson() throws Exception;

	public void updatePerson() throws Exception;

	public void deletePerson() throws Exception;
}
