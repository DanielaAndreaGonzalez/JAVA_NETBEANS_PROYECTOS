/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listadoblepersona;

/**
 *
 * @author DAGonzalezH
 */
public class Lista {
    
    int tamano;
    NodoDoble raiz;

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public NodoDoble getRaiz() {
        return raiz;
    }

    public void setRaiz(NodoDoble raiz) {
        this.raiz = raiz;
    }
    
    public Lista(){
        
        raiz=null;
        tamano=0;
        
    }
    public Boolean esVacia(){
        return raiz==null;
    }
    
   public void agregaralfinal(Persona persona){
       
       NodoDoble nuevo=new NodoDoble();
       nuevo.setPersona(persona);
       
       if(esVacia()){
           raiz=nuevo;
       }
       else
       {
           NodoDoble aux=new NodoDoble();
           aux=raiz;
           
           while(aux.getSig()!=null){
               
               aux=aux.getSig();
           }
           aux.setSig(nuevo);
           nuevo.setAnt(aux);
         }
       tamano++;
    }

 public void listar(){
     NodoDoble aux=raiz;
     String cadena="";
      while(aux!=null){
      cadena=cadena+"  "+aux.getPersona().getId()+" "+aux.getPersona().getNombre()
         +"   "+aux.getPersona().getApellido()+" "+aux.getPersona().getSexo()+
                 "  "+aux.getPersona().getEdad();
      aux=aux.getSig();
     }
     System.out.println(""+cadena+""); 
 }  
   
 public void agregaralinicio(Persona persona)
 {
     NodoDoble nuevo=new NodoDoble();
     nuevo.setPersona(persona);
    
     
     if(esVacia())
     {
       raiz=nuevo;   
     }
     else{
        nuevo.setSig(raiz); 
        raiz=nuevo;
     
 }
        
     tamano++;
 }
   
public void validarmenordeedad(Persona persona){
    
    NodoDoble nuevo=new NodoDoble();
    nuevo.setPersona(persona);
   
  if(esVacia())
  {
     raiz=nuevo;
  }else
  {
     NodoDoble aux=raiz;
   if(persona.getEdad()<18)
     {   
         while(aux.getSig().getPersona().getEdad()>=18)
         {
        aux.setSig(nuevo);
        nuevo.setAnt(aux);
         aux=aux.getSig();
     }
        
     }
     else{
         System.out.println("Ops no hay adultos responsables ");
     }
 
    
  }
    
   tamano++;   
} 
 
    
}
