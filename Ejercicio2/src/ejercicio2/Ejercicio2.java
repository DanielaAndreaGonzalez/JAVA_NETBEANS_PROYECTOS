/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

/**
 *
 * @author Daniela
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int numero=0;
       int i=0;
       String salida="";
       
       while(numero<100)
       {
           numero=numero+1;
           if(numero%2==0 && numero%3==0)
           {
               salida=salida+"\n"+numero; 
           }
         }
        System.out.println(""+salida);
        
        
        
        
        
        
        
        
    }
    
}
