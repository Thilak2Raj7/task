package customerservlet;

import java.io.IOException;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.rowset.JoinRowSet;

import logic.Banking;
import pack.CustomerDetails;

/**
 * Servlet implementation class UpdatedCustomer
 */
//@WebServlet("/UpdatedCustomer")
public class UpdatedCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdatedCustomer() {
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
		String name=request.getParameter("CustomerName");
		int age=Integer.parseInt(request.getParameter("Age"));
		String address=request.getParameter("Address");
		long MobileNumber=Long.parseLong(request.getParameter("MobileNumber"));
		
		
		CustomerDetails cusObj=new CustomerDetails();
		cusObj.setCustomerId(customerId);
		cusObj.setCustomerName(name);
		cusObj.setAge(age);
		cusObj.setAddress(address);
		cusObj.setMobileNumber(MobileNumber);
		Banking logic=new Banking();
		
		try {
			logic.updateCustomer(customerId, cusObj);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher rdrDispatcher=request.getRequestDispatcher("CreateCustomer");
		rdrDispatcher.forward(request, response);
	}
	}
}
