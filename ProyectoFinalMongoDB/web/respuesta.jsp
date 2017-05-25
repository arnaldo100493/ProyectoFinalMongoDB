<%-- 
    Document   : respuesta
    Created on : 25/05/2017, 01:18:43 AM
    Author     : ArnaldoAndres
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
       <title>Respuesta</title>
        <script type="text/javascript" src="js/jsControles.js"></script>
        <link href="../css/bootstrap-theme.css" rel="stylesheet" type="text/css"/>
        <link href="../css/bootstrap-theme.css.map" rel="stylesheet" type="text/css"/>
        <link href="../css/bootstrap-theme.min.css" rel="stylesheet" type="text/css"/>
        <link href="../css/bootstrap.css" rel="stylesheet" type="text/javascript"/>
        <link href="../css/bootstrap.css.map" rel="stylesheet" type="text/css"/>
        <link href="../css/bootstrap.min.css" rel="stylesheet" type="text/css"/>
        <script src="../js/libs/bootstrap/bootstrap.js" type="text/javascript"></script>
        <script src="../js/libs/bootstrap/bootstrap.min.js"></script>
        <script src="../js/libs/jquery/jquery.js"></script>
        <script src="../js/libs/jquery/jquery-1.11.1.js"></script>    
    </head>
    <body>
        <h1>Respuesta</h1>
         <h1>Respuesta</h1>
        <h3><%=request.getAttribute("mensajeRespuesta")%></h3>
        <h3><a href="index.jsp">Volver</a></h3>
    </body>
</html>
