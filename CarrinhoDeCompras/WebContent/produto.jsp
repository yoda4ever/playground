<%@page import="entidade.Produto"%>
<%@page import="java.util.Collection"%>
<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de Produtos</title>
</head>
<body>
	
	<%
		 Collection<Produto> produtos = (Collection<Produto>)request.getAttribute("produtos");
	%>
	
	
	<center><h1><strong>Lista de Comrpras</strong></h1></center>
	
	<div style="text-align: right; margin-right: 25%;">
		<p style="font-family:monospace;">
			<a href="Carrinho">Meu carrinho</a>
		</p>
	</div>
	
	<center>
		<table border="1" width="50%">
			<tr>
				<td align="center"><strong>Nome:</strong></td>
				<td align="center"><strong>Valor:</strong></td>
				<td align="center"></tr>
			</tr>
			
		<% for(Produto p : produtos) { %>   
			<tr>
				<td align="center"> <%=p.getNome() %></td>
				<td align="center">R$ <%= p.getValor() %></td>
				<td align="center"><a href="Adicionar?id=<%=p.getId() %>">comprar</a></td>
			</tr>
			
		<%} %>	
		</table>
	</center>
	 
	
	
	
</body>
</html>