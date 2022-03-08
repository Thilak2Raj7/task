package accounttransfer;

import java.io.IOException;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import logic.Banking;
import pack.AccountDetails;

/**
 * Servlet implementation class CashWithdrawal
 */
//@WebServlet("/CashWithdrawal")
public class CashWithdrawal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CashWithdrawal() {
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
		
		int ReceiverAccountId=Integer.parseInt(request.getParameter("ReceiverAccountId"));
        int amount=Integer.parseInt(request.getParameter("amount"));
		Banking logic=new Banking();
		try {
			logic.withdraw( ReceiverAccountId, amount);
			Map<Integer, Map<Integer,AccountDetails>> map=logic.showAccountDetails();
			System.out.println("map");
			request.setAttribute("accountMap", map);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher requestDispatcher=request.getRequestDispatcher("AccountServelet");
		requestDispatcher.forward(request, response);
		
	}
	
}	

