function validarIngresoCliente() {


    var nombre = document.getElementById("ingresa_nombre").value;
    var contrasena = document.getElementById("ingresa_contrasena").value;
    var datos_cliente0 = ["francisco", "Los urbanistas", "8767686", "123"];
    var datos_cliente1 = ["andres", "Luis duran 234234", "98987687", "456"];
    var datos_cliente2 = ["pedro", "los pajaritos 876876", "342343", "abc"];
    var datos_cliente3 = ["maria", "los angeles 23423", "234243", "111"];
    var datos_clientes = [datos_cliente0, datos_cliente1, datos_cliente2, datos_cliente3];

//    console.log(datos_clientes);
//    console.log(contrasena);
//    console.log(nombre);

    for (i = 0; i < datos_clientes.length; i++) {
        var aux = datos_clientes[i];
        if (nombre === aux[0] && contrasena === aux[3]) {
            document.getElementById('cnt_valida').innerHTML = "Los datos de cliente son: " + aux;
            break;
        } else {
            document.getElementById('cnt_valida').innerHTML = "Datos incorrectos, intenta nuevamente!!!";
        }
    }

//      for(i=0; i<datos_clientes.length; i++){
//         for(j=0; j<datos_clientes.length; j++){
//           if(nombre === datos_clientes[i][j] && contrasena === datos_clientes[i][j]){
//              
//                //return datos_clientes.get[i][j];
//                document.getElementById('cnt_valida').innerHTML= "Los datos de cliente son: "+datos_clientes[i][j];
//                break;
//            }else{
//            document.getElementById('cnt_valida').innerHTML="Datos incorrectos, intenta nuevamente!!!";
//          }
//      }
}
