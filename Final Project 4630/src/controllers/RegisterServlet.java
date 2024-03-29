package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Customer;
import dbhelpers.Register;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
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
		String fName = request.getParameter("fName");
		String lName = request.getParameter("lName");
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		String confPass = request.getParameter("confPass");
		String phone = request.getParameter("phone");
			
		
		if(pass.equals(confPass)) {
			Customer cust = new Customer();
			cust.setfName(fName);
			cust.setlName(lName);
			cust.setEmail(email);
			cust.setPassword(pass);
			cust.setPhone(phone);
			
			Register reg = new Register("pizza", "root", "liammist4630");
			
			reg.doRegister(cust);

			RequestDispatcher rs = request.getRequestDispatcher("/index.jsp");
	        rs.forward(request, response);
		}else {
			RequestDispatcher rs = request.getRequestDispatcher("/register.jsp");
	        rs.forward(request, response);  
		}
	}

}
