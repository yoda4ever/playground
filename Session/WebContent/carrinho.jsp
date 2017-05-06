<%@page import="entity.Produto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Meu Carrinho de Compras</title>
</head>
<body>
	<%
		List<Produto> produtos = (List<Produto>)request.getAttribute("produtos");
		Integer size = (Integer)request.getAttribute("size");
	%>

		<center><strong><h1>Meu Carrinho de Compras</h1></strong></center>
	<br><br>
	
	<div>
		<p style="margin-left: 88%; margin-bottom: 41px;">
			<a href="Listar">Voltar para produtos</a>
		</p>
	
	<center>
		<table border="1" width="50%">
			<tr>
				<td align="center"><strong>Produto</strong></td>
				<td align="center"><strong>Valor</strong></td>
				<td align="center"></td>
			</tr>
			
			<% for(Produto p : produtos)  {%>
			<tr>
				<td align="center"><%=p.getNome()%></td>
				<td align="center">R$<%=p.getValor() %></td>
				<td align="center"><a href="Remover?id=<%=p.getId() %>">Remover Produto</a></td>
				
			</tr>
			<%} %>
		</table>
		
		<div>
			<p>Quantidade de Itens: <%=size%></p>
		</div>

	</center>
		

</body>
</html>