package Modelo;

/**
 *
 * @author Dani
 */
public class Roles {

    private int idRole;
    private String descripcion;
    private boolean unico;
    private String idDependencia;

    public Roles() {
    }

    public Roles(String descripcion) {
        this.descripcion = descripcion;
    }

   

    public int getIdRole() {
        return idRole;
    }

    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isUnico() {
        return unico;
    }

    public void setUnico(boolean unico) {
        this.unico = unico;
    }

    public String getIdDependencia() {
        return idDependencia;
    }

    public void setIdDependencia(String idDependencia) {
        this.idDependencia = idDependencia;
    }
}
