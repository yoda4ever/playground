<%@page import="java.util.Map"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de Valores Inseridos</title>
</head>
<body>

<%
	 Map<String, Object> map = (Map<String,Object>) request.getAttribute("atributos");
	
%>

<p align="left"><a href="inputPage.jsp">Novo</a></p>
<br>
<center><h1><strong>Dados Cadastrados</strong></h1></center>
<center>
<table border="1" width="50%">
	<tr>
		<td align="right"><strong>Nome:</strong></td>
		<td align="right"><strong>Valor:</strong></td>
	</tr>
	   <% for(Map.Entry<String,Object> entry : map.entrySet() ) { %>  
	<tr>
		<td align="right"><%=entry.getKey() %></td>
		<td align="right"><%=entry.getValue() %></td>
	</tr>
	 
	<%} %>
</table>



</center>
</body>
</html>