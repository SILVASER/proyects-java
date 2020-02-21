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
public class Inspeccion {
    
   private String CODIGO;
   private String ACTIVIDAD;
   private String FECHA;
   private String HORA;
   private String UNIDAD;
   private String MARCA;
   private String TURNO;
   private String CONDUCTOR;
   private String TECNICO;
   private String FECHAACT;
   private String USUARIO;
   private String IP;
   private String OBSERVACION;

    public String getCODIGO() {
        return CODIGO;
    }

    public String getOBSERVACION() {
        return OBSERVACION;
    }

    public void setOBSERVACION(String OBSERVACION) {
        this.OBSERVACION = OBSERVACION;
    }
    

    public void setCODIGO(String CODIGO) {
        this.CODIGO = CODIGO;
    }

    public String getACTIVIDAD() {
        return ACTIVIDAD;
    }

    public void setACTIVIDAD(String ACTIVIDAD) {
        this.ACTIVIDAD = ACTIVIDAD;
    }

    public String getFECHA() {
        return FECHA;
    }

    public void setFECHA(String FECHA) {
        this.FECHA = FECHA;
    }

    public String getHORA() {
        return HORA;
    }

    public void setHORA(String HORA) {
        this.HORA = HORA;
    }

    public String getUNIDAD() {
        return UNIDAD;
    }

    public void setUNIDAD(String UNIDAD) {
        this.UNIDAD = UNIDAD;
    }

    public String getMARCA() {
        return MARCA;
    }

    public void setMARCA(String MARCA) {
        this.MARCA = MARCA;
    }

    public String getTURNO() {
        return TURNO;
    }

    public void setTURNO(String TURNO) {
        this.TURNO = TURNO;
    }

    public String getCONDUCTOR() {
        return CONDUCTOR;
    }

    public void setCONDUCTOR(String CONDUCTOR) {
        this.CONDUCTOR = CONDUCTOR;
    }

    public String getTECNICO() {
        return TECNICO;
    }

    public void setTECNICO(String TECNICO) {
        this.TECNICO = TECNICO;
    }

    public String getFECHAACT() {
        return FECHAACT;
    }

    public void setFECHAACT(String FECHAACT) {
        this.FECHAACT = FECHAACT;
    }

    public String getUSUARIO() {
        return USUARIO;
    }

    public void setUSUARIO(String USUARIO) {
        this.USUARIO = USUARIO;
    }

    public String getIP() {
        return IP;
    }

    public void setIP(String IP) {
        this.IP = IP;
    }
   
   
   
}
