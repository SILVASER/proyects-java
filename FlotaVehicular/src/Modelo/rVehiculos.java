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
public class rVehiculos {
    
    public String codigo;
    public String matricula;
    public String maquina;
    public String modelo;
    public String nserie;
    public String nneumatico;
    public String operativo;
    public String responsable;
    public String fecha;

    public rVehiculos(String codigo, String matricula, String maquina, String modelo, String nserie, String nneumatico, String operativo, String responsable, String fecha) {
        this.codigo = codigo;
        this.matricula = matricula;
        this.maquina = maquina;
        this.modelo = modelo;
        this.nserie = nserie;
        this.nneumatico = nneumatico;
        this.operativo = operativo;
        this.responsable = responsable;
        this.fecha = fecha;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMaquina() {
        return maquina;
    }

    public void setMaquina(String maquina) {
        this.maquina = maquina;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNserie() {
        return nserie;
    }

    public void setNserie(String nserie) {
        this.nserie = nserie;
    }

    public String getNneumatico() {
        return nneumatico;
    }

    public void setNneumatico(String nneumatico) {
        this.nneumatico = nneumatico;
    }

    public String getOperativo() {
        return operativo;
    }

    public void setOperativo(String operativo) {
        this.operativo = operativo;
    }

    public String getResponsable() {
        return responsable;
    }

    public void setResponsable(String responsable) {
        this.responsable = responsable;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    
    
    
}
