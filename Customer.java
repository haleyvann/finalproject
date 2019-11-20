/**
 * 
 */
package model;

/**
 * @author brianliamgrant
 *
 */
public class Customer {

	//customer information
	private String fName;
	private String lName;
	private String phoneNumber;
	private String email;
	private String password;
	private String address;
	private String city;
	private String state;
	private int zip;
	
	/**
	 * @param fName
	 * @param lName
	 * @param phoneNumber
	 * @param email
	 * @param password
	 * @param address
	 * @param city
	 * @param state
	 * @param zip
	 * utilized for passing customer information to the database
	 */
	public Customer(String fName, String lName, String phoneNumber, String email, String password, String address,
			String city, String state, int zip) {
		this.fName = fName;
		this.lName = lName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.password = password;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	
	/**
	 * for using Customer objects in other classes
	 */
	public Customer() {
	}



	/**
	 * @return the fName
	 */
	public String getfName() {
		return fName;
	}


	/**
	 * @param fName the fName to set
	 */
	public void setfName(String fName) {
		this.fName = fName;
	}


	/**
	 * @return the lName
	 */
	public String getlName() {
		return lName;
	}


	/**
	 * @param lName the lName to set
	 */
	public void setlName(String lName) {
		this.lName = lName;
	}


	/**
	 * @return the phoneNumber
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}


	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}


	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}


	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}


	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}


	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}


	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}


	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}


	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}


	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}


	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}


	/**
	 * @return the zip
	 */
	public int getZip() {
		return zip;
	}


	/**
	 * @param zip the zip to set
	 */
	public void setZip(int zip) {
		this.zip = zip;
	}
	
	/**
	 * used in conjunction with methods to get access and write queries to the DB to retrieve information
	 * @param email from DB
	 * @return email if email exists in the DB, error if not
	 */
	public String checkEmail(String email) {
		//TODO check passed in email and return it if correct, or an error message if no email exists
		return email;
	}
	
	/**
	 * used in conjunction with methods to get access and write queries to the DB to retrieve information
	 * take the checked email and include it in the where clause of the query to retrieve password
	 * @param password from DB
	 * @return checked password if the same, error if not
	 */
	public String checkPassword(String password) {
		//TODO method should check the password from the DB with the corresponding email
		return password;
	}
	
	/**
	 * used in the case of the cart page to automatically fill in information for a returning customer
	 * @param email
	 * @param password
	 * @return customer object set here after email and password are checked
	 */
	public Customer retrieveCustomerInfo(String email, String password) {
		Customer cust = new Customer(getfName(), getlName(), getPhoneNumber(), checkEmail(email), checkPassword(password), 
				getAddress(), getCity(), getState(), getZip());
		return cust;
	}
	
}
