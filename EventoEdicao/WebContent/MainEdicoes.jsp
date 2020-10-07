<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edições - Página Inicial</title>
<link href="bootstrap/css/bootstrap.min.css" rel="stylesheet"
	type="text/css" />
<!-- THIS LINE -->
<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
<script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="d-flex flex-column align-items-center col-xs-8">
		<div class="container p-3" style="width: 600px;">
			<h1 class="p-3">Edições</h1>

			<div class="accordion" id="accordionExample">
				<div class="card">
					<div class="card-header" id="headingOne">
						<h2 class="mb-0">
							<button class="btn btn-link btn-block text-left" type="button"
								data-toggle="collapse" data-target="#collapseOne"
								aria-expanded="true" aria-controls="collapseOne">
								Inserir uma nova Edição</button>
						</h2>
					</div>

					<div id="collapseOne" class="collapse" aria-labelledby="headingOne"
						data-parent="#accordionExample">
						<div class="card-body">
							<form action="RegistrarEdicaoServlet" method="post">
								<div class="form-group">
									<label for="num">Insira o número da Edição: </label> <input
										type="number" class="form-control" name="num" id="num"
										required>
								</div>
								<div class="form-group">
									<label for="ano">Insira o ano da Edição:</label> <input
										type="number" id="ano" class="form-control" name="ano"
										required>
								</div>
								<div class="form-group">
									<label for="dataInicio">Insira a Data de Início: </label> <input type="date" id="dataInicio"
										class="form-control" name="dataInicio" required>
								</div>
								<div class="form-group">
									<label for="dataFinal">Insira a Data de Fim:</label> <input type="date" id="dataFinal"
										class="form-control" name="dataFinal" required>
								</div>
								
								<div class="form-group">
									<label for="cidade">Insira a Cidade Sede:</label> <input type="text" id="cidade"
										class="form-control" name="cidade" required>
								</div>
								
								<div class="form-group">
									<label for="pais">Insira o País Sede:</label> <input type="text" id="pais"
										class="form-control" name="pais" required>
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
								Remover uma Edição</button>
						</h2>
					</div>
					<div id="collapseTwo" class="collapse" aria-labelledby="headingTwo"
						data-parent="#accordionExample">
						<div class="card-body">
							<form action="RemoverEdicaoServlet" method="post">
								<div class="form-group">
									<label for="idEdicaoRemover">Insira o id da Edição a ser removida: </label> <input type="text" class="form-control"
										name="idEdicaoRemover" id="idEdicaoRemover" required>
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
								aria-controls="collapseThree">Editar uma Edição</button>
						</h2>
					</div>
					<div id="collapseThree" class="collapse"
						aria-labelledby="headingThree" data-parent="#accordionExample">
						<div class="card-body">
							<form action="EditarEdicaoServlet" method="post">
								<div class="form-group">
									<label for="idEdicaoEditar">Insira o id da Edição a ser
										alterada: </label> <input type="text" class="form-control"
										name="idEventoEditar" id="idEventoEditar">

								<div class="form-group">
									<label for="num">Insira o novo número da Edição: </label> <input
										type="number" class="form-control" name="num" id="num"
										required>
								</div>
								<div class="form-group">
									<label for="ano">Insira o novo ano da Edição:</label> <input
										type="number" id="ano" class="form-control" name="ano"
										required>
								</div>
								<div class="form-group">
									<label for="dataInicio">Insira a nova Data de Início: </label> <input type="date" id="dataInicio"
										class="form-control" name="dataInicio" required>
								</div>
								<div class="form-group">
									<label for="dataFinal">Insira a nova Data de Fim:</label> <input type="date" id="dataFinal"
										class="form-control" name="dataFinal" required>
								</div>
								
								<div class="form-group">
									<label for="cidade">Insira a nova Cidade Sede:</label> <input type="text" id="cidade"
										class="form-control" name="cidade" required>
								</div>
								
								<div class="form-group">
									<label for="pais">Insira o novo País Sede:</label> <input type="text" id="pais"
										class="form-control" name="pais" required>
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