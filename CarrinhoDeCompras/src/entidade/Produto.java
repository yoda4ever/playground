package entidade;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class Produto {
	
	int id;
	String nome;
	double valor;
	
	
	private static Map<Integer,Produto>produtos;
	
	static{
		produtos = new LinkedHashMap<Integer,Produto>();
		produtos.put(1,  new Produto(1, "Laptop",1000));
		produtos.put(2,  new Produto(2, "Desktop",2500));
		produtos.put(3,  new Produto(3, "Calculadora HP",500));
		produtos.put(4,  new Produto(4," Impressora HP",375));
		produtos.put(5,  new Produto(5," KeyBoard",50));
		produtos.put(6,  new Produto(6," IPhone 7",7000));
		produtos.put(7,  new Produto(7," Speakers",37));
		produtos.put(8,  new Produto(8," Sansung S7 Edge",4325));
		produtos.put(9,  new Produto(9," IPad 5",2500));
		produtos.put(10, new Produto(10,"HeadSet Logitech",150));
	}
	
	
	private Produto(int i, String n, double v){
		this.id    = i;
		this.nome  = n;
		this.valor = v;
	}
	
	
	public int getId(){
		return this.id;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public double getValor(){
		return this.valor;
	}
	
	public static Collection<Produto> getProdutos(){
		return produtos.values();
	}
	
	public static Produto getProdutoById(int id){
		return produtos.get(id);
	}
	
	

}
