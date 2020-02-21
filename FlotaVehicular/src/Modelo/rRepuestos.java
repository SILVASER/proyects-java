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
public class rRepuestos {
    
    public String item;
    public String descripcion;
    public String marca;
    public String iva;
    public String importeiva;
    public String cantidad;
    public String precio;
    public String total;

    public rRepuestos(String item, String descripcion, String marca, String iva, String importeiva, String cantidad, String precio, String total) {
        this.item = item;
        this.descripcion = descripcion;
        this.marca = marca;
        this.iva = iva;
        this.importeiva = importeiva;
        this.cantidad = cantidad;
        this.precio = precio;
        this.total = total;
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getIva() {
        return iva;
    }

    public void setIva(String iva) {
        this.iva = iva;
    }

    public String getImporteiva() {
        return importeiva;
    }

    public void setImporteiva(String importeiva) {
        this.importeiva = importeiva;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }
    
    
}
