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
public class rCaja {
    
    public String codigo;
    public String nombre;
    public String compania;
    public String usuario;
    public String fecha;
    public String saldoinicial;
    public String diferenciacuenta;
    public String saldofinal;

    public rCaja(String codigo, String nombre, String compania, String usuario, String fecha, String saldoinicial, String diferenciacuenta, String saldofinal) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.compania = compania;
        this.usuario = usuario;
        this.fecha = fecha;
        this.saldoinicial = saldoinicial;
        this.diferenciacuenta = diferenciacuenta;
        this.saldofinal = saldofinal;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getSaldoinicial() {
        return saldoinicial;
    }

    public void setSaldoinicial(String saldoinicial) {
        this.saldoinicial = saldoinicial;
    }

    public String getDiferenciacuenta() {
        return diferenciacuenta;
    }

    public void setDiferenciacuenta(String diferenciacuenta) {
        this.diferenciacuenta = diferenciacuenta;
    }

    public String getSaldofinal() {
        return saldofinal;
    }

    public void setSaldofinal(String saldofinal) {
        this.saldofinal = saldofinal;
    }
    
    
    
}
