/**
 * 
 */
package model;
import java.util.ArrayList;
import java.util.Date;

/**
 * @author brianliamgrant
 *
 */
public class Order extends Menu {

	//information regarding one order
	private int orderID = 0;
	private String orderDate;
	private int orderQuantity = 0;
	private double revenue = 0;
	
	/**
	 * @param orderDate
	 * @param orderItem
	 * @param orderQuantity
	 * @param orderPrice
	 */
	public Order(int orderID, String orderDate) {
		this.orderID += orderID;
		this.orderDate = orderDate;
	}

	
	/**
	 * 
	 */
	public Order() {
	}

	/**
	 * @return the orderID
	 */
	public int getOrderID() {
		return orderID;
	}


	/**
	 * have a set number that increments each time method is called
	 * @param orderID the orderID to set
	 */
	public void setOrderID(int orderID) {
		//TODO increment ID each time method is called (i.e. new order is placed)
		orderID += this.orderID;
		this.orderID = orderID;
	}
	
	/**
	 * @return the orderDate
	 */
	public String getOrderDate() {
		return orderDate;
	}


	/**
	 * @param orderDate the orderDate to set
	 */
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}




	/**
	 * @return the orderQuantity
	 */
	public int getOrderQuantity() {
		return orderQuantity;
	}
	
	public void subtractQuantity(int quantity) {
		this.orderQuantity = orderQuantity - quantity;
	}


	/**
	 * @param orderQuantity the orderQuantity to set
	 */
	public void setOrderQuantity(int orderQuantity) {
		this.orderQuantity = orderQuantity;
	}
	
	public void addToRevenue(double price, int quantity) {
		this.orderQuantity += quantity;
		this.revenue += revenue + (price * quantity);
	}



	public void setRevenue(double price, int quantity) {
		this.revenue = price * quantity;
	}
	
	public double getRevenue() {
		return revenue;
	}


	@Override
	public String toString() {
		//TODO toString method that returns the menu item(s), quantity and the total price of the order
		return "<p>" + "<ul>" + "<li>" + "Time of order: " + orderDate + "</li>" + "<li>" + "Number of items in order: " 
				+ orderQuantity + "</li>" + "<li>" + "Total order price: $" + getRevenue() + "</li>" + "</ul>" + "</p>";
	}
	
}
