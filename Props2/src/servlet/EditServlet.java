package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Properties;

 
@WebServlet("/Edit")
public class EditServlet extends HttpServlet {
	  
       
     
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String key = request.getParameter("key");
		String titulo = "";
		
		if(key != null){
			String  value = Properties.getValue(key);
			titulo ="Editar propriedade";
			
			request.setAttribute("key", key);
			request.setAttribute("value", value);
			request.setAttribute("titulo", titulo);
			
		}else{
			titulo="Nova Propriedade";
			request.setAttribute("titulo", titulo);
		}
		
		
		
		request.getRequestDispatcher("/edit.jsp").forward(request, response);
		 
	}

	 

}
