<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html">
<html>
<head>
<link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registro Centros</title>
</head>
<body>
<h2>Resgistro de Centros</h2> 
<%--Lo hace el Super Usuario, que es el director del centro--%>

<form action="registroCentros" method="get"/>
	<input required="required" type="text" name="usuario" placeholder="Nombre del centro"/> 
	<input required="required" type="text"  name="superUsuario" placeholder="Super Usuario(Director/a)"/> 
	<input required="required" type="password"  name="password" placeholder="Password"/> 
	<input type="submit" value="REGISTRO" class="btn btn-info" />
</form>



</body>
</html>