<%@page import="java.util.Set"%>
<%@page import="java.util.Properties"%>
<%@page import="java.io.InputStream"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%!
		Properties props = new Properties();
	%>

	<%
		InputStream is = 	application.getResourceAsStream("WEB-INF/props.txt");
		props.load(is);
		
		Set<Object> key =  props.keySet();
	%>

<center>
	
	<table border="1" width="50%">
		<tr>
			<td><STRONG>Value</STRONG></td>
			<td><STRONG>Property</STRONG></td>
		</tr>
		
		<tr>
		<% for(Object k : key) {%>
			<td><%=k %></td>
			<td><%=props.getProperty((String)k) %></td>
			
		</tr>
		<%} %>
	</table>
	
</center>	


</body>
</html>