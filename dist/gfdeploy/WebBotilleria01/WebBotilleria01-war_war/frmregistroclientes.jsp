<%-- 
    Document   : frmregistroclientes
    Created on : 15-05-2017, 15:08:50
    Author     : Francisco Espinoza/Eduardo Urzua
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registro cliente</title>
        <script src="JS/funciones.js" type="text/javascript"></script>
           <link rel="stylesheet" type="text/css" href="estilos.css"> 
    </head>
    <body style="background-color:teal;">
        <h1>Registro de clientes...</h1>
        <hr />
        <h1>Por favor ingrese sus datos:</h1>
        <form name="frm_registro" method="post" action="RegistroClientesServlet">
            <label>Nombres:</label> <input type="text" name="ingresa_nombres" placeholder="Ingrese sus nombres"id="txt_nombre"><br>
            <label>Apellidos:</label> <input type="text" name="ingresa_apellidos" placeholder="Ingrese sus apellidos"><br>
            <label>Rut:</label> <input type="text" name="ingresa_rut" placeholder="Ej: 12345678-9"><br>
            <label>Fecha de nacimiento:</label> <input type="text" name="ingresa_fnacimiento" placeholder="Ej: 01/02/1991"><br>
            <label>Contraseña:</label> <input type="text" name="ingresa_contrasena" placeholder="Ingrese contraseña"><br>
            <label>Dirección:</label> <input type="text" name="ingresa_direccion" placeholder="Ingrese dirección"><br>
            <label>Número de contacto: </label> <input type="text" name="ingresa_num_contacto" placeholder="Ingrese N° contacto"><br>
            <label>E-Mail:</label> <input type="text" name="ingresa_email" placeholder="Ingrese un mail">
            <input type="submit" value="Registrarse" >
            
        </form>
       
        <hr />
        <h1>Para eliminar cuenta ingrese datos:</h1>
        <form name="frm_registro" method="post" action="EliminarCliente">
            <label>Rut:</label> <input type="text" name="ingresa_rut" placeholder="Ej: 12345678-9">
            <input type="submit" value="Eliminar" >
            
        </form>
        
           <div style="text-align:center;" ><img src="imagen04.jpg" alt="Foto copetes" title="Foto descriptiva"  /> </div>
    </body>
</html>
