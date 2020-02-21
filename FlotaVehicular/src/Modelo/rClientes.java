/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Dani
 */
public class rClientes {
    
   
    public String ndoc;
    public String nombre;
    public String telefono;
    public String contacto;
    public String direccion;
    public String email;
    public String activo;

    public rClientes(String ndoc, String nombre, String telefono, String contacto, String direccion, String email, String activo) {
        this.ndoc = ndoc;
        this.nombre = nombre;
        this.telefono = telefono;
        this.contacto = contacto;
        this.direccion = direccion;
        this.email = email;
        this.activo = activo;
    }
    
    

    public String getNdoc() {
        return ndoc;
    }

    public void setNdoc(String ndoc) {
        this.ndoc = ndoc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getActivo() {
        return activo;
    }

    public void setActivo(String activo) {
        this.activo = activo;
    }
    
    
}
