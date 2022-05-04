
package customerservlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import logic.Banking;
import pack.CustomerDetails;

/**
 * Servlet implementation class UpdateCustomer
 */
//@WebServlet("/UpdateCustomer")
public class UpdateCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateCustomer() {
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
		// TODO Auto-generated method stub
		//doGet(request, response);
		HttpSession session=request.getSession();
		if(session.getAttribute("Admin")==null)
		{
			RequestDispatcher rdDispatcher=request.getRequestDispatcher("login.jsp");
			rdDispatcher.forward(request, response);	
		}
		else {
			
		
		int customerId=Integer.parseInt(request.getParameter("customerId"));
		Banking logic=new Banking();
		try {
			CustomerDetails cusObj=(CustomerDetails)logic.getCustomerDetailsFile(customerId);
			request.setAttribute("CustomerObject", cusObj);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher requestDispatcher=request.getRequestDispatcher("CustomerUpdate.jsp");
		requestDispatcher.forward(request, response);	
			
		
		}	
	}

}
