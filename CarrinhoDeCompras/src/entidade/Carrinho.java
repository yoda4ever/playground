package entidade;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	
	private List<Produto> produtos = new ArrayList<Produto>();
	
	
	public void addProduto(Produto p){
		produtos.add(p);
	}
	
	public void removeProduto(Produto p){
		produtos.remove(p);
	}
	
	public List<Produto>getProdutos(){
		return produtos;
	}
	
	

}
