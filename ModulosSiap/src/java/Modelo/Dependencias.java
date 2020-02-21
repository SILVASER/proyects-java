package Modelo;

/**
 *
 * @author Dani
 */
public class Dependencias {
    
    private String idDependencia;
    private String Descripcion;
    private char codigo;
    private String correo;
    private String rutaArchivos;
    private String siglas;
    private boolean estado;
    private String descripcionCorta;
    private String secfun;

    public Dependencias() {
      
    }

    public Dependencias(String idDependencia, String Descripcion, char codigo, String correo, String rutaArchivos,
            String siglas, boolean estado, String descripcionCorta, String secfun) {
        this.idDependencia = idDependencia;
        this.Descripcion = Descripcion;
        this.codigo = codigo;
        this.correo = correo;
        this.rutaArchivos = rutaArchivos;
        this.siglas = siglas;
        this.estado = estado;
        this.descripcionCorta = descripcionCorta;
        this.secfun = secfun;
    }

    public String getIdDependencia() {
        return idDependencia;
    }

    public void setIdDependencia(String idDependencia) {
        this.idDependencia = idDependencia;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public char getCodigo() {
        return codigo;
    }

    public void setCodigo(char codigo) {
        this.codigo = codigo;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getRutaArchivos() {
        return rutaArchivos;
    }

    public void setRutaArchivos(String rutaArchivos) {
        this.rutaArchivos = rutaArchivos;
    }

    public String getSiglas() {
        return siglas;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getDescripcionCorta() {
        return descripcionCorta;
    }

    public void setDescripcionCorta(String descripcionCorta) {
        this.descripcionCorta = descripcionCorta;
    }

    public String getSecfun() {
        return secfun;
    }

    public void setSecfun(String secfun) {
        this.secfun = secfun;
    }    
}
