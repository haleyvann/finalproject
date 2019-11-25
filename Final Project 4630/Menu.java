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
	private int quantity;
	
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

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}


	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public String toString() {
		String img = "<p>" + "<ul>" + "<li>" + "<img src=";
		
		if(this.menuItem.equalsIgnoreCase("Pepperoni Pizza")) {
			img += "'pep.jpg'/>" + "</li>";
		} else if(this.menuItem.equalsIgnoreCase("Cheese Pizza")) {
			img += "'cheese.jpg'/>" + "</li>";
		} else if(this.menuItem.equalsIgnoreCase("Vegan Pizza")) {
			img += "'veganPizza.jpg'/>" + "</li>";
		} else if(this.menuItem.equalsIgnoreCase("Meat Lovers Pizza")) {
			img += "'meatPizza.jpg'/>" + "</li>";
		} else {
			img += "'bcPizza.jpg'/>" + "</li>";
		}
		return img + "</ul>" + quantity + " " + menuItem + "s for $" + price + " each" + "</p>";
	}
	
}
