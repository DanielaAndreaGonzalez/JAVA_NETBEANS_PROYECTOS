/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeralista;

import javax.swing.JOptionPane;

/**
 *
 * @author DAGonzalezH
 */
public class Primeralista {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Lista lista=new Lista();
        
        lista.raiz(12);
        lista.raiz(13);
        lista.raiz(14);
        lista.raiz(10);
        lista.raiz(11);
        lista.eliminar(13);
        lista.raiz2(3);
        lista.raiz2(1);
        lista.raiz2(8);
        lista.mostrarbuscado(13);
        lista.listar();
        
        
        
    }
    
}
