
package newAccount;

import java.io.IOException;
import java.util.Map;

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
 * Servlet implementation class ActivateAccount
 */
//@WebServlet("/ActivateAccount")
public class ActivateAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ActivateAccount() {
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
			
	
		int accountId=Integer.parseInt(request.getParameter("accountId"));
		Banking logic=new Banking();
		Map<Integer, Map<Integer, AccountDetails>> accountMap;
		try {
			accountMap = logic.showAccountDetails();
			for(Integer customerId:accountMap.keySet())
			{
			Map<Integer,AccountDetails> accMap=accountMap.get(customerId);
			if(accMap.containsKey(accountId))
			{
				AccountDetails accObj=accMap.get(accountId);
				 customerId=accObj.getCustomerId();
				
				boolean status=true;
				logic.changeStatus(customerId,accountId,status);
				}
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 RequestDispatcher requestDispatcher=request.getRequestDispatcher("AccountServelet");
		 requestDispatcher.forward(request, response);
		
		}	
		
	}
	}


