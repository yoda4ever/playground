<%@page import="java.util.TreeMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.Enumeration"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@   include file="header.jsp" %>        
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro Concluido</title>
</head>
<body>
<%
	
	String telefone = (String) request.getAttribute("telefone");
	
%>

<table>
	<tr>
		<td><strong>Nome:</strong></td>
		<td><%=nome %></td>
	</tr>
	
	<tr>
		<td><strong>Email:</strong></td>
		<td><%=email %></td>
	</tr>
	
	<tr>
		<td><strong>Telefone:</strong></td>
		<td><%=telefone %></td>
	</tr>
</table>


</body>
</html>