<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Calculadora Resultado</title>
</head>
<body>
	<%
		String primeiroValue = request.getParameter("primeiroValue");
	String segundoValue = request.getParameter("segundoValue");
	String operacao = request.getParameter("operacao");
	String resultado = request.getAttribute("resultado").toString();
	String contador = request.getAttribute("contador").toString();
	%>
	
	<h1>Resultado do c�lculo</h1>
	<form>
		Conta realizada:
		<% out.print(primeiroValue);%>
		<% out.print(operacao); %>
		<% out.print(segundoValue); %>
		
		Resultado:
		<% out.print(resultado); %>
		<br> Visitas: <% out.print(contador); %>
	</form>

	<input type="button" value="Retornar" onclick="history.back()">
	<br>

</body>
</html>