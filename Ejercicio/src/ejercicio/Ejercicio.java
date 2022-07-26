/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

import javax.swing.JOptionPane;

/**
 *
 * @author DAGonzalezH
 */
public class Ejercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
      
        numero(3);
        
    }
   
    private  static int  numero(int n){
        int y=n;
         for(int i=0; i<=n;i++){
            
            y=y+10;
           
            System.out.println("suma "+y);
         }
        System.out.println("serie "+y);
        
      return n;
        
    }
    
}
