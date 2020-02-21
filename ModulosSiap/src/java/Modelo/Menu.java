package Modelo;

/**
 *
 * @author Dani
 */
public class Menu {
    
 private String codigo;
 private String opcion;
 private String padre;
 private String formulario;
 private boolean activo;

    public Menu(String codigo, String opcion, String padre, String formulario, boolean activo) {
        this.codigo = codigo;
        this.opcion = opcion;
        this.padre = padre;
        this.formulario = formulario;
        this.activo = activo;
    }

    public Menu() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getOpcion() {
        return opcion;
    }

    public void setOpcion(String opcion) {
        this.opcion = opcion;
    }

    public String getPadre() {
        return padre;
    }

    public void setPadre(String padre) {
        this.padre = padre;
    }

    public String getFormulario() {
        return formulario;
    }

    public void setFormulario(String formulario) {
        this.formulario = formulario;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }   
}
