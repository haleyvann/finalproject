/**
 * 
 */
package model;
import java.util.Date;

/**
 * @author brianliamgrant
 *
 */
public class CreditCard extends Customer {
	
	//CreditCard information from the customer
	private int number;
	private Date expDate;
	private int ccv;
	
	/**
	 * @param number
	 * @param expDate
	 * @param ccv
	 */
	public CreditCard(int number, Date expDate, int ccv) {
		this.number = number;
		this.expDate = expDate;
		this.ccv = ccv;
	}
	
	/**
	 * 
	 */
	public CreditCard() {
	}

	
	/**
	 * @return the number
	 */
	public int getNumber() {
		return number;
	}

	/**
	 * @param number the number to set
	 */
	public void setNumber(int number) {
		this.number = number;
	}

	/**
	 * @return the expDate
	 */
	public Date getExpDate() {
		return expDate;
	}

	/**
	 * @param expDate the expDate to set
	 */
	public void setExpDate(Date expDate) {
		this.expDate = expDate;
	}

	/**
	 * @return the ccv
	 */
	public int getCcv() {
		return ccv;
	}

	/**
	 * @param ccv the ccv to set
	 */
	public void setCcv(int ccv) {
		this.ccv = ccv;
	}
	
	/**
	 * used to access DB and return email and password of customer if it exists
	 * @param cust
	 * @return correct cust
	 */
	public Customer checkCustomer(Customer cust) {
		//TODO method needs to check passed in customer info on their email and password.
		//TODO then return the correct customer information or an error message
		return cust;
	}
	
	/**
	 * returns the customer's credit card info if they have placed an order in the past
	 * @param cust
	 * @return
	 */
	public CreditCard retrieveCreditCardInfo(Customer cust) {
		CreditCard cc = new CreditCard(getNumber(), getExpDate(), getCcv());
		return cc;
	}
	
	
	
	
}
