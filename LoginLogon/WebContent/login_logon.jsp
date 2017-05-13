<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/styles/style.css" />

</head>
<body>

<div class="header">
	<h1>Check out my personal sandbox</h1>
</div>

	<div class="loginPanel">
		<form action="loginLogon" method="get">
			Already a user: <br> 
			<input type="text" name="user"  placeholder="Nome"><br><br>
			<input type="text" name="password"  placeholder="Password"><br><br>
			<input type="submit" value="Login">
			
			
		</form>
	</div>
	
	<div class="logonPanel">
	<h2>Not a member yet?</h2>
	<h3>Join for free</h3>
		 <p>
		 	<a href="Cadastrar">Create your account</a>
		 </p>
		 
	</div>
	
	

</body>
</html>