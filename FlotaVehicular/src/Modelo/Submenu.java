package Modelo;

import java.util.ArrayList;


public class Submenu {
    
    private String id;
    private String nombre;
    private ArrayList<Item> item = new ArrayList<Item>();
            
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

    
    
    public void addItems(Item items)
    {
        this.item.add(items);
    }

    public ArrayList<Item> getItem() {
        return item;
    }       

 
    @Override
    public String toString() {
        return this.nombre;
    }
    
}