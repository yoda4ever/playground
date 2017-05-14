package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.User;

 
@WebServlet("/Login")
public class LoginServet extends HttpServlet {
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String user      = request.getParameter("user");
		String password  = request.getParameter("password");
		
		boolean login = User.validate(user, password);
		
		System.out.println(User.getUserNameAndPassword());
		
		
		
		System.out.println("Voce esta logado: "+ login);
		System.out.println("user"+ user);
		System.out.println("password"+ password);
		 
	}
}
