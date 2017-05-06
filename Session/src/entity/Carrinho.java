package entity;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
	
	private List<Produto> produtos =  new ArrayList<Produto>();
	
	
	
	/***
	 * Adiciona produtos ao Carrinho
	 * @param Produto
	 */
	public void add(Produto p){
		produtos.add(p);
	}
	
	/**
	 * Exibe uma lista de todos os
	 * produtos presentes no Carrinho
	 * @return produtos
	 */
	public List<Produto> getProdutos(){
		return produtos;
	}
	
	public void remove(Produto p){
		produtos.remove(p);
	}
	
	public  int getSize(){
		return produtos.size();
	}
	
   

}
