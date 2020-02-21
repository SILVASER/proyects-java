package Modelo;
/**
 *
 * @author Dani
 */
public class UsuariosValidar {

    private String UserName;
    private String IdDependencia;
    private boolean EsAdmin;
    private boolean EsActivo;
    private String IdPersonal;
    private String Paterno;
    private String Materno;
    private String Nombres;
    private String Dependencia;

    public UsuariosValidar() {
    }

    public UsuariosValidar(String UserName, String IdDependencia, boolean EsAdmin,boolean EsActivo, String IdPersonal, String Paterno, String Materno, String Nombres, String Dependencia) {
        this.UserName = UserName;
        this.IdDependencia = IdDependencia;
        this.EsAdmin = EsAdmin;
        this.EsActivo = EsActivo;
        this.IdPersonal = IdPersonal;
        this.Paterno = Paterno;
        this.Materno = Materno;
        this.Nombres = Nombres;
        this.Dependencia = Dependencia;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getIdDependencia() {
        return IdDependencia;
    }

    public void setIdDependencia(String IdDependencia) {
        this.IdDependencia = IdDependencia;
    }

    public boolean isEsAdmin() {
        return EsAdmin;
    }

    public void setEsAdmin(boolean EsAdmin) {
        this.EsAdmin = EsAdmin;
    }

    public boolean isEsActivo() {
        return EsActivo;
    }

    public void setEsActivo(boolean EsActivo) {
        this.EsActivo = EsActivo;
    }

    public String getIdPersonal() {
        return IdPersonal;
    }

    public void setIdPersonal(String IdPersonal) {
        this.IdPersonal = IdPersonal;
    }

    public String getPaterno() {
        return Paterno;
    }

    public void setPaterno(String Paterno) {
        this.Paterno = Paterno;
    }

    public String getMaterno() {
        return Materno;
    }

    public void setMaterno(String Materno) {
        this.Materno = Materno;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getDependencia() {
        return Dependencia;
    }

    public void setDependencia(String Dependencia) {
        this.Dependencia = Dependencia;
    }

    
}
