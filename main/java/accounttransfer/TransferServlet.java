package accounttransfer;

import java.io.IOException;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import logic.Banking;
import pack.*;
/**
 * Servlet implementation class TransferServlet
 */
public class TransferServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TransferServlet() {
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
		//int customerId=Integer.parseInt(request.getParameter("customerId"));
		HttpSession session=request.getSession();
		if(session.getAttribute("Admin")==null)
		{
			RequestDispatcher rdDispatcher=request.getRequestDispatcher("login.jsp");
			rdDispatcher.forward(request, response);	
		}
		else {
	int SenderAccountId=Integer.parseInt(request.getParameter("SenderAccountId"));
		//int ReceiverCustomerId=Integer.parseInt(request.getParameter("ReceiverCustomerId"));
		int ReceiverAccountId=Integer.parseInt(request.getParameter("ReceiverAccountId"));
        int amount=Integer.parseInt(request.getParameter("amount"));
		Banking logic=new Banking();
		
	try {
		logic.accountTransfer(ReceiverAccountId, amount, SenderAccountId);
		Map<Integer,Map<Integer, AccountDetails>>accountMap=logic.showAccountDetails();
		request.setAttribute("accountMap", accountMap);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		RequestDispatcher rdrDispatcher=request.getRequestDispatcher("AccountServelet");
		rdrDispatcher.forward(request, response);
		}	
}
}