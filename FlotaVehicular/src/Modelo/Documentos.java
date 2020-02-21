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
public class Documentos {
    
    private int iddocumentos;
    private String descripcioncorta;
    private String descripcionlarga;

    public int getIddocumentos() {
        return iddocumentos;
    }

    public void setIddocumentos(int iddocumentos) {
        this.iddocumentos = iddocumentos;
    }

    public String getDescripcioncorta() {
        return descripcioncorta;
    }

    public void setDescripcioncorta(String descripcioncorta) {
        this.descripcioncorta = descripcioncorta;
    }

    public String getDescripcionlarga() {
        return descripcionlarga;
    }

    public void setDescripcionlarga(String descripcionlarga) {
        this.descripcionlarga = descripcionlarga;
    }

    @Override
    public String toString() {
        return this.descripcioncorta;
    }
    
    
    
}
