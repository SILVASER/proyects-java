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
public class rDetalleVehiculo {
    
    public String color;
    public String clase;
    public String capm3;
    public String tipocombustible;
    public String eje;
    public String cargautil;
    public String pesoneto;
    public String largo;
    public String ancho;
    public String alto;
    public String tarjetapropiedad;

    public rDetalleVehiculo(String color, String clase, String capm3, String tipocombustible, String eje, String cargautil, String pesoneto, String largo, String ancho, String alto, String tarjetapropiedad) {
        this.color = color;
        this.clase = clase;
        this.capm3 = capm3;
        this.tipocombustible = tipocombustible;
        this.eje = eje;
        this.cargautil = cargautil;
        this.pesoneto = pesoneto;
        this.largo = largo;
        this.ancho = ancho;
        this.alto = alto;
        this.tarjetapropiedad = tarjetapropiedad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public String getCapm3() {
        return capm3;
    }

    public void setCapm3(String capm3) {
        this.capm3 = capm3;
    }

    public String getTipocombustible() {
        return tipocombustible;
    }

    public void setTipocombustible(String tipocombustible) {
        this.tipocombustible = tipocombustible;
    }

    public String getEje() {
        return eje;
    }

    public void setEje(String eje) {
        this.eje = eje;
    }

    public String getCargautil() {
        return cargautil;
    }

    public void setCargautil(String cargautil) {
        this.cargautil = cargautil;
    }

    public String getPesoneto() {
        return pesoneto;
    }

    public void setPesoneto(String pesoneto) {
        this.pesoneto = pesoneto;
    }

    public String getLargo() {
        return largo;
    }

    public void setLargo(String largo) {
        this.largo = largo;
    }

    public String getAncho() {
        return ancho;
    }

    public void setAncho(String ancho) {
        this.ancho = ancho;
    }

    public String getAlto() {
        return alto;
    }

    public void setAlto(String alto) {
        this.alto = alto;
    }

    public String getTarjetapropiedad() {
        return tarjetapropiedad;
    }

    public void setTarjetapropiedad(String tarjetapropiedad) {
        this.tarjetapropiedad = tarjetapropiedad;
    }
    
    
    
}
