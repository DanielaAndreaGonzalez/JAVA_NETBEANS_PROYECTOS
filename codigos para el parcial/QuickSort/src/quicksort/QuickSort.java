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
public class QuickSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        Algoritmo miAlgoritmo = new Algoritmo();
        
        int vec[] = {5,2,1,8,3,9,7};
        
        miAlgoritmo.mostrarVector(vec);
        
        System.out.println("Este es el vector ordenado con QuickSort");
        
        miAlgoritmo.QuickSort(vec, 0, vec.length - 1);
        
    }
    
}
