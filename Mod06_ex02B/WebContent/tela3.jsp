<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Cadastro</title>
</head>
<body style="background-color: coral;">

		<center>
			<h1 style="font-family: cursive;font-size: -webkit-xxx-large;">
				Cadastro de Usu�rio
			</h1>
		</center>
		
		<br><br>
		
		<center>
			<form action="Cadastrar" method="post">
				<input type="hidden" name="pagina" value="3">
				
				<p style="font-size: 25px;font-family: cursive;"> Telefone:
					<input type="text" maxlength="35" name="telefone"  autofocus style="height: 20px; width: 21%; font-size: 20px; text-align: center;">
					<button>Concluir</button>
				</p>
			</form>
		</center>
	
	

</body>
</html>