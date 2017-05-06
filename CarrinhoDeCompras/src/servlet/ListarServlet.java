package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entidade.Produto;
 
@WebServlet("/Listar")
public class ListarServlet extends HttpServlet {
	 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("produtos", Produto.getProdutos());
		
		request.getRequestDispatcher("/produto.jsp").forward(request, response);
		 
	}

}
