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
public class Rol {
    
    private String idrol;
	private String descripcion;
	private String unico;
	private int iddependencia;
	
	
	
	
	public Rol(String idrol, String descripcion) {
		super();
		this.idrol = idrol;
		this.descripcion = descripcion;
	}
	
	public String getIdrol() {
		return idrol;
	}
	public void setIdrol(String idrol) {
		this.idrol = idrol;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getUnico() {
		return unico;
	}
	public void setUnico(String unico) {
		this.unico = unico;
	}
	public int getIddependencia() {
		return iddependencia;
	}
	public void setIddependencia(int iddependencia) {
		this.iddependencia = iddependencia;
	}
	
	@Override
	public String toString() {
		return this.descripcion;
	}
	
	
	
	
	
	
}
