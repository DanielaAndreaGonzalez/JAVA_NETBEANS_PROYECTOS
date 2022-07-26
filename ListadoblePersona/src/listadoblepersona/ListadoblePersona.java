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
public class ListadoblePersona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
        Lista milista=new Lista();
        
        Persona persona=new Persona(1, "Felipe","Arias", 'M', 20);
        
          Persona persona2=new Persona(2, "Mauro","Restrepo", 'M', 14);
       
           Persona persona3=new Persona(3, "Mario","Arias", 'M', 20);
          
       // milista.agregaralinicio(persona2);
       milista.validarmenordeedad(persona2);
      
       milista.validarmenordeedad(persona3);
      milista.validarmenordeedad(persona2);
       // milista.agregaralfinal(persona3); 
        milista.listar();
        
        
        
        
        
        
    }
    
}
