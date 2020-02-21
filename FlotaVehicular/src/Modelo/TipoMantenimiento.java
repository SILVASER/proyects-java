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
public class TipoMantenimiento {
    
    private int idtipom;
    private String descripcion;
    private String observacion;

    public int getIdtipom() {
        return idtipom;
    }

    public void setIdtipom(int idtipom) {
        this.idtipom = idtipom;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    @Override
    public String toString() {
        return this.descripcion;
    }
    
    
    
}
