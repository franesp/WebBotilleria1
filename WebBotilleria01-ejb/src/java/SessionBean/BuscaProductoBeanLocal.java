/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean;

import SessionBean.bean.Producto;
import javax.ejb.Local;

/**
 *
 * @author Francisco Espinoza
 */
@Local
public interface BuscaProductoBeanLocal {

    Producto ObtenerDatosProducto(int codigoProducto, String datosSolicitados);
    
}
