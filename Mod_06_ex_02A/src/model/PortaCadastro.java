package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class PortaCadastro {

	private List<Cadastro> lista = new ArrayList<Cadastro>();
	
	
	public void addCadastro(Cadastro c){
		lista.add(c);
	}
	
	public void revomeCadastro(Cadastro c){
		lista.remove(c);
	}
	
	public Collection<Cadastro> getCadastros(){
		return lista;
	}
}
