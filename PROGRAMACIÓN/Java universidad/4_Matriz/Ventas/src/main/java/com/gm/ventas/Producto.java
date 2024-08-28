package com.gm.ventas;

public class Producto {
    //Atributos
    private int idProducto;
    private String nombre;
    private double precio;
    
    
    //Constructor vacío 
    public Producto(){
    this.idProducto = 0;
    this.nombre = "";
    this.precio = 0;
    }
    
    //Constructor con parámetros
    public Producto(String nombre, double precio){
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
        return "Producto{" + "idProducto=" + idProducto + ", nombre=" + nombre + ", precio=" + precio + '}';
    }
    
}
