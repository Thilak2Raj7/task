package newaccount;

import java.io.IOException;
import java.util.Map;

import CacheLayer.StoreCache;
import logic.Banking;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logic.Banking;
import org.apache.catalina.webresources.Cache;
import pack.AccountDetails;
public class AccountServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
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
	
	Banking logic=new Banking();
	try 
	{
		
		Map<Integer, Map<Integer, AccountDetails>> map=logic.showAccountDetails();
		System.out.println("map");
	
		request.setAttribute("accountMap", map);
	
	} 
	catch (Exception e) {
		e.printStackTrace();
	}
	
		RequestDispatcher rdDispatcher=request.getRequestDispatcher("AccountDetails.jsp");
		rdDispatcher.forward(request, response);
		
		
	}

}
