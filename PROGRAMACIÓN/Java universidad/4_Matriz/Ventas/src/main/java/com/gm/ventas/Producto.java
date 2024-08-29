package com.gm.ventas;
//Backend

public class Producto {

    //Atributes
    private int idProducto;
    private String nombre;
    private double precio;

    //empty builder
    public Producto() {
        this.idProducto = 0;
        this.nombre = "";
        this.precio = 0;
    }

    //builder with parameters
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    //Gets
    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    //Sets
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    //toString
    @Override
    public String toString() {
        return "Producto: " + nombre + ": " + precio;
    }

}
