/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionBean.bean;

/**
 *
 * @author Francisco
 */
public class Clientes {
    
    private String nombres;
    private String apellidos;
    private String rut;
    private String fechaNacimiento;
    private String contraseña;
    private String direccion;
    private String numTelefono;
    private String email;

    public Clientes() {
    }

    public Clientes(String nombres, String apellidos, String rut, String fechaNacimiento, String contraseña, String direccion, String numTelefono, String email) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.rut = rut;
        this.fechaNacimiento = fechaNacimiento;
        this.contraseña = contraseña;
        this.direccion = direccion;
        this.numTelefono = numTelefono;
        this.email = email;
    }
    
    

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(String numTelefono) {
        this.numTelefono = numTelefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

  
    
    
    
}
