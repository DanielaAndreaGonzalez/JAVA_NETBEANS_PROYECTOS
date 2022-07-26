/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

/**
 *
 * @author User
 */
public class Algoritmo {
    
    public void QuickSort(int [] vec, int primero, int ultimo){
        
        int i, j, pivote, auxiliar;
        
        i = primero;
        j=ultimo;
        pivote = vec [(primero + ultimo)/2];
        
        System.out.println("El Pivote es: " + "[" + pivote + "]");
        
        do{
        
            while(vec [i] < pivote){
            
                i++;
            
            }
            
            while(vec [j] > pivote){
            
                j--;
            
            }
            
            //Aquí se hace el intercambio
            
            if(i <= j){
            
                auxiliar = vec [i];
                vec [i] = vec [j];
                vec [j] = auxiliar;
                i++;
                j--;
            
            }
            
        }while(i <= j);
    
        if(primero < j){
        
            QuickSort(vec, primero, j);
        
        }
        
        if(i < ultimo){
        
            QuickSort(vec, i, ultimo);
        
        }
        mostrarVector(vec);
        
    }
    
    public void mostrarVector(int [] vec){
    
        int k = 0;
        while(k < vec.length){
        
            System.out.print("[" + vec[k] + "]");
            k++;
        
        }
        
        System.out.println();
    
    }
    
}
