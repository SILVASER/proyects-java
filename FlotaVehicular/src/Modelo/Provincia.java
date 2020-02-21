package Modelo;

public class Provincia {
    
    private int IdProvincia;
    private String Provincia;
    private int IdDepartamento;

    public Provincia() {
    }

    public Provincia(int IdProvincia, String Provincia) {
        this.IdProvincia = IdProvincia;
        this.Provincia = Provincia;
    }

    public int getIdProvincia() {
        return IdProvincia;
    }

    public void setIdProvincia(int IdProvincia) {
        this.IdProvincia = IdProvincia;
    }

    public String getProvincia() {
        return Provincia;
    }

    public void setProvincia(String Provincia) {
        this.Provincia = Provincia;
    }

    public int getIdDepartamento() {
        return IdDepartamento;
    }

    public void setIdDepartamento(int IdDepartamento) {
        this.IdDepartamento = IdDepartamento;
    }
    
     @Override
    public String toString() {
        return this.Provincia;
    }

}
