<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
 <!--  pingendon -->
    
    <link href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.3.0/css/font-awesome.min.css"
    rel="stylesheet" type="text/css">
    <link href="http://pingendo.github.io/pingendo-bootstrap/themes/default/bootstrap.css"
    rel="stylesheet" type="text/css">
    
       
    <!-- Font Awesome -->
    <link href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.3.0/css/font-awesome.min.css"
    rel="stylesheet" type="text/css">
    
    <!--  librerias Bootstrap-->
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
    
    
    <!-- Local CSS-->
    <link rel="stylesheet" href="<c:url value='/resources/css/css3.css'/> "/>  
    
<title>Listado de Centros</title>
</head>
<body>

<h2>Listado de centros </h2>

<h3>${usuarioLogueado}</h3>

Centros
<ul>
	<c:forEach items="${centros}" var="centro">
	<li>
		<a href="<c:url value='/gestionar/${centro.nombre}'/>">${centro}</a>
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
           <div class="form-group text-center" > 
            <form >
              <p>Nombre Centro educativo 
                <input required="required" type="text" name="nuevoCentro" placeholder=" Introduce el nombre del centro educativo"/>
              </p>
              <p> Nombre Director/a (SuperUsuario) 
                <input required="required" type="text"  name="nuevoSuperUsuario" placeholder="Introduce el nombre del SuperUsuario"/>
             </p>
              <p>Contraseña 
                <input required="required" type="password" name="passSuperUsuario" placeholder="Introduce tu contraseña"/>
                </p>
              <button class="active btn btn-danger" data-toggle="button" formaction="nuevocentro" formmethod="post">Registrar Centro</button>
            </form>
</body>
</html>