/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadoblepersona;

/**
 *
 * @author DAGonzalezH
 */
public class NodoDoble {
    
    
    private Persona persona;
    private NodoDoble sig;
    private NodoDoble ant;

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public NodoDoble getSig() {
        return sig;
    }

    public void setSig(NodoDoble sig) {
        this.sig = sig;
    }

    public NodoDoble getAnt() {
        return ant;
    }

    public void setAnt(NodoDoble ant) {
        this.ant = ant;
    }
    
    
    public NodoDoble(){
        
        this.persona=null;
        this.sig=null;
        this.ant=null;
        
    }
    
}
