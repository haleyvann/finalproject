/**
 * 
 */
package model;
import java.util.Date;

/**
 * @author brianliamgrant
 *
 */
public class Order extends Menu {

	//information regarding one order
	private int orderID = 0;
	private String orderDate;
	private int orderQuantity;
	private double revenue;
	
	/**
	 * @param orderDate
	 * @param orderItem
	 * @param orderQuantity
	 * @param orderPrice
	 */
	public Order(int orderID, String orderDate, int orderQuantity, double revenue) {
		this.orderID += orderID;
		this.orderDate = orderDate;
		this.orderQuantity = orderQuantity;
		this.revenue = revenue;
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


	/**
	 * @param orderQuantity the orderQuantity to set
	 */
	public void setOrderQuantity(int orderQuantity) {
		this.orderQuantity = orderQuantity;
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
		return "Order [orderDate=" + orderDate + ", orderQuantity=" + orderQuantity + ", revenue=" + revenue
				+ "]";
	}
	
}
