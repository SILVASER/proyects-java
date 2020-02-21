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
public class rMantenimiento {
    
    public String codigo;
    public String descripcion;
    public String maquina;
    public String importe;
    public String ultimarv;
    public String siguienterv;
    public String ultimarvkm;
    public String vencimientokm;
    public String fecha;
    public String usuario;

    public rMantenimiento(String codigo, String descripcion, String maquina, String importe, String ultimarv, String siguienterv, String ultimarvkm, String vencimientokm, String fecha, String usuario) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.maquina = maquina;
        this.importe = importe;
        this.ultimarv = ultimarv;
        this.siguienterv = siguienterv;
        this.ultimarvkm = ultimarvkm;
        this.vencimientokm = vencimientokm;
        this.fecha = fecha;
        this.usuario = usuario;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMaquina() {
        return maquina;
    }

    public void setMaquina(String maquina) {
        this.maquina = maquina;
    }

    public String getImporte() {
        return importe;
    }

    public void setImporte(String importe) {
        this.importe = importe;
    }

    public String getUltimarv() {
        return ultimarv;
    }

    public void setUltimarv(String ultimarv) {
        this.ultimarv = ultimarv;
    }

    public String getSiguienterv() {
        return siguienterv;
    }

    public void setSiguienterv(String siguienterv) {
        this.siguienterv = siguienterv;
    }

    public String getUltimarvkm() {
        return ultimarvkm;
    }

    public void setUltimarvkm(String ultimarvkm) {
        this.ultimarvkm = ultimarvkm;
    }

    public String getVencimientokm() {
        return vencimientokm;
    }

    public void setVencimientokm(String vencimientokm) {
        this.vencimientokm = vencimientokm;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    
    
}
