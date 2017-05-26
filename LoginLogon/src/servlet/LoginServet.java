package servlet;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.User;

 
@WebServlet("/Login")
public class LoginServet extends HttpServlet {
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		String user      = request.getParameter("user");
//		String password  = request.getParameter("password");
		
		//System.out.println("Voce digitou: "+ user +" - " + password);
		
		//request.setAttribute("props" , User.getUserNameAndPassword());
		
		//request.getRequestDispatcher("/test.jsp").forward(request, response);
		
		
		response.sendRedirect("/webapps/test.jsp");
	 
	}
}
