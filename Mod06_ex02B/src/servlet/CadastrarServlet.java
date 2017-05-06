package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
 
@WebServlet("/Cadastrar")
public class CadastrarServlet extends HttpServlet {
	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	   	 HttpSession session = request.getSession();
		
		 int pagina =  Integer.parseInt(request.getParameter("pagina"));
		 String nextPage =  null;
		
		 if( pagina == 1){
			 String email =  request.getParameter("email");
			 session.setAttribute("email", email);
			 nextPage = "/tela2.jsp";
			 
		 }	else if(pagina == 2){
			 String nome =  request.getParameter("nome");
			 session.setAttribute("nome", nome);
			 nextPage = "/tela3.jsp";
			 
		 }	else if(pagina == 3){
			 String telefone =  request.getParameter("telefone");
			 session.setAttribute("telefone", telefone);
			 nextPage =  "/dados.jsp";
		 }
		 
		 request.getRequestDispatcher(nextPage).forward(request, response);
		 
		 
		
		
		
		
	}

}
