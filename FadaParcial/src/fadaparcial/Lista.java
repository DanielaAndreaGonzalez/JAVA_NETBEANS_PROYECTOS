/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fadaparcial;

/**
 *
 * @author DAGonzalezH
 */
public class Lista {
    
      private Nodo inicio;
    private int tamano;
    
    
    public Lista(){
        tamano=0;
        inicio=null;
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
    
     public boolean  esVacia(){
        return inicio == null;
    }

     public void agregaralfinal(int valor){
        Nodo nuevo= new Nodo();
        nuevo.setValor(valor);
        if(esVacia()){
            inicio= nuevo;
        }
        else
        {
            Nodo aux= inicio;
            while(aux.getSig()!=null)
            {
                aux=aux.getSig();
            }
            aux.setSig(nuevo);
        }
        tamano++;
    }
      public void agregarpersona(Persona valor){
        Nodo nuevo= new Nodo();
        nuevo.setPersona(valor);
        if(esVacia()){
            inicio= nuevo;
        }
        else
        {
            Nodo aux= inicio;
            while(aux.getSig()!=null)
            {
                aux=aux.getSig();
            }
            aux.setSig(nuevo);
        }
        tamano++;
    }
     public void eliminar(int valor){
        Nodo aux= inicio;
           
                
              if(aux.getValor()==valor)
              {
               inicio= aux.getSig();
              }
               else
              {
                  while(aux!= null)
                  {
                     if(aux.getSig().getValor()== valor)
                     {
                         aux.setSig(aux.getSig().getSig());
                         break;
                     }
                     aux= aux.getSig();
              }
                  tamano--;
                 
                      
            }
       
    }
      public void listar(){
        Nodo aux= inicio;
        String salida="";
        while(aux!=null)
        {
            salida=salida+"->"+aux.getValor()+"->";
            aux= aux.getSig();
        }
        System.out.println(" "+salida+"null");
    }
      
      public void listarpersona(){
        Nodo aux= inicio;
        String salida="";
        while(aux!=null)
        {
            salida=salida+"->"+aux.getPersona().getId()+"    "+
      aux.getPersona().getNombre()+" "+aux.getPersona().getCorreoelectronico()+"  ";
            aux= aux.getSig();
        }
        System.out.println(" "+salida+"null");
    } 
     
  
     public void eliminarmultiplo(int numero){
         Nodo aux=inicio;
         
         while(aux!=null){
             
             if(aux.getValor()%numero==0){
                     eliminar(aux.getValor());
                 }
             aux=aux.getSig();
         }
    }
       public void buscar (int valor ){
           Nodo aux= inicio;
           while(aux!= null)
           {
               if(aux.getValor()==valor)
               {
                   System.out.println("El valor existe en la lista es: "+ aux.getValor());
                   break;
               }
               aux= aux.getSig();
           }
     }
   

  public void buscarpersona(Object persona){
      
      Nodo aux=inicio;
     
          while(aux!=null){
         
              if(persona==aux.getPersona().getNombre()){
                  System.out.println(""+aux.getPersona().getId()+" "+aux.getPersona().getCorreoelectronico());
              }
              else
              {
                  if(persona==aux.getPersona().getId())
                  {
                   System.out.println(""+aux.getPersona().getNombre()+" "+aux.getPersona().getCorreoelectronico());
                  }
                  if(persona==aux.getPersona().getCorreoelectronico())
                  {
                      System.out.println(""+aux.getPersona().getId()+" "+aux.getPersona().getNombre());
                  }
                 
              }
          aux=aux.getSig();
          }
         
       
      
      
  } 
   
   
    
}
