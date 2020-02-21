package Modelo;

/**
 *
 * @author Dani
 */
public class UsuariosDependencias {
    
    private int id;
    private String userName;
    private String idDependencia;

    public UsuariosDependencias(int id, String userName, String idDependencia) {
        this.id = id;
        this.userName = userName;
        this.idDependencia = idDependencia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getIdDependencia() {
        return idDependencia;
    }

    public void setIdDependencia(String idDependencia) {
        this.idDependencia = idDependencia;
    }    
}
