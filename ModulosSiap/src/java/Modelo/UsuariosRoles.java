package Modelo;

import java.util.Date;

/**
 *
 * @author Dani
 */
public class UsuariosRoles {
    
    private int id;
    private String userName;
    private int idRole;
    private Date inicio;
    private Date Final;
    private String observacion;

    public UsuariosRoles(int id, String userName, int idRole, Date inicio, Date Final, String observacion) {
        this.id = id;
        this.userName = userName;
        this.idRole = idRole;
        this.inicio = inicio;
        this.Final = Final;
        this.observacion = observacion;
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

    public int getIdRole() {
        return idRole;
    }

    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }
    
    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFinal() {
        return Final;
    }

    public void setFinal(Date Final) {
        this.Final = Final;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
}
