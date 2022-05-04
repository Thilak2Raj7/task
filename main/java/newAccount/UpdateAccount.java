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
 * Servlet implementation class UpdateAccount
 */
//@WebServlet("/UpdateAccount")
public class UpdateAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateAccount() {
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
		HttpSession session=request.getSession();
		if(session.getAttribute("Admin")==null)
		{
			RequestDispatcher rdDispatcher=request.getRequestDispatcher("login.jsp");
			rdDispatcher.forward(request, response);	
		}
		else {
        int accountId=Integer.parseInt(request.getParameter("AccountId"));
		String branch=request.getParameter("Branch");
		int customerId=Integer.parseInt(request.getParameter("CustomerId"));
		AccountDetails accObj=new AccountDetails();
		accObj.setAccountId(accountId);
		accObj.setCustomerId(customerId);
		accObj.setBranch(branch);
		Banking logic=new Banking();
		try {
			logic.updateMap(accountId,customerId,accObj);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher rdrDispatcher=request.getRequestDispatcher("AccountServelet");
		rdrDispatcher.forward(request, response);
		
	}
	}
}
