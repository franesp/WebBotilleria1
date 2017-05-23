/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function registraClientes(){
    var nombresIngresados = document.getElementsByName('ingresa_nombres').value;
    var apellidosIngresados = document.getElementByName('ingresa_apellidos').value;
    var rutIngresado = document.getElementByName('ingresa_rut').value;
    var fechaNacimientoIngresada = document.getElementByName('ingresa_fnacimiento').value;
    var contraseñaIngresada = document.getElementByName('ingresa_contraseña').value;
    var direccionIngresada = document.getElementByName('ingresa_direccion').value;
    var numTelefonoIngresado = document.getElementByName('ingresa_num_contacto').value;
    var emailIngresado = document.getElementByName('ingresa_email').value;
    
    //List<Clientes> listClient = new ArrayList<>();
    //this.llenarLista(listClient);
    
    //innerHTML escribe en cotenedor. 
    document.getElementById('cnt_resultado').innerHTML="prueba de contenedor!";
}


