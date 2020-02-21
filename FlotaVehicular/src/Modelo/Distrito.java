package Modelo;

public class Distrito {

    private int IdDistrito;
    private String Distrito;
    private int IdProvincia;

    public Distrito() {
    }

    public Distrito(int IdDistrito, String Distrito) {
        this.IdDistrito = IdDistrito;
        this.Distrito = Distrito;
    }

    public int getIdDistrito() {
        return IdDistrito;
    }

    public void setIdDistrito(int IdDistrito) {
        this.IdDistrito = IdDistrito;
    }

    public String getDistrito() {
        return Distrito;
    }

    public void setDistrito(String Distrito) {
        this.Distrito = Distrito;
    }

    public int getIdProvincia() {
        return IdProvincia;
    }

    public void setIdProvincia(int IdProvincia) {
        this.IdProvincia = IdProvincia;
    }
    
    
     @Override
    public String toString() {
        return this.Distrito;
    }
    

   
}
