package customerservlet; 

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import logic.Banking;
import pack.CustomerDetails;

/**
 * Servlet implementation class AddingNewCustomer
 */
//@WebServlet("/AddingNewCustomer")
public class AddingNewCustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddingNewCustomer() {
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
		System.out.println("customer");
		String customerName=request.getParameter("Name");
		int age=Integer.parseInt(request.getParameter("Age"));
		String address=request.getParameter("Address");
		long mobileNumber=Long.parseLong(request.getParameter("MobileNumber"));
		boolean status=Boolean.parseBoolean(request.getParameter("Status"));
		
		
	CustomerDetails customerObj=new CustomerDetails();
	
		customerObj.setCustomerName(customerName);
		customerObj.setAge(age);
		customerObj.setAddress(address);
		customerObj.setMobileNumber(mobileNumber);
		customerObj.setCustomerStatus(status);
		Banking logic=new Banking();
	
		try {
			Map<Integer, CustomerDetails> customer=new HashMap<Integer, CustomerDetails>();
			logic.addCustomer(customerObj);
			
			customer = logic.showCustomerDetails();
			request.setAttribute("Customer", customer);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	RequestDispatcher requestDispatcher=request.getRequestDispatcher("CreateCustomer");
	requestDispatcher.forward(request, response);
	
	}
	

}
