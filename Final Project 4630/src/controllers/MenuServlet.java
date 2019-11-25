package controllers;

import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Menu;
import model.Order;

/**
 * Servlet implementation class MenuServlet
 */
@WebServlet("/MenuServlet")
public class MenuServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MenuServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		// retrieve quantity information from the menu.jsp
		int quantity;
		
		// default jsp 
		String url = "/index.jsp";
		
		Menu cart = new Menu();
		Order order = (Order) session.getAttribute("order");
		
		// setup the selected menu item and update cart depending on which submit button was pressed
		if(request.getParameter("addPep") != null) {
			// pass to menu page
			url = "/menu.jsp";
			// setup pep pizza to pass to the cart
			Menu selectedPep = new Menu(1, "Pepperoni Pizza", 10.99);
			order.addToRevenue(selectedPep.getPrice(), Integer.parseInt(request.getParameter("addQuantity")));
			cart = selectedPep;
		} else if(request.getParameter("addCheese") != null) {
			// pass to menu page
			url = "/menu.jsp";
			// setup selected cheese pizza to pass to the cart
			Menu selectedCheese = new Menu(2, "Cheese Pizza", 9.99);
			order.addToRevenue(selectedCheese.getPrice(), Integer.parseInt(request.getParameter("addQuantity")));
			cart = selectedCheese;
		} else if(request.getParameter("addVegan") != null) {
			// pass to menu page
			url = "/menu.jsp";
			// setup selected vegan pizza to pass to the cart
			Menu selectedVegan = new Menu(3, "Vegan Pizza", 11.99);
			order.addToRevenue(selectedVegan.getPrice(), Integer.parseInt(request.getParameter("addQuantity")));
			cart = selectedVegan;
		} else if(request.getParameter("addML") != null) {
			// pass to menu page
			url = "/menu.jsp";
			// setup selected ml pizza to pass to the cart
			Menu selectedML = new Menu(4, "Meat Lovers Pizza", 12.99);
			order.addToRevenue(selectedML.getPrice(), Integer.parseInt(request.getParameter("addQuantity")));
			cart = selectedML;
		} else if(request.getParameter("addBC") != null) {
			url = "/menu.jsp";
			// setup selected bc pizza to pass to the cart
			Menu selectedBC = new Menu(5, "Buffalo Chicken Pizza", 13.99);
			order.addToRevenue(selectedBC.getPrice(),Integer.parseInt(request.getParameter("addQuantity")));
			cart = selectedBC;
		} else if(request.getParameter("cart") != null) {
			url = "/cart.jsp";
			// setup selected bc pizza to pass to the cart
		} 
		 
		  // send cart information to the menu.jsp and attach it to the session
		request.setAttribute("cart", cart);
		
		  // send control to the next component
		  RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		  dispatcher.forward(request, response);
	}

}
