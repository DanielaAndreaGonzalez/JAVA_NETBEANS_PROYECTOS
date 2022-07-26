/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import javax.swing.JOptionPane;

/**
 *
 * @author Daniela
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ventas;
        int numero=0;
          int ventas2; 
        ventas=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de ventas"));
        int suma=0;
        
        while(numero<ventas)
        {
           ventas2=Integer.parseInt(JOptionPane.showInputDialog("INgrese estas ventas  "+ventas));
           numero++;
           suma=suma+ventas2;
        }
   
        System.out.println("El total de las ventas es "+suma);
        
        
        
        
        
        
        
        
    }
    
}
