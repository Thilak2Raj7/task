package serveletpack;
import logic.Banking;
import pack.AccountDetails;

import java.io.IOException;
import java.io.ObjectInputFilter.Config;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
		String name=request.getParameter("name");
		String password=request.getParameter("password");
		
		if(name.equals("log") && password.equals("123"))
		{
		Banking logic=new Banking();
		try {
			Map<Integer,Map<Integer, AccountDetails>> map=logic.showAccountDetails();
			request.setAttribute("accountMap", map);
			RequestDispatcher rdrDispatcher= request.getRequestDispatcher("home.jsp");
			rdrDispatcher.forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		}
	
		else {
			RequestDispatcher rdrDispatcher= request.getRequestDispatcher("login.jsp");
			rdrDispatcher.forward(request, response);
		}
	}

}
