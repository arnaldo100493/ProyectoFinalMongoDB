<%-- 
    Document   : insert
    Created on : 24/05/2017, 09:12:16 PM
    Author     : E301
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insertar Contacto</title>
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
        <h1>Insertar Contacto</h1>
        <form id="formRegistrarPersona" name="formRegistrarPersona" action="./insert" method="post" onsubmit="return validar();">
            <table border="1">
                <thead>
                    <tr>
                        <th colspan="10"><h1>Registrar Persona</h1></th>   
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td colspan="5"><label id="labelCedulaContacto" for="textCedulaContacto">Cédula:</label></td>
                        <td colspan="5"><input type="text" id="textCedulaContacto" name="textCedulaContacto" value="" /></td>
                    </tr>
                    <tr>
                        <td colspan="5"><label id="labelNombreContacto" for="textNombreContacto">Nombre:</label></td>
                        <td colspan="5"><input type="text" id="textNombreContacto" name="textNombreContacto" value="" /></td>
                    </tr>
                    <tr>
                        <td colspan="5"><label id="labelApellidoContacto" for="textApellidoContacto">Apellido:</label></td>
                        <td colspan="5"><input type="text" id="textApellidoContacto" name="textApellidoContacto" value="" /></td>
                    </tr>
                    <tr>
                        <td colspan="5"><label id="labelDireccion" for="textDireccion">Dirección:</label></td>
                        <td colspan="5"><input type="text" id="textDireccion" name="textDireccion" value="" /></td>
                    </tr>
                    <tr>
                        <td colspan="5"><label id="labelTelefono" for="textTelefono">Teléfono:</label></td>
                        <td colspan="5"><input type="text" id="textTelefono" name="textTelefono" value="" /></td>
                    </tr>
                    <tr>
                        <td colspan="5"><label id="labelCorreoElectronico" for="textCorreoElectronico">Correo Electrónico:</label></td>
                        <td colspan="5"><input type="email" id="textCorreoElectronico" name="textCorreoElectronico" value="" /></td>
                    </tr>
                    <tr>
                        <td colspan="5"><label id="labelSexo" for="radioSexo">Sexo:</label></td>
                    </tr><td colspan="5"><input type="radio" id="radioSexo" name="radioSexo" value="" /></td>
                <tr>
                    <td colspan="5"><input type="submit" id="buttonRegistrarContacto" name="buttonRegistrarContacto" value="Registrar Contacto" /></td>  
                </tr>
                </tbody>
            </table>
        </form>
        <h3><a href="index.jsp">Volver</a></h3>
    </body>
</html>
