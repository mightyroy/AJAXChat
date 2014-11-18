package ajaxtestpackage;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("LoginServlet launched");
		ServletContext sc = request.getServletContext();
		AccountManager am = (AccountManager) sc.getAttribute("accountManager");
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		boolean loginSuccess = am.checkLogin(username, password);
		if (loginSuccess){
			System.out.println("Login Success");
			RequestDispatcher rd = request.getRequestDispatcher("user welcome.jsp");
			rd.forward(request, response);
		}
		else{
			System.out.println("Login failed");
			RequestDispatcher rd = request.getRequestDispatcher("tryagain.jsp");
			rd.forward(request, response);
			
		}
		
	}

}
