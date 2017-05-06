package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entity.Carrinho;
import entity.Produto;

 
@WebServlet("/Carrinho")
public class CarrinhoServlet extends HttpServlet {
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		Carrinho carrinho =  (Carrinho)session.getAttribute("carrinho");
		
		if(carrinho == null){
			carrinho = new Carrinho();
			session.setAttribute("carrinho", carrinho);
		}
		List<Produto> produtos = carrinho.getProdutos();
		
		
		
		request.setAttribute("produtos", produtos);
		request.setAttribute("size", carrinho.getSize());
		
		request.getRequestDispatcher("/carrinho.jsp").forward(request, response);
		
	
	}

}
