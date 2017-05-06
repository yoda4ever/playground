package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entity.Carrinho;
import entity.Produto;

@WebServlet("/Listar")
public class ListarServlet extends HttpServlet {
	
   	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   		
   		/**
   		 * Adiciona "produtos" à request 
   		 * para ser acessada pela JSP.
   		 */
   		
   		 
   		
   		request.setAttribute("produtos", Produto.getProdutos());
   		request.setAttribute("qtd", Produto.getQuantidade());
   		 
   		
   		
   		request.getRequestDispatcher("/produtos.jsp").forward(request, response);
   		
   		 
		
   	}
	 
}
