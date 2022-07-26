/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegodepalabras;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.GregorianCalendar;
import sun.util.resources.LocaleData;

/**
 *
 * @author DAGonzalezH
 */
public class Juegodepalabras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Listas lista=new Listas();
      
 
        
        Persona persona=new Persona(1, "Mario", "Orozco", 500000,20);
        Persona persona2=new Persona(2, "Martha", "Franco", 400000,25);
        
         Persona persona3=new Persona(2, "María", "Arias", 600000,40);
         Persona persona4=new Persona(2, "María", "Arias", 600000,40);  
         
        
        
        lista.agregaralfinal(persona);
         lista.agregaralfinal(persona2);
         lista.agregaralfinal(persona3);
         lista.agregaralfinal(persona4);
         lista.listar();
        
          System.out.println("\nLISTA NUEVa\n");
        
          Listas lista2= lista.calcularsueldo();
          
        Nodo aux=lista2.getInicio();
        String salida="";
        while(aux!=null){
            salida=salida+aux.getValor().getId()+ "  "+aux.getValor().getNombre()+
                       "  "+aux.getValor().getApellido()+" "+aux.getValor().getSueldo();
                       aux=aux.getSig();
        }
        System.out.println(" "+salida);
        
        
        System.out.println(" Promedio edad : "+lista.calcularpromedioedad());
       
        
        System.out.println("La moda es: ");
      lista.calcularmodaedad();
        
        System.out.println("La varianza de la edad es "+lista.calcularvarianzaedad());
        
        
    }
//      public static int calcular(Calendar fechanac){
//           Calendar fecha_act=Calendar.getInstance();
//         
//           int year=fecha_act.get(Calendar.YEAR) - fechanac.get(Calendar.YEAR);
//           int months=fecha_act.get(Calendar.MONTH) -fechanac.get(Calendar.MONTH);
//           int days=fecha_act.get(Calendar.DAY_OF_MONTH) -fechanac.get(Calendar.DAY_OF_MONTH);
//           
//           if(months < 0 || (months==0 && days <0) )
//           {
//               year--;
//           }
//           return year;
//        }
}