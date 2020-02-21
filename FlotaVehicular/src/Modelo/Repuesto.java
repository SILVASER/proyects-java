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
public class Repuesto {
    
    private int idr;
    private String idmantenimiento;
    private String descripcion;
    private String marca;
    private double iva;
    private double importeiva;
    private int cantidad;
    private double precio;
        private double subtotal;

    private double total;
    private String fecham;
    private String numusum;
    private String ip;

    public Integer getIdr() {
        return idr;
    }

    public void setIdr(int idr) {
        this.idr = idr;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
    
    

    public String getIdmantenimiento() {
        return idmantenimiento;
    }

    public void setIdmantenimiento(String idmantenimiento) {
        this.idmantenimiento = idmantenimiento;
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

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getImporteiva() {
        return importeiva;
    }

    public void setImporteiva(double importeiva) {
        this.importeiva = importeiva;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String getFecham() {
        return fecham;
    }

    public void setFecham(String fecham) {
        this.fecham = fecham;
    }

    public String getNumusum() {
        return numusum;
    }

    public void setNumusum(String numusum) {
        this.numusum = numusum;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
   
    
}
