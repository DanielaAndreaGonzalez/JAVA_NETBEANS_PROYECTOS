/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegodepalabras;

import java.util.Calendar;

/**
 *
 * @author DAGonzalezH
 */
public class Listas {
    
    private Nodo inicio;
    private int tamano;
    
    public Listas(){
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
    
    
    public void agregaralfinal(Persona persona){
        Nodo nuevo=new Nodo();
        nuevo.setValor(persona);
        
        if(esvacia()){
            inicio=nuevo;
        }else{
            Nodo aux=inicio;
            while(aux.getSig()!=null){
                aux=aux.getSig();
            }
            aux.setSig(nuevo);
            
            
        }
        tamano++;
   }
    public void listar(){
        Nodo aux=inicio;
        String salida="";
        while(aux!=null){
            salida=salida+aux.getValor().getId()+"-"+aux.getValor().getNombre()+"-"+aux.getValor().getApellido()
                    +"-"+aux.getValor().getSueldo()+"-"+aux.getValor().getEdad()+" ";
            aux=aux.getSig();
        }
        
        System.out.println(salida+"->null");    
        
    }
    
  public  int calcularedad(Calendar fechanac){
      
      Calendar fecha_act=Calendar.getInstance();
         
           int year=fecha_act.get(Calendar.YEAR) - fechanac.get(Calendar.YEAR);
           int months=fecha_act.get(Calendar.MONTH) -fechanac.get(Calendar.MONTH);
           int days=fecha_act.get(Calendar.DAY_OF_MONTH) -fechanac.get(Calendar.DAY_OF_MONTH);
           
           if(months < 0 || (months==0 && days <0) )
           {
               year--;
           }
           return year;
        
        
    }
  public Listas calcularsueldo(){
      Nodo aux=inicio;
      Listas lista=new Listas();
      double sueldo=0;
      double sueldo2=0;
      Persona persona=null;
      
      
            
      
       
       while(aux!=null){
           if(aux.getValor().getEdad()>18 && aux.getValor().getEdad()<28 )
           {
               sueldo=aux.getValor().getSueldo()*20/100;
               sueldo2=sueldo+aux.getValor().getSueldo();
               persona=new Persona(aux.getValor().getId(), aux.getValor().getNombre(),aux.getValor().getApellido(),
                       sueldo2, aux.getValor().getEdad());
                    
               lista.agregaralfinal(persona);
           }
           aux=aux.getSig();
       }
       System.out.println(""+calcularpromedioedad());
    return lista;
       }
  public String calcularmedianaedad(){
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
                 salida= " "+aux.getValor().getEdad();
              }
           
          }
           if(tamano%2==0){
              if(i==aux2){
                sum=i+aux.getSig().getValor().getEdad();
                double med=sum/2;
                salida=" "+med;
              }
              
          }
            i++;
          aux=aux.getSig();
    }        
 return salida;
 } 
 public double calcularpromedioedad(){
      
      Nodo aux=inicio;
      double acu=0;
      double cont=0;
      
      do{
           acu=acu+aux.getValor().getEdad();
           aux=aux.getSig();
           cont++;
      }
       while(aux!=null);
      double prom=acu/cont;
      
     // System.out.println("La media de la edad es ("+prom+") ");
     return prom;  
  }
   
 public double calcularpromediosalario(){
      
      Nodo aux=inicio;
      double acu=0;
      double cont=0;
      
      do{
           acu=acu+aux.getValor().getSueldo();
           aux=aux.getSig();
           cont++;
      }
       while(aux!=null);
      double prom=acu/cont;
      
      System.out.println("La media del salario es ("+prom+") ");
     return prom;  
  }
  
 
 
 public  void calcularmodaedad(){
     
     int max=0;
   int moda=0;
     Nodo aux=inicio;
     Nodo aux2;
     int numerorepeticiones=0;
     while(aux!=null){
         aux2=aux.getSig();
         
         while(aux2!=null){
             if(aux.getValor().getEdad()==aux2.getValor().getEdad())
             { 
                 numerorepeticiones++;
             }if(numerorepeticiones>max){
                 moda=aux.getValor().getEdad();
                 max=numerorepeticiones;
             }
            aux2=aux2.getSig();
         }
         aux=aux.getSig();
     }
     System.out.println(""+moda);  
     
 }
 
 public double calcularvarianzaedad(){
     
     Nodo aux=inicio;
     
  double var=0;
 double var2=0;
  double sum=0;
  double prom=0;
     
     while(aux!=null){
         var2=calcularpromedioedad()-aux.getValor().getEdad();
         var=var2*var2;
         sum=sum+var;
         aux=aux.getSig();
     }
    prom=sum/tamano; 
  return prom; 
 }
    
}
