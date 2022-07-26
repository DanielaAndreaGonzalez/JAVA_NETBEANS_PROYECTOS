/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

/**
 *
 * @author DAGonzalezH
 */
public class Lista {
    private int tamano;
    private Nodo nodo;

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public Nodo getNodo() {
        return nodo;
    }

    public void setNodo(Nodo nodo) {
        this.nodo = nodo;
    }
    
    public Lista()
    {
        
        this.tamano=0;
        this.nodo=null;
    }
    
    public Boolean esvacia(){
        
        return nodo==null;
        
        
    }
  
  public void agregaralfinal(int dato){
      
      Nodo nuevo=new Nodo();
      nuevo.setDato(dato);
      
      if(esvacia())
      {
          nodo=nuevo;
      }
      else{
          
          Nodo aux=nodo;
          while(aux.getSig()!=null){
              
              aux=aux.getSig();
          }
          aux.setSig(nuevo);
        
      }
      tamano++;
  }
  public void agregaralinicio(int dato){
      
      Nodo nuevo=new Nodo();
      nuevo.setDato(dato);
      if(esvacia()){
          nodo=nuevo;
      }
      else{
          
          
          nuevo.setSig(nodo);
          nodo=nuevo;
          
      }
    
      tamano++;
  }
  
 public boolean buscar(int dato){
     
      Nodo aux= nodo;
     boolean var=false;
     while(aux.getSig()!=null){
        if(aux.getDato()==dato)
         {
             var=true;
             System.out.println("El valor existe"+dato);
         }
        
         aux=aux.getSig();
     }
     if(var==true)
     {
           System.out.println("El valor existe"+dato);
     }
     else
     {
         System.out.println("El valor no existe"); 
     }
     
   return var;  
     
 }
 
 public void listar(){
     Nodo aux=nodo;
     String salida="";
     while(aux!=null){
         salida=salida+aux.getDato();
       aux=aux.getSig();
     }
     System.out.println(""+salida);
     
 }
 
 public void modificar(int valor,int dato){
     
     Nodo aux=nodo;
     while(aux!=null)
     {
    if(buscar(valor)==true)
     {
         aux.setDato(dato);
         
     }
     
     else
    {
        System.out.println("No existe");
    }
    aux=aux.getSig();
     }
 }
  
    
}
