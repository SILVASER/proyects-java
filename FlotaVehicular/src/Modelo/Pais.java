package Modelo;

public class Pais {
    
    private int IdPais;
    private String  Pais;

    public Pais() {
    }

    public Pais(int IdPais, String Pais) {
        this.IdPais = IdPais;
        this.Pais = Pais;
    }

    public int getIdPais() {
        return IdPais;
    }

    public void setIdPais(int IdPais) {
        this.IdPais = IdPais;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    @Override
    public String toString() {
        return this.Pais;
    }
    
    
}