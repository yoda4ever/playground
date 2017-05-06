package model;

import java.util.LinkedHashMap;
import java.util.Map;

public class Cadastro {
	
	private String nome;
	private String email;
	private String telefone;
	
    private Map<Integer, Cadastro> registros = new LinkedHashMap<Integer, Cadastro>();
    
    
	public Cadastro(String n, String e, String t){
		this.nome =n;
		this.email = e;
		this.telefone = t;
	}
	
	public String getNome(){
		return nome;
	}
	
	public String getEmail(){
		return email;
	}
	
	public String getTelefone(){
		return telefone;
	}
	
	public  void createCadastro(Integer i,Cadastro c){
		registros.put(i, c);
	}
	
	
	

}
