package Modelo;

import javax.swing.ImageIcon;


public class Item {
    
    private String id;
    private String nombre;
  
        
    public Item(String id, String nombre){
        this.nombre = nombre;
        
    }    
    
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

 
    @Override
    public String toString() {
        return this.nombre;
    }
    
}
