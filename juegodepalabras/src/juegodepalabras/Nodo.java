/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegodepalabras;

/**
 *
 * @author DAGonzalezH
 */
public class Nodo {
    private Persona valor;
    private Nodo sig;
    
    
    public Nodo(){
        this.valor=null;
        this.sig=null;
    }

    public Persona getValor() {
        return valor;
    }

    public void setValor(Persona valor) {
        this.valor = valor;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }
    
    
    
}
