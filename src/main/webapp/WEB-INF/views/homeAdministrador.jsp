<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listado de Centros</title>
</head>
<body>

<h2>Listado de centros </h2>

<h3>${usuarioLogueado}</h3>

<ul>
	<li>Centros</li>
	<c:forEach items="${centros}" var="centro">
	<li>${centro}</li>
	</c:forEach>
</ul>

<br>

<form>
	<input type="text" name="nuevoCentro" placeholder="Introduce el nombre del Centro" required="required"/>
	<input type="text" name="nuevoSuperUsuario" placeholder="Introduce el nombre del SuperUsuario del centro" required="required" />
	<input type="password" name="passSuperUsuario" placeholder="Introduce la contraseña del nuevo SuperUsuario" required="required"/>
	<button formaction="nuevocentro" formmethod="post">Registrar Centro</button>
</form>
</body>
</html>