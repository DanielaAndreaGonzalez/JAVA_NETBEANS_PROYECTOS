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
public class Nodo {
    
    private int valor;
    private Nodo sig;
    private Persona Persona;
    
    
    public Nodo(){
        this.valor=0;
        this.sig=null;
        this.Persona=null;
        
    }

    public Persona getPersona() {
        return Persona;
    }

    public void setPersona(Persona Persona) {
        this.Persona = Persona;
    }

   
    
    

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }
    
    
    
    
    
    
}
