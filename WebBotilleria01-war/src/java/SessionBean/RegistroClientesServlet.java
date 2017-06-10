/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean;

import Presistencia.ClienteFacadeLocal;
import Procesos.Cliente;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Francisco Espinoza/Eduardo Urzua
 */
public class RegistroClientesServlet extends HttpServlet {

    @EJB
    private ClienteFacadeLocal clienteFacade;
    
    

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        
        try (PrintWriter out = response.getWriter()) {
            //INGRESAR ALGORITMO PARA REGISTRO DE CLIENTES...
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RegistroClientesServlet</title>");            
            out.println("</head>");
            out.println("<body>");
             //Capturamos valores desde el formulario
            String nombre = request.getParameter("ingresa_nombres");
            String apellido = request.getParameter("ingresa_apellidos");
            String rut = request.getParameter("ingresa_rut");
            Date fechaNaci = new Date(request.getParameter("ingresa_fnacimiento"));
            String contrasena = request.getParameter("ingresa_contrasena");
            String direccion = request.getParameter("ingresa_direccion");
            String numContacto = request.getParameter("ingresa_num_contacto");
            String email = request.getParameter("ingresa_email");
            //Creamos un obejto de la clase Cliente
            Cliente nueva = new Cliente();
            nueva.setNombre(nombre);
            nueva.setApellido(apellido);
            nueva.setFechaNaci(fechaNaci);
            nueva.setDireccion(direccion);
            nueva.setRut(rut);
            nueva.setContrasena(contrasena);
            nueva.setNumeroTel(numContacto);
            nueva.setEmail(email);
            
            //Invocamos el metodo create de la interfafaz de Cliente ("AbstractFacade.java")
            clienteFacade.create(nueva);
           
            
            out.println("<h1>Servlet RegistroClientesServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
           
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
