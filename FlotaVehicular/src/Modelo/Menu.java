package Modelo;

import java.util.ArrayList;

public class Menu {
 
    private String Nombre;
    private ArrayList<Submenu> submenu = new ArrayList<Submenu>();
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void addSubmenus(Submenu submenus){
        submenu.add(submenus);
    }
    
    public ArrayList<Submenu> getSubmenus() {
        return submenu;
    }

   
    
    @Override
    public String toString() {
        return this.Nombre ;
    }    
}