package serveletpack;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		//System.out.println(name);
		//System.out.println(password);
		//PrintWriter  out=response.getWriter();
		if(name.equals("log") && password.equals("123"))
		{
		RequestDispatcher rdrDispatcher= request.getRequestDispatcher("home.jsp");
		rdrDispatcher.forward(request, response);
		}
		else if(name.equals("customer") && password.equals("123"))
		{
			RequestDispatcher rdrDispatcher=request.getRequestDispatcher("CustomerPage.jsp");
			rdrDispatcher.forward(request, response);
		}
		else {
			RequestDispatcher rdrDispatcher= request.getRequestDispatcher("login.jsp");
			rdrDispatcher.forward(request, response);
		}
	}

}
