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

/**
 * Servlet implementation class CashDeposit
 */
//@WebServlet("/CashDeposit")
public class CashDeposit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CashDeposit() {
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
	
		
		int ReceiverAccountId=Integer.parseInt(request.getParameter("ReceiverAccountId"));
        int amount=Integer.parseInt(request.getParameter("amount"));
		Banking logic=new Banking();
		try {
			logic.deposit(ReceiverAccountId, amount) ;
			Map<Integer, Map<Integer,AccountDetails>> map=logic.showAccountDetails();
			request.setAttribute("AccountMap", map);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		RequestDispatcher requestDispatcher=request.getRequestDispatcher("AccountServelet");
		requestDispatcher.forward(request, response);
		
	}
	
	

}
