package Modelo;

public class Departamento {
    
    private int IdDepartamento;
    private String Departamento;
    private int IdPais;

    public Departamento() {
    }

    public Departamento(int IdDepartamento, String Departamento) {
        this.IdDepartamento = IdDepartamento;
        this.Departamento = Departamento;
    }

    public int getIdDepartamento() {
        return IdDepartamento;
    }

    public void setIdDepartamento(int IdDepartamento) {
        this.IdDepartamento = IdDepartamento;
    }

    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }

    public int getIdPais() {
        return IdPais;
    }

    public void setIdPais(int IdPais) {
        this.IdPais = IdPais;
    }
    
     @Override
    public String toString() {
        return this.Departamento;
    }
}
