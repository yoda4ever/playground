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
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		int tela = Integer.parseInt(request.getParameter("tela"));
		String redirect = "";
		
		if(tela == 1){
			String nome = request.getParameter("nome");
			redirect = "/tela2.jsp";
			session.setAttribute("nome", nome);
		}if(tela == 2){
			String email =  request.getParameter("email");
			redirect = "/tela3.jsp";
			session.setAttribute("email", email);
		}
		if(tela == 3){
			String telefone = request.getParameter("telefone");
			redirect="/sucesso.jsp";
			session.setAttribute("telefone", telefone);
		}
		
		request.getRequestDispatcher(redirect).forward(request, response);
		
		
	}

}
