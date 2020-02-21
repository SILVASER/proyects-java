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
public class rTrabajadores {
    
    public String ticdoc;
    public String numero;
    public String nombre;
    public String direccion;
    public String oficina;
    public String puesto;
    public String telefono;
    public String fechaingreso;

    public rTrabajadores(String ticdoc, String numero, String nombre, String direccion, String oficina, String puesto, String telefono, String fechaingreso) {
        this.ticdoc = ticdoc;
        this.numero = numero;
        this.nombre = nombre;
        this.direccion = direccion;
        this.oficina = oficina;
        this.puesto = puesto;
        this.telefono = telefono;
        this.fechaingreso = fechaingreso;
    }

    public String getTicdoc() {
        return ticdoc;
    }

    public void setTicdoc(String ticdoc) {
        this.ticdoc = ticdoc;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getOficina() {
        return oficina;
    }

    public void setOficina(String oficina) {
        this.oficina = oficina;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFechaingreso() {
        return fechaingreso;
    }

    public void setFechaingreso(String fechaingreso) {
        this.fechaingreso = fechaingreso;
    }
    
    
}
