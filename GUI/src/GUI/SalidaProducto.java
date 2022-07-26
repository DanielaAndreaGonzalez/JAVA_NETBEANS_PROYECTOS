/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
/**
 *
 * @author Penilla
 */
public class SalidaProducto {
    
    private FileOutputStream archivo;
    private ObjectOutputStream salida;
    
    //Abrir el archivo
    public void abrir() throws IOException
    {
        archivo = new FileOutputStream("productos.txt");
        salida = new ObjectOutputStream(archivo);
    }
    
    //Cerrar el archivo
    public void cerrar() throws IOException
    {
        if(salida != null)
        {
            salida.close();
        }
    }
    
    //Escribir archivo
    public void escribir (Producto miProducto) throws IOException
    {
        if(salida != null)
        {
            salida.writeObject(miProducto);
        }
    }
    
}
