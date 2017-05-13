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

<div class="header">
	<h1>Check out my personal sandbox</h1>
</div>
	
	<div class="formulario">
		<form action="Cadastrar" method="get">
			<input type="hidden" name="tela" value="3">
			Telefone:<input type="text" name="telefone">
			<input type="submit" value="submit">
		</form>
	</div>

</body>
</html>