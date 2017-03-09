<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title> Home Usuario</title>
	<!--grafica-->
	<script type="text/javascript" src="https://www.gstatic.com/charts/loader.js"></script>
	    <script type="text/javascript" src="resources/js/codigo.js"></script>
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
	<link rel="stylesheet" href="<c:url value='/resources/css/cssusuario.css'/> "/>  
	
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

	
    <img src="<c:url value='/resources/img/P1d.png' />" class="imagen">
     <br>
    <form action="fechaUsuario" method="get" >
	
	<div class="fecha">
	  <span>Fecha: </span> <input type="date" name="fecha"> 
	  <input type="submit" value="Ver estadísticas">
	</div>
	</form>

	<br>
    <p>
		<button id="btCargar">Cargar grafica</button>
	</p>
	<div id="piechart" style="width: 900px; height: 500px"></div> 

    
    <!--  información 	usuario-->
    <div class="section">
      <div class="container">
        <div class="row"> <h2>Información Usuario</h2>
          <div class="col-md-12">
            <div class="caja"> 
            <p>  Nombre usuario: Iván
            <p>  Centro educativo: La Térmica (Málaga)</p>
            <br/>
            <h4 class="text-center">Registros sonoros.....</h4>
            </div>
          </div>
        </div>
      </div>
    </div>

    
    <form action="" method="post">
    	<input type="date" name="date" />
    	<input type="submit">
    </form>
    

	

	
<!--  footer -->

	<footer  class="section">
      <div class="container">
        <div class="row">
          <div class="col-sm-6">
            <h1>Footer header</h1>
            <p> --información extra de contacto /dirección</p>

          </div>
          <div class="col-sm-6">
            <p class="text-info text-right">

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