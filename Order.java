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
	private Date orderDate;
	private int orderQuantity;
	private double revenue;
	
	/**
	 * @param orderDate
	 * @param orderItem
	 * @param orderQuantity
	 * @param orderPrice
	 */
	public Order(Date orderDate, int orderQuantity, double revenue) {
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
	 * @return the orderDate
	 */
	public Date getOrderDate() {
		return orderDate;
	}


	/**
	 * @param orderDate the orderDate to set
	 */
	public void setOrderDate(Date orderDate) {
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



	public void setRevenue(double price, double quantity) {
		this.revenue = price * quantity;
	}
	
	public double getRevenue() {
		return revenue;
	}


	@Override
	public String toString() {
		//TODO toString method that returns the menu item(s), quantity and the total price of the order
		return "Order [orderDate=" + orderDate + ", orderQuantity=" + orderQuantity + ", revenue=" + revenue
				+ ", toString()=" + super.toString() + "]";
	}
	
}
