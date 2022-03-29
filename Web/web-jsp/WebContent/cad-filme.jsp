<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro de Filme</title>
</head>
<body>
	<form action="grava-filme.jsp">
		<div align="center">

			<h1>Cadastro de Filmes</h1>

			Nome: &nbsp <input type="text" name="nome"> &nbsp <br> <br>
			Valor: &nbsp &nbsp <input type="text" name="valor"> &nbsp <br> <br>
			Gênero:&nbsp <input type="text" name="genero"> &nbsp <br> <br>
			Disponível:&nbsp &nbsp &nbsp 
			<input type="radio" name="disponivel" value="Sim" checked> Sim
			<input type="radio"  name="disponivel" value="Não"> Não &nbsp &nbsp &nbsp &nbsp <br> <br>
			<input type="submit" value="Gravar"> <br> <br>
			<a href="index.jsp">Página Principal</a>
		</div>
	</form>

</body>
</html>