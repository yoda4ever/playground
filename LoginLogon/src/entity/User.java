package entity;

import java.io.FileInputStream;
import java.util.Enumeration;
import java.util.Map;
import java.util.TreeMap;

public class User {
	
	private static final String LOGIN_LOGON = "/WebContent/WEB-INF/userInfo.txt";
	private static java.util.Properties userInfo;
	private static  String name;
	private static  String password;
	
	
	static{
		userInfo = new java.util.Properties();
		
		try {
			userInfo.load(new FileInputStream(LOGIN_LOGON));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	private User(){}
	
	
	
	public static String getName(){
		return name;
	}
	
	public static String getPassword(){
		return password;
	}
	

	
	
	public static Map<String, String> getUserNameAndPassword(){
		
		 Map<String, String> props = new TreeMap<String, String>();
		 
		 Enumeration<Object> e = userInfo.keys();
		 while(e.hasMoreElements()){
			 String nome = (String) e.nextElement();
			 String pw   = userInfo.getProperty(nome);
			 props.put(nome, pw);
		 }
		  
			return props;
		}
	
	
	
	public static boolean validaUser(){
		
		Map<String, String> props = User.getUserNameAndPassword();
		String nome ="";
		String pw = "";
			
		for(Map.Entry<String, String> map : props.entrySet()){
			
			nome = (String)  map.getKey();
			pw =   (String)  map.getValue();
		}
		
		System.out.println("Nome Correto do Usuario: "+ nome);
		System.out.println("Senha Correta do Usuario: "+ pw);
		
		
		return true;
	}
	
	
	
	
	
//	public static boolean validate(String nome, String pssw){
//		
//		boolean user = false;
//		boolean pw = false;
//		boolean retorno = false;
//		
//		Enumeration<Object> e = userInfo.keys();
//		
//		while(e.hasMoreElements()){
//			if(nome.equals(e.hasMoreElements())){
//				user = true;
//			   System.out.println("Para o nome vc digitou: "+ nome);
//			}if(pssw.equals(userInfo.getProperty(nome))){
//				pw = true;
//				System.out.println("Para a senha vc digitou: "+ pssw);
//			}if(user & pw == true){
//				retorno = true;
//			}
//		}
//		
//		
//		return retorno;
//	}
	
	
	
	
	
	

}
