/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primeralista;

import javax.swing.JOptionPane;

/**
 *
 * @author DAGonzalezH
 */
public class Lista {
    
    private Nodo inicio;
    private int tamano;
    
    public Lista(){
        
        inicio=null;
        tamano=0;
        
    }

    public Nodo getInicio() {
        return inicio;
    }

    public void setInicio(Nodo inicio) {
        this.inicio = inicio;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }
    
   
    public Boolean esvacia(){
        
        return inicio==null;
    }
    
    
    
  public int agregraralfinal(int valor){
      
      Nodo nuevo=new Nodo();
      nuevo.setValor(valor);
      
      if ( esvacia())
      {
          inicio=nuevo;
      }
      
      else
      {
          Nodo aux=inicio;
      
          while(aux.getSig()!=null){
              aux=aux.getSig();
          }
          aux.setSig(nuevo);
       }
      tamano++;
      return valor;
      
  }  
    
  
  
  public void listar()
  {
      Nodo aux=inicio;
      String mostrar="";
      while(aux!=null){
          
          mostrar=mostrar+aux.getValor()+"->";
          aux=aux.getSig();
          
//          
//          System.out.print("El valor es "+aux.getValor());
//          aux=aux.getSig();
          
      }
      System.out.println(mostrar+"null");
      
  }
  
  public int agregaralinicio(int valor){
      
      Nodo nuevo=new Nodo();
      
      nuevo.setValor(valor);
      if (esvacia()){
          inicio=nuevo;
      }
      else{
          nuevo.setSig(inicio);
          inicio=nuevo;
      }
      tamano++; 
      return valor;
  }
  
  
  public void raiz(int valor){
      
      Nodo nuevo=new Nodo();
      
      
      nuevo.setValor(valor);
     
      
      if(esvacia()){
          inicio=nuevo;
      }
      else{
          Nodo aux=inicio;
          
        
              while(aux.getSig()!=null ){
                  aux=aux.getSig();
              }
          
          
      aux.setSig(nuevo);
       
      tamano++;
          
     
  }
  }   
 public void eliminar(Object valor)
 {
      
     if(esvacia())
   {
       System.out.println("Esta vacia");
   }
   else
   {
       Nodo aux=inicio;
      Nodo auxeli=inicio;
       
     while(!valor.equals(aux.getSig().getValor()))
       {
        aux=aux.getSig();
       auxeli=auxeli.getSig();
        }
        auxeli=aux.getSig();
       aux.setSig(aux.getSig().getSig());
      
       if(aux.getSig()==null)
       {
         auxeli.setSig(null);
        
       }
       else
       {
          
           auxeli.setSig(null);
           
       }
     
//       if(aux.getValor() == valor)
//       {
//         inicio=aux.getSig();
         // aux.setSig(aux); 
//       }
         
 }  
 }
 
 
 public boolean buscar(Object valor)
 {
     
     Nodo aux=inicio;
    boolean encontra=false;
    
     while(aux!=null && encontra!=true)
     {
       if(valor.equals(aux.getValor()))
       {
          encontra=true;
          
       }
       else
       {
          aux=aux.getSig();
          
       }
      
       
     }
     
     return encontra;
 }
 
 
 public void mostrarbuscado(Object valor)
 {
     if(buscar(valor))
     {
         Nodo aux=inicio;
         int cont=0;
     
     while(!valor.equals(aux.getValor()))
     {
         cont++;
         aux=aux.getSig();
        
     }
      System.out.println("valor existe"+aux.getValor());
       }
     
     else
     {
         System.out.println("Valor no existe");
     } 
 }
 
 public void raiz2(int valor)
 {
     Nodo nuevo=new Nodo();
     nuevo.setValor(valor);
     
     Nodo aux=inicio;
     Nodo aux2=inicio;
     
     if(nuevo.getValor()<aux.getValor())
         {
      nuevo.setSig(inicio);
      inicio=nuevo;
         }
     else
     {
         while(aux.getSig()!=null ){
                  aux=aux.getSig();
              }
          
          
      aux.setSig(nuevo);
       
     }
         tamano++;
 }
}
             
//             Nodo aux=inicio;
//             while(aux.getValor()!=valor)
//             {
//                 aux=aux.getSig();
//             }
//             Nodo siguiente=aux.getSig();
//             aux.setSig(nuevo);
//             nuevo.setSig(nuevo);
//             nuevo.setSig(siguiente);
//         
//         tamano++;
//         }
 
 
 

