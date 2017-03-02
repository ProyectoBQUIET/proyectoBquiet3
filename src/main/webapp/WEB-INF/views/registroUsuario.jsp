<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registro de Usuarios</title>
</head>
<body>

<h2>Resgistro de Usuarios</h2> 

<form action="registroUsuario" method="get"/>
	<input required="required" type="text" name="usuario" placeholder="Nombre de Usuario"/>  
	<input required="required" type="password"  name="password" placeholder="Password"/> 
	<input type="submit" value="REGISTRO" class="btn btn-info" />
</form>


</body>
</html>