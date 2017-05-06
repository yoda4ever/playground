package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Cadastro;
import model.PortaCadastro;


@WebServlet("/Gravar")
public class GravarServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id  = Integer.parseInt(request.getParameter("id"));
		String nome     = request.getParameter("name");
		String email    = request.getParameter("email");
		String telefone = request.getParameter("phone"); 
		int idTemp = 1;
		
		System.out.println("Nome: "+ nome);
		System.out.println("Email: "+ email);
		System.out.println("Telefone: "+ telefone);
		
		HttpSession session = request.getSession();
		
		
		Cadastro cad  = new Cadastro(nome,email,telefone);
		
		cad = (Cadastro) session.getAttribute("registro");
		
		cad.createCadastro(idTemp, cad);
		
		PortaCadastro pc = new PortaCadastro();
		pc.addCadastro(cad);
		
		request.setAttribute("cad", cad);
		
		request.getRequestDispatcher("/resultado.jsp").forward(request, response);
	}

}
