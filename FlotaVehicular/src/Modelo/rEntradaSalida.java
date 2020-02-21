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
public class rEntradaSalida {
    public String codigo;
    public String fechasalida;
    public String hora;
    public String odometros;
    public String conductor;
    public String maquina;
    public String turno;
    public String origen;
    public String destino;
    public String actividad;
    public String cliente;

    public rEntradaSalida(String codigo, String fechasalida, String hora, String odometros, String conductor, String maquina, String turno, String origen, String destino, String actividad, String cliente) {
        this.codigo = codigo;
        this.fechasalida = fechasalida;
        this.hora = hora;
        this.odometros = odometros;
        this.conductor = conductor;
        this.maquina = maquina;
        this.turno = turno;
        this.origen = origen;
        this.destino = destino;
        this.actividad = actividad;
        this.cliente = cliente;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getFechasalida() {
        return fechasalida;
    }

    public void setFechasalida(String fechasalida) {
        this.fechasalida = fechasalida;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getOdometros() {
        return odometros;
    }

    public void setOdometros(String odometros) {
        this.odometros = odometros;
    }

    public String getConductor() {
        return conductor;
    }

    public void setConductor(String conductor) {
        this.conductor = conductor;
    }

    public String getMaquina() {
        return maquina;
    }

    public void setMaquina(String maquina) {
        this.maquina = maquina;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    
    
    
    
}
