
package marikada;

import javax.swing.JOptionPane;

public class Marikada{ 

public static void main(String a[]){ 

        int i; 
        
        Persona arr[]= new Persona[3]; 
        int d=0;
        while(d<3)
        {
            String nombre= JOptionPane.showInputDialog("por favor ingrese el nombre ");
            int edad= Integer.parseInt(JOptionPane.showInputDialog("por favor ingrese la edad "));
            Persona mipersona= new Persona(nombre, edad);
            arr[d]= mipersona;
            d++;
        }
        JOptionPane.showMessageDialog(null,"la personita carechimba es"+ arr[2].getNombre());

        System.out.println("\nAlgoritmo de HeapSort\n---------------"); 
        System.out.println("\nArreglo desordenado \n---------------"); 

            for (i = 0; i < arr.length; i++){ 

                System.out.print(" " +arr[i].getNombre()+"-"+arr[i].getEdad()); 

            } 

            for (i = arr.length; i > 1; i--) { 

                fnSortHeap(arr, i - 1); 

            } 

                System.out.println("\n\nArreglo ordenado\n---------------"); 

            for (i = 0; i < arr.length; i++){ 

                System.out.print("" +arr[i].getNombre()+" "); 

            } 
        } 

        public static void fnSortHeap(Persona array[], int arr_ubound){ 

        int i, o; 
        int lChild, rChild, mChild, root;
                 Persona temp; 

        root = (arr_ubound - 1) / 2; 

            for (o = root; o >= 0; o--){ 

                for (i = root; i >= 0; i--){ 

                    lChild = (2 * i) + 1; 
                    rChild = (2 * i) + 2; 

                    if ((lChild <= arr_ubound) && (rChild <= arr_ubound)) { 

                        if (array[rChild].getEdad() >= array[lChild].getEdad()){ 
                            mChild = rChild; 
                        }
                        else{ 
                            mChild = lChild; 
                            }

                    }else{ 

                        if (rChild > arr_ubound){ 
                            mChild = lChild; 
                        }
                        else{
                            mChild = rChild; 
                        }   
                    } 

                    if(array[i].getEdad() > array[mChild].getEdad()){ 

                       temp = array[i]; 
                        array[i] = array[mChild]; 
                        array[mChild] = temp; 
                    } 
                } 
            } 

            temp = array[0]; 
            array[0] = array[arr_ubound]; 
            array[arr_ubound] = temp; 
            return; 
        } 
}
