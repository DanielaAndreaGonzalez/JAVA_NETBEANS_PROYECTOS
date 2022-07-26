/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author Penilla
 */
public class EntradaProducto {
    
    private FileInputStream archivo;
    private ObjectInputStream entrada;
    
    public void abrir() throws IOException
    {
        archivo = new FileInputStream("productos.txt");
        entrada = new ObjectInputStream(archivo);
    }
    
    public void cerrar() throws IOException
    {
        if(entrada != null)
        {
            entrada.close();
        }
    }
    
    public Producto leer () throws IOException, ClassNotFoundException
    {
        Producto miProducto = null;
        if(entrada != null)
        {
            try
            {
                miProducto = (Producto) entrada.readObject();
            }
            catch (EOFException eof)
            {
                
            }
        }
        
        return miProducto;
    }
    
}
