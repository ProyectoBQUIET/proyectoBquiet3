<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Registro centros educativos</title>
	
	<!--  pingendon -->
	<script type="text/javascript" src="http://cdnjs.cloudflare.com/ajax/libs/jquery/2.0.3/jquery.min.js"></script>
    <script type="text/javascript" src="http://netdna.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
    <link href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.3.0/css/font-awesome.min.css"
    rel="stylesheet" type="text/css">
    <link href="http://pingendo.github.io/pingendo-bootstrap/themes/default/bootstrap.css"
    rel="stylesheet" type="text/css">
    
    	<!-- jQuery library -->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>

	<!-- Latest compiled JavaScript -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    
    <!-- Font Awesome -->
	<link href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.3.0/css/font-awesome.min.css"
    rel="stylesheet" type="text/css">
	
	<!--  librerias Bootstrap-->
	<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
	<!-- Optional theme -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
	<!-- Latest compiled and minified JavaScript -->
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
	
	<!-- Local CSS-->
	<link rel="stylesheet" href="<c:url value='/resources/css/css3.css'/> "/>  
	
</head>
<body>

<!--  heading -->
    <div class="navbar navbar-default navbar-static-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navbar-ex-collapse">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="#"><span>bQuiet</span></a>
        </div>
        <div class="collapse navbar-collapse" id="navbar-ex-collapse">
          <ul class="nav navbar-nav navbar-right">
            <li class="active">
              <a href="#">Inicio</a>
            </li>
            <li>
              <a href="#">Contacta</a>
            </li>
          </ul>
        </div>
      </div>
    </div>
    
    <!-- logo -->
	<img src="resources/img/P1d.png" class="imagen"  >
    
    
<!-- Registro formulario -->

    <div class="section ">
      <div class="container">
        <div class="row">
          <div class="col-md-12">
            <h2>REGISTRO CENTRO EDUCATIVO</h2>

           
            <form action=" " method="" class="form-group text-center">
              <p>Nombre Centro educativo
                <input required="required" type="text" name="usuarioCentro" placeholder=" Introduce el nombre del centro educativo"
                class="form-control text-center"/>
              </p>
              <p> Nombre Director/a (SuperUsuario)
                <input required="required" type="text"  name="superUsuario" placeholder="Introduce el nombre del Director/a"
                class="form-control text-center"/>
              </p>
              <p>Contraseña
                <input required="required" type="password" name="password" placeholder="Introduce tu contraseña"
                class="form-control text-center">
              </p>
              <p>Repetir contraseña
                <input required="required" type="password" name="password2"
                placeholder="Repite tu contraseña" class="form-control text-center">
              </p>
              <input type="submit" value="Registrar" class="active btn btn-danger" data-toggle="button">
            </form>
          </div>
        </div>
      </div>
    </div>
	
	
	
<!--  footer -->

	<footer  class="section">
      <div class="container">
        <div class="row">
          <div class="col-sm-6">
            <h1>Footer header</h1>
            <p> --información extra de contacto /dirección
              <br></p>
          </div>
          <div class="col-sm-6">
            <p class="text-info text-right">
              <br>
              <br>
            </p>
            <div class="row">
              <div class="col-md-12 hidden-xs text-right">
                <a href=><i class="fa fa-3x fa-fw fa-instagram text-warning"></i></a>
                <a href="#"><i class="fa fa-3x fa-fw fa-twitter text-info"></i></a>
                <a href="https://www.facebook.com/losrobonautas/"><i class="fa fa-3x fa-facebook fa-fw text-primary"></i></a>
              </div>
            </div>
          </div>
        </div>
      </div>
  </footer>
</body>
</html>