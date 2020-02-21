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
public class rDetalleCaja {
    
    public String item;
    public String descripcion;
    public String socio;
    public String documento;
    public String ndoc;
    public String tipomovimiento;
    public String user;
    public String saldo;

    public rDetalleCaja(String item, String descripcion, String socio, String documento, String ndoc, String tipomovimiento, String user, String saldo) {
        this.item = item;
        this.descripcion = descripcion;
        this.socio = socio;
        this.documento = documento;
        this.ndoc = ndoc;
        this.tipomovimiento = tipomovimiento;
        this.user = user;
        this.saldo = saldo;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getSocio() {
        return socio;
    }

    public void setSocio(String socio) {
        this.socio = socio;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNdoc() {
        return ndoc;
    }

    public void setNdoc(String ndoc) {
        this.ndoc = ndoc;
    }

    public String getTipomovimiento() {
        return tipomovimiento;
    }

    public void setTipomovimiento(String tipomovimiento) {
        this.tipomovimiento = tipomovimiento;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }
    
    
    
    
}
