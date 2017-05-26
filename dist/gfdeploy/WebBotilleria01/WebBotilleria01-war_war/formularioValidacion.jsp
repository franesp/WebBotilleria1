<%-- 
    Document   : formulario1
    Created on : 14-05-2017, 17:44:48
    Author     : Francisco Espinoza
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ingreso de datos</title>
        <script src="JS/funcionValidar.js" type="text/javascript"></script>
        <link href="estilos.css" rel="stylesheet" type="text/css"/>
    </head>
    <body style="background-color:powderblue;">
        <h1>Ingreso de datos...</h1>
        <hr />
        <h1>Por favor ingrese sus datos:</h1>
        
        <!-- nombre formulario / metodo "post" (conecta a traves de encabezados) / "action" es el destino de los datos ingresados.-->
        <form name="frm_IngresaDatos" method="post" action="ValidacionDatosServlet">
            <label>Nombre: </label> <input type="texto" id="ingresa_nombre" name="ingresa_nombre" placeholder="ingresa nombre"><br>
            <label>Contraseña: </label> <input type="texto" id="ingresa_contrasena" name="ingresa_contrasena" placeholder="ingresa contraseña"><br>
            <input type="button" value="Ingresar" onclick="validarIngresoCliente();"><br>
            
        </form><br>
        
        <div style="text-align:center; font-family: Times New Roman;" id="cnt_valida"></div>
        <hr />
        <div style="text-align:center;" > <img src="imagen04.jpg"/></div>
    </body>
</html>
