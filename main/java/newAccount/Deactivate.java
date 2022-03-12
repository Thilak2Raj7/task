package newAccount;

import java.io.IOException;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import logic.Banking;
import pack.AccountDetails;

/**
 * Servlet implementation class Deactivate
 */
//@WebServlet("/Deactivate")
public class Deactivate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Deactivate() {
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
				
				boolean status=false;
				logic.changeStatus(customerId,accountId,status);
				}
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 RequestDispatcher requestDispatcher=request.getRequestDispatcher("DeactivatedAccounts.jsp");
		 requestDispatcher.forward(request, response);
		
		
		
	}

}
