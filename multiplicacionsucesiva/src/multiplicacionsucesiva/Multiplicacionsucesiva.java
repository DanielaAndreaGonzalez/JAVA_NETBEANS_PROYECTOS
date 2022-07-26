/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplicacionsucesiva;

import javax.swing.JOptionPane;

/**
 *
 * @author DAGonzalezH
 */
public class Multiplicacionsucesiva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        int a=Integer.parseInt(JOptionPane.showInputDialog("ingrese el 1 num "));
        
        int b=Integer.parseInt(JOptionPane.showInputDialog("ingrese el 2 num"));
        
        int res=1;
        
        for(int i=0;i<b;i++){
            res=res*a;
        }
                System.out.println("res:"+res);
        
        
        
        
    }
    
}
