/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 *
 * @author DAGonzalezH
 */
public class Nodo {
    
    private int dato;
    private Nodo sig;

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }
    
    public Nodo(){
        
       this.dato=0;
       this.sig=null;
    }
   
}
