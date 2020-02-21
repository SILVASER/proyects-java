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
public class rAlquiler {
    
  
  public String cliente;
  public String tipovh;
  public String matricula;
  public String fechaalq;
  public String hora;
  public String unidades;
  public String precio;
  public String total;

    public rAlquiler(String cliente, String tipovh, String matricula, String fechaalq, String hora, String unidades, String precio, String total) {
        this.cliente = cliente;
        this.tipovh = tipovh;
        this.matricula = matricula;
        this.fechaalq = fechaalq;
        this.hora = hora;
        this.unidades = unidades;
        this.precio = precio;
        this.total = total;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getTipovh() {
        return tipovh;
    }

    public void setTipovh(String tipovh) {
        this.tipovh = tipovh;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getFechaalq() {
        return fechaalq;
    }

    public void setFechaalq(String fechaalq) {
        this.fechaalq = fechaalq;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getUnidades() {
        return unidades;
    }

    public void setUnidades(String unidades) {
        this.unidades = unidades;
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
