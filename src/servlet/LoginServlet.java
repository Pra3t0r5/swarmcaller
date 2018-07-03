package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entities.*;
import business.LoginControler;

/**
 * Servlet implementation class loginServlet
 */
@WebServlet({ "/loginServlet", "/loginservlet", "/LOGINSERVLET", "/LoginServlet", "/Loginservlet" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LoginControler ctrl = new LoginControler();
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		
		System.out.println(email+"|"+password);
		
		User u = new User();
		u.setEmail(email);
		u.setPassword(password);
		u = ctrl.getUser(u);
		
		request.getRequestDispatcher("WEB-INF/UserManagement.jsp").forward(request, response); //Que significa?
	}

}
