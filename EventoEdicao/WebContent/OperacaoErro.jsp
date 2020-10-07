<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> Ops ❌</title>
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet"
	type="text/css" />
<!-- THIS LINE -->
<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>

</head>
<body>

	<div class="d-flex flex-column align-items-center col-xs-8">
		<div class="container p-3" style="width: 600px;">
			<div class="alert alert-danger" role="alert">Alguma coisa deu
				errada :(</div>
						
			<button class="btn btn-info btn-block mb-3 mt-3 p-2"
				onclick="history.back()">Voltar</button>
		</div>

	</div>



</body>
</html>