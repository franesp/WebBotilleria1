/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean;

import SessionBean.bean.Producto;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;

/**
 *
 * @author Francisco Espinoza
 */
@Stateless
public class BuscaProductoBean implements BuscaProductoBeanLocal {

    @Override
    public Producto ObtenerDatosProducto(int codigoProducto, String nombreSolicitado) {

        List<Producto> listProduct = new ArrayList<>();
        this.llenarLista(listProduct);
        
        for (int i = 0; i < listProduct.size() ; i++) {
            if(listProduct.get(i).getCodigo() == codigoProducto 
                    || listProduct.get(i).getNombre().equalsIgnoreCase(nombreSolicitado) ){
                return listProduct.get(i);
            }
        }
        
       
        return null;
    }
    
    //TODO: modificar al crear BD
    private void llenarLista(List<Producto> listProduct){
    
        listProduct.add(new Producto());
        listProduct.get(0).setCodigo(1);
        listProduct.get(0).setNombre("Gato");
        listProduct.get(0).setPrecio(1200);
        listProduct.get(0).setTipo("Vino");

        listProduct.add(new Producto());
        listProduct.get(1).setCodigo(2);
        listProduct.get(1).setNombre("Cristal");
        listProduct.get(1).setPrecio(1500);
        listProduct.get(1).setTipo("Cerveza");

        listProduct.add(new Producto());
        listProduct.get(2).setCodigo(3);
        listProduct.get(2).setNombre("Mistral");
        listProduct.get(2).setPrecio(5200);
        listProduct.get(2).setTipo("Pisco");
        
       
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
