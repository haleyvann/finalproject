package controllers;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Customer;
import dbhelpers.Validate;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "/index.jsp";
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Validate valid = new Validate("netappsdb", "root", "pwd");
        
        String email = request.getParameter("email");
        String pass = request.getParameter("pass");
		
		Customer cust = new Customer();
		cust.setEmail(email);
		cust.setPassword(pass);
        
        
        if(valid.checkUser(email, pass)){
            RequestDispatcher rs = request.getRequestDispatcher("/index.jsp");
            rs.forward(request, response);
        }
        else{
          // out.println("Username or Password incorrect");
           RequestDispatcher rs = request.getRequestDispatcher("/login.jsp");
           rs.forward(request, response);
        }
		
	}

}
