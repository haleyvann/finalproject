/**
 * 
 */
package model;

/**
 * @author brianliamgrant
 *
 */
public class Menu {

	//information about the menu items
	private String menuItem;
	private double price;
	private String[] ingredients;
	
	/**
	 * @param menuItem
	 * @param price
	 * @param quantity
	 * @param ingredients
	 */
	public Menu(String menuItem, double price, String[] ingredients) {
		this.menuItem = menuItem;
		this.price = price;
		this.ingredients = ingredients;
	}

	
	/**
	 * 
	 */
	public Menu() {
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
	 * @return the ingredients
	 */
	public String[] getIngredients() {
		return ingredients;
	}


	/**
	 * @param ingredients the ingredients to set
	 */
	public void setIngredients(String[] ingredients) {
		this.ingredients = ingredients;
	}


	
	@Override
	public String toString() {
		return "Menu [menuItem=" + menuItem + "]";
	}
	
	
	
}
