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
public class Palabrapalindroma {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
        //System.out.println(""+factorial(7)); 
       //System.out.println(""+rusa(37,6));
                
      //System.out.println("hola: "+binario(5));
             
       System.out.println(""+numeroinverso(45678));
       // System.out.println(""+longitudnumero(347));
      // System.out.println("suma consecutiva  "+sumaconsecutiva(2, 4));
    
       // System.out.println("Palabra palíndroma: "+palindroma("ana"));
    // Lista lista=new Lista();
//        Persona persona1=new Persona(1, "Marcos", "Osorio");
//         Persona persona2=new Persona(2, "Carmen", "Osorio");
//        lista.agregaralfinal(persona1);
//        lista.agregaralfinal(persona2);
//        
//        Nodo aux=lista.getInicio();
//        System.out.println(""+lista.listarecursvia(lista, aux));
      //salida= numero%2 == 0 ? "0" + salida : "1"+salida; 
        
       // System.out.println(""+binarioadecimal(101));
      
//     int numero=100;
//     int  b=0;
//     int i=0;
//      int acu=0;
//      int expo=0;    
//       String salida="";
//       while(numero>0){
//        b= numero %10;
//        acu= acu + b * (int) Math.pow(2, i);
//          i++; 
//          numero=numero/10;
//          
//       }
//  
//        System.out.println(""+acu); 
        
        
    }
    
    public static int factorial(int numero){
        if(numero==0)
        {
            return 1;
        }else{
            return factorial(numero-1)*numero;
        }
   }
    
    public static int rusa(int numeroa,int numerob){
        if(numeroa==1){
            return numerob;
        }else{
            if(numeroa%2==0){
            return rusa(numeroa/2,numerob*2);
            }
            else{
              return rusa(numeroa/2, numerob*2)+numerob;
            }
        }
        
    }
    public static String binario(int numero){
     String var="";
        if(numero/2==0){
            return ""+numero%2;
        }
     else{  
         var="";   
        return  var+binario(numero/2)+numero%2;
        }
     }
    
  public static String numeroinverso(int numero){
      
       
      if(numero/10==0){
          return ""+numero%10;
      }
     else{
       return  numero%10+numeroinverso(numero/10);
      }
      
      
  }
 
  public static int longitudnumero(int numero){
      
      if(numero<10){
          return 1;
      }else{
           return 1+longitudnumero(numero/10);
      }
  }
  
  public static int sumaconsecutiva(int numeroa,int numerob){
      if(numeroa==0){
          return numeroa;
      }
      else{
         
          return numerob+sumaconsecutiva(numeroa-1, numerob);
      }
 }
  
  public static int palindroma(String palabra){
      int i=0;
      int pal=palabra.length()-1;
     int bandera=0;
      if(pal<i){
         return bandera;
      }else{
          if(palabra.charAt(i)==palabra.charAt(pal)){
               i++;
               pal--;
               bandera=1;
             return palindroma(palabra); 
          }else{
              bandera=0;
              return palindroma(palabra); 
          }
       }
  }
  
//   
      
      
      
  
  
  

  
  
  
    
}
