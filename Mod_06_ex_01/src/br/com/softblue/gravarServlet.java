package br.com.softblue;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import jdk.nashorn.internal.runtime.Context;

 
@WebServlet("/gravar")
public class gravarServlet extends HttpServlet {
	 
       
    
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name =  request.getParameter("name");
		String value = request.getParameter("value");
		
		getServletContext().setAttribute(name, value);
		 
		response.sendRedirect("sucesso.jsp");
		
		 
	}

}
