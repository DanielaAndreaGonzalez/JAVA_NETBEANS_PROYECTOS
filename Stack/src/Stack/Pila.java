/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack;

import java.util.Scanner;

/**
 *
 * @author DAGonzalezH
 */
public class Pila {
    
    Nodo primero;
    
    Scanner teclado= new Scanner(System.in);
     
    public Pila(){
        primero=null;
    }
    // pila --> 23 5 9 1
    
    //primero=null 
    
    public void ingresarNodo(){
        Nodo nuevo=new Nodo();
        System.out.println("Ingrese el dato que contendrá el nuevo Nodo");
        nuevo.dato=teclado.nextInt();
       
        nuevo.siguiente=primero;
        primero=nuevo;
        System.out.println("\n nodo ingresado con exito");
      
     }
    
    public void desplegar(){
        Nodo aux= new Nodo();
        aux=primero;
        String salida="";
        if(primero!= null){
           while(aux!=null){
               salida=salida+"  "+aux.dato+"-->null";
             aux=aux.siguiente;          
               
           } 
            System.out.println(""+salida);
            
        }else{
            System.out.println("\n La pila se encuentra vacía\n");
        }
        
    }
    
}
