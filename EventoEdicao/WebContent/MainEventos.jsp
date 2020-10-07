<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Eventos - Página Inicial</title>
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet"
	type="text/css" />
<!-- THIS LINE -->
<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
</head>
<body>

	<div class="d-flex flex-column align-items-center col-xs-8">
		<div class="container p-3" style="width: 600px;">
			<h1 class="p-3">Eventos</h1>

			<div class="accordion" id="accordionExample">
				<div class="card">
					<div class="card-header" id="headingOne">
						<h2 class="mb-0">
							<button class="btn btn-link btn-block text-left" type="button"
								data-toggle="collapse" data-target="#collapseOne"
								aria-expanded="true" aria-controls="collapseOne">
								Inserir um novo Evento</button>
						</h2>
					</div>

					<div id="collapseOne" class="collapse"
						aria-labelledby="headingOne" data-parent="#accordionExample">
						<div class="card-body">
							<form action="RegistrarEventoServlet" method="get">
								<div class="form-group">
									<label for="nome">Insira o Nome do Evento: </label> <input
										type="text" class="form-control" name="nome"
										id="nome" required>
								</div>
								<div class="form-group">
									<label for="sigla">Insira a Sigla do Evento:  </label> <input
										type="text" id="sigla" class="form-control"
										name="sigla" required>
								</div>
								<div class="form-group">
									<label for="areaConcentracao">Insira a Área de Concentração: </label> <input
										type="text" id="areaConcentracao" class="form-control"
										name="areaConcentracao" required>
								</div>
									<div class="form-group">
									<label for="instOrg">Insira a Insitituição Organizadora:  </label> <input
										type="text" id="instOrg" class="form-control"
										name="instOrg" required>
										</div>
								<button class="btn btn-block btn-success" type="submit">Registrar</button>
							</form>
						</div>
					</div>
				</div>
				<div class="card">
					<div class="card-header" id="headingTwo">
						<h2 class="mb-0">
							<button class="btn btn-link btn-block text-left collapsed"
								type="button" data-toggle="collapse" data-target="#collapseTwo"
								aria-expanded="false" aria-controls="collapseTwo">
								Remover um Evento</button>
						</h2>
					</div>
					<div id="collapseTwo" class="collapse" aria-labelledby="headingTwo"
						data-parent="#accordionExample">
						<div class="card-body">	
						<form action="RemoverEventoServlet" method="get">
								<div class="form-group">
									<label for="idEventoRemover">Insira o id do Evento a ser excluido: </label> <input
										type="text" class="form-control" name="idEventoRemover"
										id="idEventoRemover" required>
								</div>
								<button class="btn btn-danger btn-block" type="submit">Excluir</button>
							</form>
						</div>
					</div>
				</div>
				<div class="card">
					<div class="card-header" id="headingThree">
						<h2 class="mb-0">
							<button class="btn btn-link btn-block text-left collapsed"
								type="button" data-toggle="collapse"
								data-target="#collapseThree" aria-expanded="false"
								aria-controls="collapseThree">Editar um Evento</button>
						</h2>
					</div>
					<div id="collapseThree" class="collapse"
						aria-labelledby="headingThree" data-parent="#accordionExample">
						<div class="card-body"><form action="EditarEventoServlet" method="get">
								<div class="form-group">
									<label for="idEventoEditar">Insira o id do Evento a ser alterado: </label> <input
										type="text" class="form-control" name="idEventoEditar"
										id="idEventoEditar">
										
										<div class="form-group">
									<label for="nome">Insira o novo Nome do Evento: </label> <input
										type="text" class="form-control" name="nome"
										id="nome">
								</div>
								<div class="form-group">
									<label for="sigla">Insira a nova Sigla do Evento:  </label> <input
										type="text" id="sigla" class="form-control"
										name="sigla">
								</div>
								<div class="form-group">
									<label for="areaConcentracao">Insira a nova Área de Concentração: </label> <input
										type="text" id="areaConcentracao" class="form-control"
										name="areaConcentracao">
								</div>
									<div class="form-group">
									<label for="instOrg">Insira a nova Insitituição Organizadora:  </label> <input
										type="text" id="instOrg" class="form-control"
										name="instOrg">
								</div>
								</div>
								<button class="btn btn-success text-white" type="submit">Editar</button>
							</form>
						</div>
					</div>
				</div>
			</div>

			<button class="btn btn-info btn-block mb-3 mt-3 p-2"
				onclick="history.back()">Voltar</button>

		</div>
	</div>

</body>
</html>