/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;
import java.util.Scanner;

/**
 *
 * @author DAGonzalezH
 */
public class Cola {
    
    Nodo primero;
    Nodo ultimo;
    Scanner teclado= new Scanner(System.in);
    
    public Cola(){
        this.primero=null;
        this.ultimo=null;
    }
    
    public void insertarnodo(Object dato){
        Nodo nuevo=new Nodo();
        System.out.println("Ingrese el dato");
        nuevo.dato= teclado.nextInt();
     
         if(primero==null){
             primero=nuevo;
             primero.siguiente=null;
             ultimo=nuevo;
            }
         else{
             ultimo.siguiente=nuevo;
             nuevo.siguiente =null;
             ultimo=nuevo;
         }
        System.out.println("\nNodo ha sido ingresado correctamente");
    }

    public void desplegarcola(){
        
        
      Nodo actual= new Nodo();
      actual=primero; 
      if(primero!=null)
      {
          while(actual!=null){
              System.out.println("  "+ actual.dato);
              actual=actual.siguiente;
          }
          
      }else{
          System.out.println("\n La Cola se encuentra vacía");
      }
        
        
        
        
    }
    
 public void buscarNodo(){
     
    Nodo actual= new Nodo();
      actual=primero; 
     boolean encontrado=false; 
      System.out.println("Ingrese el dato del nodo a buscar");
      Object nodobuscado= teclado.nextInt();
      if(primero!=null)
      {
          while(actual!=null && encontrado != true){
              if(actual.dato == nodobuscado){
                  System.out.println("\n Nodo con el dato("+actual.dato + ")encontrado");
                  encontrado=true;
              }
              
             
              actual=actual.siguiente;
          }
          if(!encontrado){
              System.out.println("\n Nodo no encontrado");
          }
          
      }else{
          System.out.println("\n La Cola se encuentra vacía");
      }  
 } 
 
 
 public void modificarnodo(){
       
    Nodo actual= new Nodo();
      actual=primero; 
     boolean encontrado=false; 
      System.out.println("Ingrese el dato del nodo a modificar");
      Object nodobuscado= teclado.nextInt();
      if(primero!=null)
      {
          while(actual!=null && encontrado != true){
              if(actual.dato == nodobuscado){
                  System.out.println("\n Nodo con el dato("+actual.dato + ")encontrado");
                  System.out.println("Ingrese el nuevo valor");
                  actual.dato=teclado.nextInt();
                  System.out.println("Se ha modificado el Nodo");
                  encontrado=true;
              }
              
            
              actual=actual.siguiente;
          }
          if(!encontrado){
              System.out.println("\n Nodo no encontrado");
          }
          
      }else{
          System.out.println("\n La Cola se encuentra vacía");
      }  
      
}
 
 public void eliminarnodo(){
    Nodo actual= new Nodo();
      actual=primero;
      Nodo anterior= new Nodo();
      anterior=null;
      boolean encontrado=false; 
      System.out.println("Ingrese el dato del nodo a Eliminar");
      Object nodobuscado= teclado.nextInt();
      if(primero!=null)
      {
          while(actual!=null && encontrado != true){
              if(actual.dato == nodobuscado){
                  
                  if(actual==primero){
                      primero=primero.siguiente;
                  }else if(actual==ultimo){
                      anterior.siguiente=null;
                      ultimo=anterior;
                  }else{
                      anterior.siguiente=actual.siguiente;
                  }
                  System.out.println("\nSe eliminó el Nodo con éxito\n");
                  encontrado=true;
              }
              
              anterior = actual;
              actual=actual.siguiente;
          }
          if(!encontrado){
              System.out.println("\n Nodo no encontrado");
          }
          
      }else{
          System.out.println("\n La Cola se encuentra vacía");
      }     
     
     
 }
 
    
    
    
}
