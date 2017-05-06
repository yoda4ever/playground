<%@page import="entity.Produto"%>
<%@page import="java.util.Collection"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Carrinho de Compras</title>
</head>
<body>
	<%
		Collection<Produto> produtos = (Collection<Produto>) request.getAttribute("produtos");
		//int qtd = (int) request.getAttribute("qtd_carrinho");
	%>
	
	<center><strong><h1>Lita de Produtos</h1></strong></center>
	<br><br>
	<div>
		<p style="margin-left: 88%; margin-bottom: 41px;">
			<a href="Carrinho">Meu carrinho</a>
		</p>
	
	</div>
	
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
				<td align="center"><a href="Adicionar?id=<%=p.getId() %>">Adicionar</a></td>
			</tr>
			<%} %>
		</table>
		
		<div>
			<p>Quantidade de Itens: <%=Produto.getQuantidade() %></p>
		</div>

	</center>


</body>
</html>