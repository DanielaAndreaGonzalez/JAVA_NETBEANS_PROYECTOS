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
public class FadaParcial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        
     Lista lista=new Lista();
     
     Persona persona=new Persona("1", "daniela", "daniela@.com");
     Persona persona2=new Persona("2", "carlos", "carlos@.com");
     lista.agregarpersona(persona);
     lista.agregarpersona(persona2);
     System.out.println("Datos Personales ");
     lista.buscarpersona("carlos"); 
    
    lista.buscarpersona("1"); 
    
    
        
        
        
    }
    
}
