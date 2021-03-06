
package newAccount;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import logic.Banking;
import pack.AccountDetails;

/**
 * Servlet implementation class Update
 */
//@WebServlet("/Update")
public class Update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Update() {
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
		int customerid=Integer.parseInt(request.getParameter("customerId"));
		int accountId=Integer.parseInt(request.getParameter("accountId"));
		
		
		 Banking logic=new Banking();
		 try {
			AccountDetails accObj=logic.getAccountDetailsFile(customerid, accountId);
			request.setAttribute("account", accObj);
			System.out.println("servelet"+"accObj");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 RequestDispatcher requestDispatcher=request.getRequestDispatcher("Update.jsp");
		 requestDispatcher.forward(request, response);
		 
	}
	}

}
