/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientelistasimple;

/**
 *
 * @author DAGonzalezH
 */
public class Lista {
    
    private Nodo inicio;
    private int tamano;

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
    
    public boolean esVacia(){
        return inicio==null;
    }
    
    
    
   public void agregaralfinal(Cliente cliente){
       
       Nodo nuevo=new Nodo();
       nuevo.setCliente(cliente);
    
       if(esVacia()){
           inicio=nuevo;
       }
       else
       {
           
          Nodo aux=inicio;
           while(aux.getSig()!=null){
               
               aux=aux.getSig();
           }
           aux.setSig(nuevo);
           tamano++;
     }
  } 
    
    public void listar(){
        
        String cadena="";
        Nodo aux=inicio;
        while(aux!=null){
           cadena=cadena+aux.getCliente().getId()+"   "+aux.getCliente().getNombre()+"  "
            +aux.getCliente().getApellido()+"   "+aux.getCliente().getTelefono()
            +"   "+aux.getCliente().isEsClienteFrecuente()+"->";
           
           aux=aux.getSig();
            
        }
        System.out.println(""+cadena+"  null");
    }
    
    public String filtrarcliente(char letra){
           String cadena="";
        if(!esVacia()){
            Nodo aux=inicio;
         while(aux!=null)
            {
            if(aux.getCliente().getApellido().charAt(0)==letra)
            {
            
          cadena=cadena+aux.getCliente().getNombre()+" "+
                        aux.getCliente().getApellido()+
                        aux.getCliente().getId()+" "+aux.getCliente().isEsClienteFrecuente();
             }
            aux=aux.getSig();
            }
           
        }
        else{
            System.out.println("Ingrese datos");
        }
        return cadena;
       
    }
     public void listarfiltrado(){
        
        String cadena="";
        Nodo aux=inicio;
        while(aux!=null){
           cadena=cadena+aux.getCliente().getId()+"   "+aux.getCliente().getNombre()+"  "
            +aux.getCliente().getApellido()+"   "+aux.getCliente().getTelefono()
            +"   "+aux.getCliente().isEsClienteFrecuente()+"->";
           
           aux=aux.getSig();
            
        }
        System.out.println(""+cadena+"  null");
    }
    public Lista frecuencia(Boolean valor){
         Lista listica=new Lista();
             Cliente cliente=null;
         if(!esVacia()){
             Nodo aux=inicio;
            
             while(aux!=null){
                 
                 if(aux.getCliente().isEsClienteFrecuente()==valor){
              cliente=new Cliente(aux.getCliente().getId(),aux.getCliente().getNombre(),
                    aux.getCliente().getApellido(),aux.getCliente().getTelefono(),aux.getCliente().isEsClienteFrecuente());
                    
              listica.agregaralfinal(cliente);
                 }
      aux=aux.getSig();
             }
           
             
         }
         return listica;
    }
    
    
    
}
