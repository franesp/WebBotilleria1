/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//import java.util.ArrayList;
//import java.util.List;

function validarIngresoCliente(){
    //francisco la lleva
    var nombre = document.getElementById("ingresa_nombre").value;
    var contrasena = document.getElementById("ingresa_contrasena").value;
    
    
    
   // List<Clientes> listClient = new ArrayList<>();
    //    this.llenarLista(listClient);
    listClient = ["password1","rammstein","autitorojo"];    
    for (i=0; i < listClient.length ; i++) {
            if(listClient[i] === contrasena){
                //return listClient.get(i);
                document.getElementById('cnt_valida').innerHTML="El nombre es: "+nombre+ "y la contraseña es: "+contrasena+".";
                break;
            }else{
            document.getElementById('cnt_valida').innerHTML="Datos incorrectos, intenta nuevamente...";
        }
        
        
       
    }
    
    /*private void llenarLista(List<Clientes> listClient){
    
        listClient.add(new Clientes());
        listClient.get(0).setContraseña("123");
        listClient.get(0).setNombre("Andres");
        
        listClient.add(new Clientes());
        listClient.get(0).setContraseña("456");
        listClient.get(0).setNombre("Fco");
        
        listClient.add(new Clientes());
        listClient.get(0).setContraseña("789");
        listClient.get(0).setNombre("Pedro");
        
        listClient.add(new Clientes());
        listClient.get(0).setContraseña("111");
        listClient.get(0).setNombre("Maria");
        
    }*/
    
    
    

}