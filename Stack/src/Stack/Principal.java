/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

/**
 *
 * @author DAGonzalezH
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Pila pila=new Pila();
        pila.ingresarNodo();
        pila.ingresarNodo();
        pila.ingresarNodo();
        pila.ingresarNodo();
        pila.ingresarNodo();
        
        System.out.println("\nPila Ingresada:\n ");
        
        pila.desplegar();
        
    }
    
}
