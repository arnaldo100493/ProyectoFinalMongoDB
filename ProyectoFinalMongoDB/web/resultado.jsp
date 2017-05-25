<%-- 
    Document   : resultado
    Created on : 25/05/2017, 01:28:07 AM
    Author     : ArnaldoAndres
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultado</title>
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
        <h1>Resultado</h1>

        <% if (request.getAttribute("resultado").equals("Correcto")) {%>

        <h3>Operacion Correcta</h3>

        <%} else {%>

        <h3>Operacion Incorrecta</h3>

        <%}%>
        
        <br/>
        
        <a href="index.jsp">Volver</a>
    </body>
</html>
