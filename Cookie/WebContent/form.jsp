<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Formulário</title>
</head>
<body>

	<%
		Cookie[] cookies = request.getCookies();
		String nome = "";
		String senha= "";
		
		if(cookies != null){//===============
				
				for(Cookie c : cookies){
					
					if(c.getName().equals("nomeusu")){
						
						nome = c.getValue();
						
					}else if(c.getName().equals("senhausu")){
						
						senha = c.getValue();
						
					}
					
				}

		}//==================================
		
			
	%>


<form action="Salvar" method="get">
	Nome do usuário: <input type="text" name="nome" value="<%=nome%>" style="text-align: center;">
	Senha <input type="password" name="senha" value="<%=senha %>" style="text-align: center;">
	<input type="submit" value="Processar">
</form>

</body>
</html>