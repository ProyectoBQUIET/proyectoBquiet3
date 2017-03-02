<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login</title>
    
    <script type="text/javascript" src="http://cdnjs.cloudflare.com/ajax/libs/jquery/2.0.3/jquery.min.js"></script>
    <script type="text/javascript" src="http://netdna.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
    <link href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.3.0/css/font-awesome.min.css"
    rel="stylesheet" type="text/css">
    <link href="http://pingendo.github.io/pingendo-bootstrap/themes/default/bootstrap.css"
    rel="stylesheet" type="text/css">
    
    <!--  librerias-->
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">
    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    <!-- CSS-->
    <link rel="stylesheet" href="<c:url value='/resources/css/style.css'/> "/> 
     
    
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
<h1>
    ¡Bienvenido!
</h1>
    <!-- logo -->
    <img src="resources/img/P1d.png" class="imagen"  >
    
    <!--  login formu-->
    <form id="loginform" method="" action="">
        <input type="text" class="input" placeholder="Usuario" /> 
        <input type="password" class="input" placeholder="Contraseña" />
        <input type="submit" class="loginbutton" value="ENTRAR" />
    </form>
<!--  formulario -->
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