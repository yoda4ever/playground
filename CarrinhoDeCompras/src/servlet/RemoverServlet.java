package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entidade.Carrinho;
import entidade.Produto;

@WebServlet("/Remover")
public class RemoverServlet extends HttpServlet {
	

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id =  Integer.parseInt(request.getParameter("id"));
		Produto p =  Produto.getProdutoById(id);
		
		HttpSession session = request.getSession();
		
		Carrinho carrinho = (Carrinho) session.getAttribute("carrinho");
		
		carrinho.removeProduto(p);
		
		request.setAttribute("carrinho", carrinho);
		
		request.getRequestDispatcher("/Carrinho").forward(request, response);
		
		
		
	}

}
