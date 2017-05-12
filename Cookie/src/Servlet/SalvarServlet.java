package Servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
@WebServlet("/Salvar")
public class SalvarServlet extends HttpServlet {
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String nome = request.getParameter("nome");
		 String  senha = request.getParameter("senha");
		 
		 Cookie cookie = new Cookie("nomeusu",nome);
		 Cookie cook = new Cookie("senhausu", senha);
		 
		 cookie.setMaxAge(30 * 60);
		 cook.setMaxAge(30 * 60);
		 
		 response.addCookie(cookie);
		 response.addCookie(cook);
		 
		 
		 request.getRequestDispatcher("/sucesso.jsp").forward(request, response);
	}

}
