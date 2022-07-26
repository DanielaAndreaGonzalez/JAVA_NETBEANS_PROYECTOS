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
public class ClienteListasimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Lista milista=new Lista();
        
        Cliente micliente=new Cliente(1,"Daniela", "Henao","1234", false);
        
        Cliente micliente2=new Cliente(2,"Carmenza", "sernandez","1234", true);
        
        
        milista.agregaralfinal(micliente);
        milista.agregaralfinal(micliente2);
        
        System.out.println(""+milista.filtrarcliente('s'));
        
       Lista lista2=milista.frecuencia(false);
      
       String cadena="";
        Nodo aux=lista2.getInicio();
        while(aux!=null){
            cadena=cadena+aux.getCliente().getId()+"   "+aux.getCliente().getNombre()+"  "
            +aux.getCliente().getApellido()+"   "+aux.getCliente().getTelefono()
            +"   "+aux.getCliente().isEsClienteFrecuente()+"->";
            aux=aux.getSig();
        }
        System.out.println(""+cadena);
        milista.listar();
       
        
    }
    
}
