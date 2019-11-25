/**
 * 
 */
package model;

import java.util.ArrayList;

/**
 * @author brianliamgrant
 *
 */
public class Menu {

	//information about the menu items
	private int menuID;
	private String menuItem;
	private double price;
	
	/**
	 * @param menuItem
	 * @param price
	 */
	public Menu(int menuID, String menuItem, double price) {
		this.menuID = menuID;
		this.menuItem = menuItem;
		this.price = price;
	}

	
	/**
	 * 
	 */
	public Menu() {
	}


	
	/**
	 * @return the menuID
	 */
	public int getMenuID() {
		return menuID;
	}


	/**
	 * @param menuID the menuID to set
	 */
	public void setMenuID(int menuID) {
		this.menuID = menuID;
	}


	/**
	 * @return the menuItem
	 */
	public String getMenuItem() {
		return menuItem;
	}


	/**
	 * @param menuItem the menuItem to set
	 */
	public void setMenuItem(String menuItem) {
		this.menuItem = menuItem;
	}


	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}


	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}


	@Override
	public String toString() {
		String img = "<img src=";
		
		if(this.menuItem.equalsIgnoreCase("Pepperoni Pizza")) {
			img += "whatever the link is to finish the tag";
		} else if(this.menuItem.equalsIgnoreCase("Cheese Pizza")) {
			img += "whatever the link is to finish the tag";
		} else if(this.menuItem.equalsIgnoreCase("Vegan Pizza")) {
			img += "whatever the link is to finish the tag";
		} else if(this.menuItem.equalsIgnoreCase("Meat Lovers Pizza")) {
			img += "whatever the link is to finish the tag";
		} else {
			img += "whatever the link is to finish the tag";
		}
		return img + menuItem + " price $" + price +
				"<form name=\"addQuantity\" action=\"CheckoutServlet\" method=\"post\"> " + "<br>" +
				"<input type=\"text\" name=\"addQuantity\" value=\"Quantity of Item\" >" + "<br>";
	}
	

	
	
	
}
