package AddressBookSerializer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bridgelabz.utility.Person;
import com.bridgelabz.utility.Utility;

public class JDBCSerialization implements Serialization {
	Connection connection = null;
	Statement statement = null;
	ResultSet resultset = null;
	PreparedStatement preparedStatement = null;
	String driver = Utility.getproperty("Driver");
	String user = Utility.getproperty("user");
	String passward = Utility.getproperty("password");
	String url = "jdbc:mysql://localhost:3306/AddressBook?user="+user+"&password="+passward;
	/**
	 * function to get the connction which loads and register the driver
	 */
	Person person=new Person();
	public Connection getConnection() {
		try {
			Class.forName(driver);
			System.out.println("driver class loaded and registered");
			connection = DriverManager.getConnection(url);
			System.out.println("connecton established");

		} catch (Exception e) {
			System.out.println("failed to establish connection");
		}
		return connection;
	}

	public void closeconnection() {
		if (resultset != null) {
			try {
				statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (statement != null) {
			try {
				statement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		if (connection != null) {
			try {
				connection.close();
			} catch (SQLException e) {

				e.printStackTrace();
			}
		}
	}

	@Override
	public void create() throws SQLException {
		
		System.out.println("enter the name of address book you want to create");
		String filename = Utility.userInputString();
		
		String insert = "insert into addressbook values('" + filename + "')";
		Statement statement1 = null;
		String query = "create table " + filename
				+ "(id int(2) auto_increment,first_name varchar(15),last_name varchar(10),address varchar(20),city varchar(20),state varchar(3),zip int(5),phone int(10),primary key(id))";
		try {
			statement = getConnection().createStatement();
			statement.execute(query);
			
			System.out.println("new AddressBook Created");
			statement1 = getConnection().createStatement();
			statement1.execute(insert);
			closeconnection();
		} catch (SQLException e) {
			System.out.println("address book already exist ");
			System.out.println("create an new Address book");
		}
	}

	@Override
	public void view() {
		
		String addressBooks = "select * from addressbook";
		try {
			statement = getConnection().createStatement();
			resultset = statement.executeQuery(addressBooks);
			while (resultset.next()) {
				System.out.println(resultset.getString(1));
			}
			closeconnection();
		} catch (SQLException e) {
			System.out.println("not found");
		}
	}

	@Override
	public void addPerson() {
		System.out.println("enter the name of address book");
		try {
		String filename=Utility.userInputString();
		
		String insert = "insert into " + filename + " values(?,?,?,?,?,?,?,?)";
		person=Utility.userInputs();
		
			preparedStatement = getConnection().prepareStatement(insert);
			preparedStatement.setInt(1, 0);
			preparedStatement.setString(2, person.getFirstName());
			preparedStatement.setString(3, person.getLastName());
			preparedStatement.setString(4, person.getAddress());
			preparedStatement.setString(5, person.getCity());
			preparedStatement.setString(6, person.getState());
			preparedStatement.setString(7, person.getZip());
			preparedStatement.setString(8, person.getPhone());
			preparedStatement.execute();
			System.out.println("Person address added successfully");
			closeconnection();
		} catch (SQLException e) {
			System.out.println("file not found !! create an address book ");
		}
	}

	@Override
	public void updatePerson() {
		String sql = "Select * From addressbook";
		List<String> list=new ArrayList<>();
		
		System.out.println("enter the name of address book");
		String filename=Utility.userInputString();
		try {
		System.out.println("enter the name of person to be updated");
		String fname=Utility.userInputString();
		String update = "update " + filename + " set address=?, city=?, state=?, zip=?, phone=? where firstName='"+fname+"'";
		person=Utility.userupdateinputs();
			preparedStatement = getConnection().prepareStatement(update);
			preparedStatement.setString(1, person.getAddress());
			preparedStatement.setString(2, person.getCity());
			preparedStatement.setString(3, person.getState());
			preparedStatement.setString(4, person.getZip());
			preparedStatement.setString(5, person.getPhone());
			preparedStatement.executeUpdate();
			System.out.println("updated person address successfully");
			closeconnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void deletePerson() {
		System.out.println("enter the name of address book");
		String addressBook=Utility.userInputString();
		try {
		System.out.println("enter the name of person to be deleted");
		String fname=Utility.userInputString();
		String delete = "delete from " + addressBook + " where firstName='" + fname + "'";
		    statement = getConnection().createStatement();
			statement.execute(delete);
			System.out.println("Deleted the person");
			closeconnection();
		    } 
		catch (SQLException e) {
			e.printStackTrace();
		}
		
		}	
		
	@Override
	public void deleteAddressBook() {
		System.out.println("enter the address book you waant to delete");
		String address = Utility.userInputString();
		String delete = "delete from addressbook where AddressbookNames='" + address + "'";
		String drop = "drop table " + address;
		try {
			statement = getConnection().createStatement();
			statement.execute(delete);
			statement = getConnection().createStatement();
			statement.execute(drop);
			System.out.println("deleted the addressbook");
			closeconnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
