package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dbhelpers.CheckoutQuery;

/**
 * Servlet implementation class CheckoutServlet
 */
@WebServlet("/CheckoutServlet")
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
		int menuID = Integer.parseInt(request.getParameter("menuID"));
		int quantity = Integer.parseInt(request.getParameter("quantity"));
		
		CheckoutQuery cq = new CheckoutQuery("netappsdb", "root", "pwd");
		
		int qtyCheck = cq.checkInv(menuID, quantity);
		
		String checkoutMessage = "";
		
		if(qtyCheck > 0) {
			checkoutMessage = "Order complete!";
			cq.updateInv(menuID, qtyCheck);
		}
		else {
			checkoutMessage = "Sorry, we currently do not posses the inventory to meet your order. Please try again.";
		}
		
		request.setAttribute("checkoutMessage", checkoutMessage);
		String url = "/checkout.jsp";
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
			
		
		
		
	}

}
