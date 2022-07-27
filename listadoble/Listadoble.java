/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadoble;



/**
 *
 * @author Sala
 */
public class Listadoble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
      Lista milista=new Lista();
      
      milista.agregarfinal(2);
      milista.agregarfinal(5);
      milista.agregarfinal(8);
      milista.agregarinicio(1);
      milista.eliminar(2);
      
      milista.listar();
      
                
     
        
        
        
    }
    
}
