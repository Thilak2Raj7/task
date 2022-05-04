package serveletpack;
import logic.Banking;
import pack.AccountDetails;
import pack.CustomerDetails;
import java.io.IOException;
import java.io.ObjectInputFilter.Config;
import java.util.Map;
import exception.CustomException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.apache.jasper.tagplugins.jstl.core.ForEach;
import org.apache.jasper.tagplugins.jstl.core.If;
import org.apache.tomcat.util.descriptor.web.LoginConfig;
//import javax.sound.midi.Soundbank;

//import org.apache.jasper.tagplugins.jstl.core.Catch;


/**
 * Servlet implementation class ServeletLogin
 */
//@WebServlet("/ServeletLogin")
public class ServeletLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServeletLogin() {
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
		//String name=request.getParameter("name");
		//String password=request.getParameter("password");
		HttpSession session=request.getSession();
		Banking logic=new Banking();
		try {
		
		Map<Integer,Map<Integer, AccountDetails>> map=logic.showAccountDetails();
		Map<Integer, CustomerDetails> customerMap=logic.showCustomerDetails();
		int userId =Integer.parseInt(request.getParameter("userId"));
		String password=request.getParameter("password");
		request.setAttribute("accountMap", map);
		request.setAttribute("customer", customerMap);
		//request.setAttribute("login",login);
		request.setAttribute("name",userId);
		
		
		if(userId==121 && password.equals("123"))
		{
			session.setAttribute("Admin",121);
			RequestDispatcher rdrDispatcher= request.getRequestDispatcher("AccountDetails.jsp");
			rdrDispatcher.forward(request, response);
			
		}
	else  
		{
		
		   Map<Integer, String> login=logic.readUserInfo(); 
		   for(Integer key:login.keySet())
		   {
			   System.out.println("this is customer"+key);
			   System.out.println("this is customer"+login.get(key));
			   if(userId==key && password.equals(login.get(key)))
			   {
				   session.setAttribute("Customer",key);
				   RequestDispatcher rdrDispatcher= request.getRequestDispatcher("CustomerPage.jsp");
				   rdrDispatcher.forward(request, response);
				}
	
			
			   
		   }
		
           
			
		}
		
	
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			//System.out.println("Entered userId and password is incorrect");
			e.printStackTrace();
			request.setAttribute("Exception", " userId and password is incorrect");
			request.getRequestDispatcher("login.jsp").forward(request, response);
			 }
	
		
		
		
		
		}
	}


