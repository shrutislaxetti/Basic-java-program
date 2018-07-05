package AddressBookSerializer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bridgelabz.utility.Person;
import com.bridgelabz.utility.Utility;

public class JdbcSerialization implements Serialization {
	Connection connection = null;
	Statement statement = null;
	ResultSet resultset = null;
	PreparedStatement preparedStatement = null;
	String driver = Utility.getproperty("Driver");
	String user = Utility.getproperty("user");
	String passward = Utility.getproperty("password");
	String url = "jdbc:mysql://localhost:3306/AddressBook?user=" + user + "&password=" + passward;
	List<String> list = new ArrayList<>();
	/**
	 * function to get the connction which loads and register the driver
	 */
	Person person = new Person();

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
	public void create() throws Exception {

	}

	@Override
	public List<String> view() throws Exception {
		try {
			String str = "SELECT * FROM AddressBook";
			statement = getConnection().createStatement();
			resultset = preparedStatement.executeQuery(str);

			while (resultset.next()) {
				//System.out.println(resultset.getString(1));
				list.add(resultset.getString(1));
				closeconnection();
			}

		} catch (SQLException e) {
			System.out.println("not found");
		}
    return list;
	}

	@Override
	public void deleteAddressBook() {
		// TODO Auto-generated method stub

	}

	@Override
	public void addPerson() throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void updatePerson() throws Exception {
		// TODO Auto-generated method stub

	}

	@Override
	public void deletePerson() throws Exception {
		// TODO Auto-generated method stub

	}

}
