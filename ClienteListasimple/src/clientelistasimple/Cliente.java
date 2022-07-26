/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientelistasimple;

/**
 *
 * @author DAGonzalezH
 */
public class Cliente {
   private int id;
   private String nombre, apellido,telefono;
   
   private boolean esClienteFrecuente;

    public Cliente(int id, String nombre, String apellido, String telefono, boolean esClienteFrecuente) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.esClienteFrecuente = esClienteFrecuente;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
   
   
   
   
   

   

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public boolean isEsClienteFrecuente() {
        return esClienteFrecuente;
    }

    public void setEsClienteFrecuente(boolean esClienteFrecuente) {
        this.esClienteFrecuente = esClienteFrecuente;
    }
   
   
   
    
    
}
