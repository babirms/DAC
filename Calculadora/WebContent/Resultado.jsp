<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Resultado</title>
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet"
	type="text/css" />
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
<style>
</style>
</head>
<body>
	<%
		String primeiroValue = request.getParameter("primeiroValue");
	String segundoValue = request.getParameter("segundoValue");
	String operacao = request.getParameter("operacao");
	String resultado = request.getAttribute("resultado").toString();
	String contador = request.getAttribute("contador").toString();
	%>
	<div class="d-flex flex-column align-items-center col-xs-8">
		<div class="container p-3" style="width:352px;">
			<h1 class="p-3 text-center">Resultado</h1>
			<div class="p-3 mb-2 bg-dark text-white d-flex flex-column">
				<div class="row justify-content-end p-3">
					<%
						out.print(primeiroValue);
					%>
					<%
						out.print(operacao);
					%>
					<%
						out.print(segundoValue);
					%>
				</div>
				<div class="row justify-content-end p-3"><h3>
					<%
						out.print(resultado);
					%></h3>
				</div>
			</div>


			<button class="btn btn-info btn-block mb-3 mt-3 p-2" onclick="history.back()">Voltar</button>
			<div class="shadow-none p-3 mb-5 bg-light rounded text-center">
				Voc� j� esteve aqui
				<%
				out.print(contador);
			%>
				vezes.
			</div>

		</div>
	</div>

</body>
</html>