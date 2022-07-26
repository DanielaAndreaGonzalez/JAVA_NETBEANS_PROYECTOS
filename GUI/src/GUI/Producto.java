/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.io.Serializable;

/**
 *
 * @author Penilla
 */
public class Producto implements Serializable{
    public String nombre;
    public String categoria;
    public double precio;
    public int cantidad;
    public String id_bodega;

    public Producto(String nombre, String categoria, double precio, int cantidad, String id_bodega) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.precio = precio;
        this.cantidad = cantidad;
        this.id_bodega = id_bodega;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getId_bodega() {
        return id_bodega;
    }

    public void setId_bodega(String id_bodega) {
        this.id_bodega = id_bodega;
    }

    
}
