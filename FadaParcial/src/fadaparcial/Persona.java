/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fadaparcial;

/**
 *
 * @author DAGonzalezH
 */
public class Persona {
    
    private String id;
    private String nombre;
    private String correoelectronico;

    public Persona(String id, String nombre, String correoelectronico) {
        this.id = id;
        this.nombre = nombre;
        this.correoelectronico = correoelectronico;
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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreoelectronico() {
        return correoelectronico;
    }

    public void setCorreoelectronico(String correoelectronico) {
        this.correoelectronico = correoelectronico;
    }
    
    
    
    
    
    
    
    
    
    
}
