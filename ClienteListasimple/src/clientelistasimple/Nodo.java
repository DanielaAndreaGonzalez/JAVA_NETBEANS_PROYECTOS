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
public class Nodo {
    
    private Cliente cliente;
    private Nodo sig;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }
    
    
     public Nodo(){
         
         this.cliente=null;
         this.sig=null;
         
     }
    
    
}
