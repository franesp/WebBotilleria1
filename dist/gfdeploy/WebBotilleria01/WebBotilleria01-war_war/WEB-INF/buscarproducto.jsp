<%-- 
    Document   : buscarproducto
    Created on : 17-05-2017, 1:01:16
    Author     : neok-
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="../JS/funciones.js" type="text/javascript"></script>
        <title>Busqueda Productos</title>
    </head>
    <body>
        <h1>Búsqueda de productos</h1>
        <hr />
        <h1>Ingresa nombre de producto para iniciar la búsqueda:</h1>
        <form name="frm_buscar" method="post" action="BuscaProductoServlet">
            <label>Nombre Producto:</label><input type="text" name="ingresa_pproducto" placeholder="Ingresa producto"><br>
            <label>Cantidad:</label><input type="Integer" name="ingresa_cantidad" placeholder="Ingrese cantidad">
            <input type="button" value="Buscar" onclick="calcularIva()">
            <div id="cnt_resultado"></div>
        </form>
    </body>
</html>
