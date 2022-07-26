/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeralista;

/**
 *
 * @author DAGonzalezH
 */
public class Nodo {
    
    
    private int valor;
    private Nodo sig;

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
    
    
   public Nodo(){
       this.valor=0;
       this.sig=null;
       
   } 
    
    
    
    
    
}
