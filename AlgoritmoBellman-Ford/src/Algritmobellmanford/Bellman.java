/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Algritmobellmanford;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.LinkedList;

/**
 *
 * @author DAGonzalezH
 */
public class Bellman {
    
    
    private LinkedList<Aristas> aristas;
    private float etiquetas[];
    private int predecesor[];
    private int numerovertices,totalaristas,nodoOrigen;
    private final int INFINITY=999; 
            
    
   
   private static class Aristas {
    int origen,destino;
    float coste;
    
     public Aristas(int a,int b,float c){
         
         origen=a;
         destino=b;
         coste=c;
         
     } 
   
     public String toString(){
         return "Aristas {"+ "Origen " + origen + " , Destino " + destino + ", Coste "+ coste + '}';
     }
   }
   
   public Bellman() throws IOException {
       
       float item;
       aristas= new LinkedList<Aristas>();
       DataInputStream in= new DataInputStream(System.in);
       System.out.println("Introduce Número de vértices");
       numerovertices= Integer.parseInt(in.readLine());
       System.out.println("Matriz de costes");
       
       for(int i=0; i<numerovertices;i++){
           
           for(int j=0;j<numerovertices;j++){
               if(i!=j){
                   System.out.println("Introduce el coste del nodo  "+ (i+1) +"  al nodo "+(j+1));
                   item= Float.parseFloat(in.readLine());
                   if(item!=0){
                       aristas.add(new Aristas(i, j, item));
                   }
                   
               }
           }
           
       }
       totalaristas=aristas.size();
       etiquetas=new float[numerovertices];
       predecesor=new int[numerovertices];
       System.out.println("Introduce el vértice origen");
       
       nodoOrigen= Integer.parseInt(in.readLine())-1;
           
  } 
   
   private void relajoarista(){
       
       int i,j;
       for( i=0; i<numerovertices; ++i){
           etiquetas[i]=INFINITY;
       }
       etiquetas[nodoOrigen]=0;
       for(i=0; i <numerovertices-1;++i){
           for(j=0;j < totalaristas;++j){
               System.out.println(aristas.get(j));
      if(etiquetas[aristas.get(j).origen]+aristas.get(j).coste<etiquetas[aristas.get(j).destino])
      {
          etiquetas[aristas.get(j).destino]=etiquetas[aristas.get(j).origen]+aristas.get(j).coste;
          predecesor[aristas.get(j).destino]=aristas.get(j).origen;
          
         }         
       }
           for(int p=0;etiquetas.length<p; p++){
               System.out.println("\n" +etiquetas[p]);
           }
       }
     }
   
   private boolean ciclo(){
    int j;
    for(j=0;j < totalaristas; ++j){
    if(etiquetas[aristas.get(j).origen]+aristas.get(j).coste < etiquetas[aristas.get(j).destino]){ 
           return false;
        }
      }
    return true; 
   }
    public static void main(String args[]) throws IOException 
    {
        
        Bellman bellman= new Bellman();
        bellman.relajoarista();
        if(bellman.ciclo()){
            for(int i=0;i<bellman.numerovertices;i++){
            System.out.println("Coste desde "+bellman.nodoOrigen+ " a " +(i+1)+"->"+bellman.etiquetas[i]);
            }
            for(int i=0;i<bellman.numerovertices;i++){
                System.out.println("El predecesor de "+(i+1) + " es " +(bellman.predecesor[i]+1));
            }
          }else{
            System.out.println("Hay un ciclo negativo");
        }
     }
}

        
    
   

