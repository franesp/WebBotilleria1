<%-- 
    Document   : buscaproducto
    Created on : 17-05-2017, 1:36:36
    Author     : Francisco Espinoza
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
   
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Busqueda Productos...</title>
         <link rel="stylesheet" type="text/css" href="estilos.css"> 
         <script src="jquery-3.2.1.min.js" type="text/javascript"></script>
    </head>
  
    <body style="background-color:powderblue;">
        <h1 style="font-family: Times New Roman;"> Búsqueda de productos....</h1>
        <hr />
        <h1 style="font-family: Arial;"> Ingresa nombre de producto para iniciar la búsqueda:</h1>
        <form name="frm_buscar" method="get" action="ObtenerDatosProductoServlet">
            <label style=" text-align: center;">Nombre Producto:</label>
            <input type="text" name="ingresa_producto" placeholder="Ingresa producto">
            <label style=" text-align: center;">Código:</label>
            <input type="Integer" name="ingresa_codigo" placeholder="Ingrese codigo">
            <input type="submit" value="Buscar" id="buscar" disabled="disabled">
            <!--<div id="cnt_resultado"></div>-->
        </form>
        <hr />
        <div style="text-align:center;" > <img src="imagen04.jpg"/> </div>
        <script src="JS/funcionBoton.js" type="text/javascript"></script>
    </body>
</html>
