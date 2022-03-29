<%@page import="java.io.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dados do Filme</title>
</head>
<body>
	<div align="center">
		<h1>Filme salvo com sucesso!</h1>
		<h2>Dados do Filme</h2>
		Nome:&nbsp ${param.nome} <br>
		Valor:&nbsp &nbsp  &nbsp &nbsp ${param.valor} <br>
		G�nero:&nbsp &nbsp ${param.genero} <br>
		Dispon�vel: ${param.disponivel}

<%

String 
	   nome = request.getParameter("nome"),
       valor = request.getParameter("valor"),
       genero = request.getParameter("genero"),
       disponivel = request.getParameter("disponivel");
		

		//classe auxiliar para carregar um arquivo existente ou criar um novo arquivo
		File arquivo = new File("C:\\Workspace Eclipse\\web-jsp\\filmes.txt");
		
		try {
			//classe auxiliar para gerar um objeto de mem�ria para grava��o do arquivo
			FileOutputStream arquivoOutput = new FileOutputStream(arquivo, true);
			
			//classe auxiliar para gerar o arquivo e seu conte�do
			PrintStream gravador = new PrintStream(arquivoOutput);
			
			//gravando o conte�do do arquivo
			gravador.print(nome);
			gravador.print(";");
			gravador.print(valor);
			gravador.print(";");
			gravador.print(genero);
			gravador.print(";");
			gravador.print(disponivel);
			gravador.println(";");
			
			//fechando o processo de grava��o
			gravador.close();
			arquivoOutput.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
%>
		                     <br>
		<br> <a href="index.jsp">P�gina Principal</a>
		<br> <a href="cad-filme.jsp">Cadastro de Filmes</a>

	</div>
</body>
</html>