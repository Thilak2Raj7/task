package accounttransfer;

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
import pack.CustomerDetails;

/**
 * Servlet implementation class TransferAmount
 */
//@WebServlet("/TransferAmount")
public class TransferAmount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TransferAmount() {
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
		int senderAccountId=Integer.parseInt(request.getParameter("SenderAccountId"));
		//int ReceiverCustomerId=Integer.parseInt(request.getParameter("ReceiverCustomerId"));
		int receiverAccountId=Integer.parseInt(request.getParameter("ReceiverAccountId"));
        int amount=Integer.parseInt(request.getParameter("amount"));
		Banking logic=new Banking();
		
	try {
		Map<Integer,CustomerDetails> customerMap=logic.showCustomerDetails();
		
			Map<Integer,Map<Integer, AccountDetails>>accountMap=logic.showAccountDetails();
			for(Integer key:accountMap.keySet())
			{
			Map<Integer,AccountDetails> account=accountMap.get(key);
			if(account.containsKey(senderAccountId))
			{
				request.setAttribute("name",key);	
		    request.setAttribute("customer", customerMap);
		
		    logic.accountTransfer(receiverAccountId, amount, senderAccountId);
		accountMap=logic.showAccountDetails();
		    request.setAttribute("accountMap", accountMap);
			}
			}
	}  catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		RequestDispatcher rdrDispatcher=request.getRequestDispatcher("CustomerPage.jsp");
		rdrDispatcher.forward(request, response);
		
}
	}


