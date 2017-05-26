<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/styles/style.css" />
</head>
<body>

<%

		String nome     = (String) session.getAttribute("nome");
		String email    = (String) session.getAttribute("email");
		String telefone = (String) session.getAttribute("telefone");
		
%>

	
	<div class="header">
		<h1>Check out my personal sandbox</h1>
	</div>
	
	<div class="resultCadastro">
		 <table>
		 	<tr>
		 		<td>Nome:</td>
		 		<td><%=nome %></td>
		 	</tr>
		 	
		 	<tr>
		 		<td>Email:</td>
		 		<td><%=email %></td>
		 	</tr>
		 	
		 	<tr>
		 		<td>Telefone:</td>
		 		<td><%=telefone %></td>
		 	</tr>
		 	
		 </table>
	</div>

</body>
</html>