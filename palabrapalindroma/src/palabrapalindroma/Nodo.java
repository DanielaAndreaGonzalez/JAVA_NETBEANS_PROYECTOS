/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palabrapalindroma;

/**
 *
 * @author DAGonzalezH
 */
public class Nodo {

    public Nodo(Persona valor, Nodo sig) {
        this.valor = valor;
        this.sig = sig;
    }
    
    Persona valor;
    Nodo sig;

    Nodo() {
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
