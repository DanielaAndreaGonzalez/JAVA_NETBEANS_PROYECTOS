/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

/**
 *
 * @author DAGonzalezH
 */
public class Colas {
    
    private Object[] cola;
    private int frente;
    private int fin;
    
    public Colas(int tamanio){
        
        this.cola=new Object[tamanio];
        this.frente=-1;
        this.fin=-1;
     }
    public Boolean esvacia(){
         return frente==fin;
   }
    public Boolean esllena(){
        return fin==cola.length-1;
    }
    
    
    public void insert(Object elemento){
        
       if(esllena()){
           System.out.println("La Cola esta llena,elimine datos");
       } 
       else{
           cola[++fin] = elemento ;
       }
       
        
        
    }
    public Object remove(){
        
        if (esvacia()){
        System.out.println("La cola esta vacía,inserte datos");
        return "Cola-vacía";
        }
        else{
            return cola[++frente];
        }
        
        
    }
    public void mostrar(){
        
       if(esvacia()){
           System.out.println("Está vacía,Inserte datos");
       } 
        
       else{
         for(int j=frente; j<=fin; j++){
             System.out.println(" "+cola[j]);
         }  
       }
        
        
    }
    
    
    
    
    
    
}
