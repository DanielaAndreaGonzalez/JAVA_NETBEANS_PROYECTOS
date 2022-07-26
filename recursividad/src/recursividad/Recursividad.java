/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;

import javax.swing.JOptionPane;
import sun.java2d.opengl.OGLSurfaceData;

/**
 *
 * @author DAGonzalezH
 */
public class Recursividad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
       
        System.out.println(""+factorialrecursivo(5));
        
        
        
    }
    
    private static int  Fibo(int n){
        if (n<2)return n;
        else
            return Fibo(n-1)+Fibo(n+1);
    }
   
    private static int factorialciclo(int n){
        int acu=1;
        for(int i=n;i>=1;i--)
        {
            acu=acu*i;
        }
        return acu;
        
    }
    
    private static int factorialrecursivo(int n)
    {
       if (n==0) return 1;
       else{
           return n*factorialrecursivo(n-1);
       }
        
    }
    
   
    
}

