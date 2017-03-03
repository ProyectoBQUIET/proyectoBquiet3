<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Administrador del Centro</title>
</head>
<body>

<h1>Informcacion del Centro ${centro.nombre}</h1>

<p>${centro}</p>

<h2>Informacion Super Usuario ${superusuario.nombre}</h2>

<p>${superusuario}</p>

<h2>Lista de Usuarios</h2>

<ul>
	<c:forEach items="${usuarios}" var="user">
	<li>${user}</li>
	</c:forEach>
</ul>

<a href="registroUsuario" class="btn btn-warning">Añadir Usuario</a>

</body>
</html>