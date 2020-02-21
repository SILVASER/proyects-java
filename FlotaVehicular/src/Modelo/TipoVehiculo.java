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
public class TipoVehiculo {
    
   private int idtipovehiculo;
   private String tipovehiculo;
  
    public int getIdtipovehiculo() {
        return idtipovehiculo;
    }

    public void setIdtipovehiculo(int idtipovehiculo) {
        this.idtipovehiculo = idtipovehiculo;
    }

  

    public String getTipovehiculo() {
        return tipovehiculo;
    }

    public void setTipovehiculo(String tipovehiculo) {
        this.tipovehiculo = tipovehiculo;
    }

   
    @Override
    public String toString() {
        return this.tipovehiculo;
    }
   
   
    
}
