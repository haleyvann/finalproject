package controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dbHelpers.AddOrder;
import model.Customer;
import model.Menu;
import model.Order;

/**
 * Servlet implementation class CheckoutServlet
 */
@WebServlet(description = "takes information from the checkout page and adds an order to the orders table in the DB after the checkout is complete", 
urlPatterns = { "/CheckoutServlet" })
public class CheckoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckoutServlet() {
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

		//send to checkout.jsp
		String url = "/checkout.jsp";
	
		// set up a Order, Customer and Menu object
		Order order = (Order) session.getAttribute("order");
	    
		// set up an addQuery object
//	    AddOrder ao = new AddOrder("pizza", "root", "liammist4630");
	    
		// pass the order to addOrder to add to the database
	    //TODO figure out best way to update the order table
//	    ao.doAdd(order, (Customer) session.getAttribute("cust"), (Menu) session.getAttribute("cust"));
	    
	    
	    RequestDispatcher dispatcher = request.getRequestDispatcher(url);
	    dispatcher.forward(request, response);
	}

}
