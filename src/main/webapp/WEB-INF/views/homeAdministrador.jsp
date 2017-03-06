<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<!--  pingendon -->
<link
	href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.3.0/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">
<link
	href="http://pingendo.github.io/pingendo-bootstrap/themes/default/bootstrap.css"
	rel="stylesheet" type="text/css">

<!-- Font Awesome -->
<link
	href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.3.0/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">

<!--  librerias Bootstrap-->
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<!-- Optional theme -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
	integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp"
	crossorigin="anonymous">

<!-- Local CSS-->
<link rel="stylesheet" href="<c:url value='/resources/css/css3.css'/> " />

<title>Listado de Centros</title>
<meta charset="UTF-8">
</head>
<body>

	<!--  heading -->
	<div class="navbar navbar-default navbar-static-top">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#navbar-ex-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#"><span>bQuiet</span></a>
			</div>
			<div class="collapse navbar-collapse" id="navbar-ex-collapse">
				<ul class="nav navbar-nav navbar-right">
					<li class="active"><a href="#">Inicio</a></li>
					<li><a href="#">Contacta</a></li>
				</ul>
			</div>
		</div>
	</div>

	<!-- logo -->
	<img src="resources/img/P1d.png" class="imagen" />

	<h2>Listado de centros</h2>

	<h3>${usuarioLogueado}</h3>

	<h2>CENTROS</h2>
	<ul>
		<c:forEach items="${centros}" var="centro">
			<li> ${centro.nombre} (${centro.provincia}) <a href="<c:url value='/gestionar/${centro.nombre}'/>">Gestionar</a> <a href="">Eliminar</a>
			</li>
		</c:forEach>
	</ul>

	<br>

	<!-- Registro formulario -->
	<div class="section ">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<h2>REGISTRO CENTRO EDUCATIVO</h2>
					<div class="form-group text-center">
						<form>
							<p>
								Nombre Centro educativo <input required="required" type="text"
									name="nuevoCentro"
									placeholder=" Introduce el nombre del centro educativo" />
							</p>
							<p>
								Provincia <input required="required" type="text"
									name="provinciaCentro"
									placeholder=" Introduce provincia del centro educativo" />
							</p>
							
							<p>
								Nombre Director/a (SuperUsuario) <input required="required"
									type="text" name="nuevoSuperUsuario"
									placeholder="Introduce el nombre del SuperUsuario" />
							</p>
							<p>
								Contraseña <input required="required" type="password"
									name="passSuperUsuario" placeholder="Introduce tu contraseña" />
							</p>
							<button class="active btn btn-danger" data-toggle="button"
								formaction="nuevocentro" formmethod="post">Registrar
								Centro</button>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>

	<!--  footer -->

	<footer class="section">
		<div class="container">
			<div class="row">
				<div class="col-sm-6">
					<h1>Footer header</h1>
					<p>
						--información extra de contacto /dirección <br>
					</p>
				</div>
				<div class="col-sm-6">
					<p class="text-info text-right">
						<br> <br>
					</p>
					<div class="row">
						<div class="col-md-12 hidden-xs text-right">
							<a href=><i class="fa fa-3x fa-fw fa-instagram text-warning"></i></a>
							<a href="#"><i class="fa fa-3x fa-fw fa-twitter text-info"></i></a>
							<a href="https://www.facebook.com/losrobonautas/"><i
								class="fa fa-3x fa-facebook fa-fw text-primary"></i></a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</footer>




</body>
</html>