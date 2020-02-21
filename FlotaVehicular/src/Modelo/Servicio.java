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
public class Servicio {
    
private int IDSERVICIOS;
private String IDMANTENIMIENTO;
private String FECHA;
private String SERVICIO;
private String DESCRIPCION;
private Double PRECIO;
private String OBSERVACION;
private String FECHAM;
private String NOMUSUM;
private String IP;

    public int getIDSERVICIOS() {
        return IDSERVICIOS;
    }

    public void setIDSERVICIOS(int IDSERVICIOS) {
        this.IDSERVICIOS = IDSERVICIOS;
    }

    public String getIDMANTENIMIENTO() {
        return IDMANTENIMIENTO;
    }

    public void setIDMANTENIMIENTO(String IDMANTENIMIENTO) {
        this.IDMANTENIMIENTO = IDMANTENIMIENTO;
    }

    public String getFECHA() {
        return FECHA;
    }

    public void setFECHA(String FECHA) {
        this.FECHA = FECHA;
    }

    public String getSERVICIO() {
        return SERVICIO;
    }

    public void setSERVICIO(String SERVICIO) {
        this.SERVICIO = SERVICIO;
    }

    public String getDESCRIPCION() {
        return DESCRIPCION;
    }

    public void setDESCRIPCION(String DESCRIPCION) {
        this.DESCRIPCION = DESCRIPCION;
    }

    public Double getPRECIO() {
        return PRECIO;
    }

    public void setPRECIO(Double PRECIO) {
        this.PRECIO = PRECIO;
    }

    public String getOBSERVACION() {
        return OBSERVACION;
    }

    public void setOBSERVACION(String OBSERVACION) {
        this.OBSERVACION = OBSERVACION;
    }

   
    public String getFECHAM() {
        return FECHAM;
    }

    public void setFECHAM(String FECHAM) {
        this.FECHAM = FECHAM;
    }

    public String getNOMUSUM() {
        return NOMUSUM;
    }

    public void setNOMUSUM(String NOMUSUM) {
        this.NOMUSUM = NOMUSUM;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }




    
}
