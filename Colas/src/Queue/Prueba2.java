/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author DAGonzalezH
 */
public class Prueba2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Colas cola=new Colas(4);
       
       cola.insert("Hola");
       cola.insert(3);
       cola.insert("Java");
       cola.insert(5);
       
       cola.remove();
       
       cola.mostrar(); 
        
        
        
        
        
        
    }
    
}
