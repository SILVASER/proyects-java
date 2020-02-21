package Modelo;

/**
 *
 * @author Dani
 */
public class UsuariosMenu {
    
    private String userName;
    private String menu;

    public UsuariosMenu(String userName, String menu) {
        this.userName = userName;
        this.menu = menu;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }    
}