/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Queue;

import java.util.Scanner;

/**
 *
 * @author DAGonzalezH
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
      
        Cola cola=new Cola();
        Scanner teclado= new Scanner(System.in);
       /* cola.insertarnodo(cola);
        cola.insertarnodo(cola);
        cola.insertarnodo(cola);
        cola.insertarnodo(cola);
        cola.insertarnodo(cola);
        cola.insertarnodo(cola);
        System.out.println("\n COLA ingresada\n");
        cola.desplegarcola();*/
        
        int opcionmenu=0;
        
        do{
            System.out.println("   |---------------------------|");
            System.out.println("   |     + Concepto de cola +  |");
            System.out.println("   |---------------------------|");
            System.out.println("   |1.Insertar   | 4.eliminar  |");
            System.out.println("   |2.Buscar     | 5. Desplegar|");
            System.out.println("   |3.Modificar  | 6.Salir     |");
            System.out.println("   |---------------------------|");
            System.out.println("   |        Elija una opción   |");
            System.out.println("   |---------------------------|");
            opcionmenu= teclado.nextInt();
            
            switch(opcionmenu){
                case 1:
                {
                    System.out.println("\n\n inserta Nodo en la Cola");
                    cola.insertarnodo(cola);
                    break;
                }
                case 2:
                {
                 System.out.println("\n\n Buscar un nodo en la cola");
                 cola.buscarNodo();
                 break;
                }
                case 3:
                {
                    System.out.println("\n\n Modificar nodo de la cola");
                    cola.modificarnodo();
                            
                    break;
                }
                case 4:
                {
                    System.out.println("\n\n Eliminar nodo de la cola");
                    cola.eliminarnodo();
                    break;
                }
                case 5:
                {
                    System.out.println("\n\n Desplegar COla");
                   cola.desplegarcola();
                    break;
                }
                case 6:
                {
                    System.out.println("\n\n Programa finalizado");
                    break;
                }
                default:
                {
                    System.out.println("\n\n Opcion no valida");
                    System.exit(0);
                    break;
                }
            }
         }
        while(opcionmenu!=6);
     }
  }
