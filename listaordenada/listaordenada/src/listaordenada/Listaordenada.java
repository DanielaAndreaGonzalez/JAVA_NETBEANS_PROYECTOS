/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaordenada;

/**
 *
 * @author Sala
 */
public class Listaordenada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
      Lista lista=new Lista();
     

        lista.agregaralfinal(2);
         lista.agregaralfinal(4);
        lista.agregaralfinal(8);
        lista.agregaralfinal(5);
        lista.agregaralfinal(2);
        lista.agregaralfinal(1);
        lista.agregaralfinal(3);
        lista.agregaralfinal(4);
        lista.agregaralfinal(5);
        lista.agregaralfinal(7);
       lista.agregaralfinal(5);
        lista.agregaralfinal(5);
     
        System.out.println(" LISTA ORDENADA\n");
         
        lista.listaordenada(lista);
        
         Nodo aux=lista.getInicio();
      String salida="";
      while(aux!=null){
          
          salida=salida+ "->"+aux.getDato();
          aux=aux.getSig();
      }
      System.out.println(salida+"->null");
        
          
     
        System.out.println("NÚMERO MAYOR");
      System.out.println("El número ("+lista.numeromayor().toString()+") es el mayor de la lista");
      
      Nodo aux2=lista.getInicio();
       lista.numeromayor();
        System.out.println("NÚMERO MENOR");
       System.out.println("El número ("+aux2.getDato()+")es el menor de la lista");
      
        System.out.println("PROMEDIO : "+lista.calcularpromedio());
       
       
        System.out.println("MEDIANA");
        System.out.println("El número ("+lista.calcularmediana()+") es la mediana de la lista");

        System.out.println("MODA");
        lista.calcularmoda();
        
        System.out.println(" VARIANZA:"+  lista.calcularvarianza());
       
       lista.calculardesviacion();
       
       
      
    }
}

