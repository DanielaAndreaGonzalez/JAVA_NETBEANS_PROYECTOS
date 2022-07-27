package listadoble;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sala
 */
public class Nodo {
    
    private int dato;
    private Nodo sig;
    private Nodo ant;

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public Nodo getSig() {
        return sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }

    public Nodo getAnt() {
        return ant;
    }

    public void setAnt(Nodo ant) {
        this.ant = ant;
    }
    
    
    public Nodo(){
        this.dato=0;
        this.sig=null;
        this.ant=null;   
    }
}
    
   class Lista{
   
       int tamano;
       Nodo raiz;

        public int getTamano() {
            return tamano;
        }

        public void setTamano(int tamano) {
            this.tamano = tamano;
        }

        public Nodo getRaiz() {
            return raiz;
        }

        public void setRaiz(Nodo raiz) {
            this.raiz = raiz;
        }
       
       public Lista(){
           
           raiz=null;
           tamano=0;   
       }
       
       public boolean esvacia(){
           
           return raiz==null;
       }
       
       public void agregarfinal(int dato){
           
           Nodo nuevo=new Nodo();
           nuevo.setDato(dato);
           
           if(esvacia()){
               raiz=nuevo;
           }
           else
           {
              Nodo aux=raiz;
              while(aux.getSig()!=null)
              {
                  aux=aux.getSig();
              }
              aux.setSig(nuevo);
              nuevo.setAnt(aux);
           }
           tamano++;
       }
    
       public void listar(){
           
           Nodo aux=raiz;
           String cadena="";
           while(aux!=null){
               
               cadena=cadena+aux.getDato()+"->";
               
               aux=aux.getSig();
           } 
           System.out.println(""+cadena+"null");
       }
       
       public void agregarinicio(int dato){
           
           Nodo nuevo=new Nodo();
           
           nuevo.setDato(dato);
           
           if(esvacia()){
               raiz=nuevo;
           }
           else
           {
               nuevo.setSig(raiz);
               raiz=nuevo;
           }
           tamano++;
       }
       
       
       public void eliminar(int dato){
           
           Nodo aux=raiz;
           
           if(dato==raiz.getDato()){
               
               raiz=raiz.getSig();
           }
           else
           {
              
               while(aux.getSig()!=null){
                   if(aux.getDato()==dato)
                   {
                  aux=aux.getAnt();
                  aux.setSig(aux.getSig().getSig());
                  aux=aux.getSig();
                  aux.setAnt(aux.getAnt().getAnt());
                }
               aux=aux.getAnt();
          }
           
           
       }
       
       
       }
}
    
    
    
    
    
    
    
    
    
    
    
    

