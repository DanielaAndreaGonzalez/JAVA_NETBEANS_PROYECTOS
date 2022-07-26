/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palabrapalindroma;

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

     public void agregaralfinal(Persona valor){
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
     
     
    public String listarecursvia(Lista lista,Nodo aux){
        
       String salida="";
        if(aux.getSig()==null){
             salida+=aux.getValor().getNombre();
           return salida;
          }
        else{
            salida=salida+aux.getValor().getNombre();
            
           return salida+listarecursvia(lista,aux.getSig());           
      }
  }
    
       
       
       
       
   
    
     
    
    
    
    
}
