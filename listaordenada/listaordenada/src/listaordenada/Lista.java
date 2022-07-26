/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaordenada;

import javax.xml.transform.Source;

/**
 *
 * @author Sala
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
        nuevo.setDato(valor);
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
    public void agregaralinicio(int valor){
        Nodo nuevo= new Nodo();
        nuevo.setDato(valor);
        if(esVacia()){
            inicio= nuevo;
        }
        else
        {
            nuevo.setSig(inicio);
            inicio= nuevo;
        }
        tamano++;
    }
    public void listar(){
        Nodo aux= inicio;
        String salida="";
        while(aux!=null)
        {
            salida=salida+"->"+aux.getDato()+"->";
            aux= aux.getSig();
        }
        System.out.println(" "+salida+"null");
    }
    public void eliminar(int valor){
        Nodo aux= inicio;
           
                
              if(aux.getDato()==valor)
              {
               inicio= aux.getSig();
              }
               else
              {
                  while(aux!= null)
                  {
                     if(aux.getSig().getDato()== valor)
                     {
                         aux.setSig(aux.getSig().getSig());
                         break;
                     }
                     aux= aux.getSig();
              }
                  tamano--;
                 
                      
            }
       
    }
     public void buscar (int valor ){
           Nodo aux= inicio;
           while(aux!= null)
           {
               if(aux.getDato()==valor)
               {
                   System.out.println("El valor existe en la lista es: "+ aux.getDato());
                   break;
               }
               aux= aux.getSig();
           }
           
          
       }
      public void listarraiz(){
        Nodo aux= inicio;
        String salida="";
        while(aux!=null)
        {
        salida=salida+aux.getDato()+"->";
            aux= aux.getSig();
        }
            System.out.print(""+salida);
    }
      
      
   public void listaordenada(Lista lista){
       
       Nodo aux1;
      Nodo aux2=inicio;
     
    while(aux2!=null){
      
       aux1=aux2.getSig();
       
       while(aux1!=null){
           
           if(aux1.getDato()<aux2.getDato())
           {
               Object aux3=aux2.getDato();
               aux2.setDato(aux1.getDato());
               aux1.setDato((int) aux3);
               
           }
        aux1=aux1.getSig();
       
       
       }
       aux2=aux2.getSig();
           
   }
        
  }
  
  public int comparar(Object i,Object j){
      
      return i.toString().compareTo(j.toString());
  } 
   
  public interface Comparar{
      public int Comparar(Object i,Object j);
      
  } 
   
  public void ordenarletras(Lista lista,Comparar c){
      Nodo aux1;
      Nodo aux2=inicio;
     
    while(aux2!=null){
      
       aux1=aux2.getSig();
       
       while(aux1!=null){
           
           if(aux1.getDato()<aux2.getDato())
           {
               Object aux3=aux2.getDato();
               aux2.setDato(aux1.getDato());
               aux1.setDato((int) (Object) aux3);
               
           }
        aux1=aux1.getSig();
       
       
       }
       aux2=aux2.getSig();
          
      } 
     
  }       
     
  
  
  public  Object numeromayor(){
      
      Nodo aux=inicio;
      
      while(aux.getSig()!=null){
          
         
          aux=aux.getSig();
      }
    return  aux.getDato();
      
  }
  
  public double calcularpromedio(){
      
      Nodo aux=inicio;
      double acu=0;
      double cont=0;
      
      do{
           acu=acu+aux.getDato();
           aux=aux.getSig();
           cont++;
      }
       while(aux!=null);
      double prom=acu/cont;
      
     // System.out.println("La media es ("+prom+") ");
     return prom;  
  }
  
 public String calcularmediana(){
   Nodo aux= inicio;
   int i=0;
   double sum=0;
   int aux2=0;
       
        
        aux2=tamano/2;
      String salida=""; 
      
     
      while(aux!=null)
      
      {
          if(tamano%2==1){
              if(i==aux2){
                 salida= " "+aux.getDato();  
              }
           
          }
           if(tamano%2==0){
              if(i==aux2){
                sum=i+aux.getSig().getDato();
                double med=sum/2;
                salida=" "+med;
              }
              
          }
            i++;
          aux=aux.getSig();
          
      }
         
 return salida;
 } 
 
 
 public Boolean encontrardato(int dato){
     
     Nodo aux=inicio;
     while(aux!=null){
         if(aux.getDato()==dato){
             return true;
         }
         aux=aux.getSig();
     }
     return false;
 }
 
 public double calcularvarianza(){
     
     Nodo aux=inicio;
     double var=0;
     double var2=0;
     double sum=0;
     double prom=0;
       
     while(aux!=null){
       var2=calcularpromedio()-aux.getDato();
         var=var2*var2;
         sum=sum+var;
         aux=aux.getSig();
     }
     prom=sum/tamano;
    
     return prom;
 }
     
 public void calculardesviacion(){
     
 System.out.println("DESVIACIÓN ESTÁNDAR :  "+Math.sqrt(calcularvarianza())); 
 }
 
 public  void calcularmoda(){
     
     int max=0;
   int moda=0;
     Nodo aux=inicio;
     Nodo aux2;
     int numerorepeticiones=0;
     while(aux!=null){
         aux2=aux.getSig();
         
         while(aux2!=null){
             if(aux.getDato()==aux2.getDato())
             { 
                 numerorepeticiones++;
             }if(numerorepeticiones>max){
                 moda=aux.getDato();
                 max=numerorepeticiones;
             }
            aux2=aux2.getSig();
         }
         aux=aux.getSig();
     }
     System.out.println(""+moda);  
     
 }
  
    
}
