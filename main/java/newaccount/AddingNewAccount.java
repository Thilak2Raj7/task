package newaccount;

import java.io.IOException;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.el.parser.BooleanNode;

import logic.Banking;
import pack.AccountDetails;

/**
 * Servlet implementation class AddingNewAccount
 */
//WebServlet("/AddingNewAccount")
public class AddingNewAccount extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddingNewAccount() {
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
			
		
		int customerId=Integer.parseInt(request.getParameter("Customer"));
		
		String branch=request.getParameter("Branch");
		boolean status=Boolean.parseBoolean(request.getParameter("AccountStatus"));
		
		Banking logicBanking=new Banking();
		AccountDetails accInfo=new AccountDetails();
		accInfo.setCustomerId(customerId);
		
		accInfo.setAccountStatus(status);
		accInfo.setBranch(branch);
		try {
			logicBanking.addAccount(customerId, accInfo);
			Map<Integer,Map<Integer, AccountDetails>>accountMap=logicBanking.showAccountDetails();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   RequestDispatcher requestDispatcher=request.getRequestDispatcher("AccountServelet");
	requestDispatcher.forward(request, response);	
	}
	}
}
