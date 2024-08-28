package com.gm.ventas;


public class Orden {
    //Atributos
    private int idOrden;
    private Producto[] productos;
    private int contadorProductos;
    private static int cantidadArray = 10;
    
    
    //Constructor vacío
    public Orden(){
        this.idOrden = 0;
        this.productos = new Producto[cantidadArray];
        this.contadorProductos = 0;
    }
    
    //Métodos (Funciones)
    public boolean agregarProducto(Producto producto){
        if ( contadorProductos < productos.length) {
            productos[contadorProductos++] = producto;
            return true;
        } else {
            System.out.println("Orden llena");
            return false;
        }
    }
    
    public double calcularTotal(){
        double total = 0;
        for (int i = 0; i < contadorProductos; i++) {
            total += productos[i].getPrecio();
        }
        return total;
    }
    
    public void mostrarOrden(){
        System.out.println("Id de la orden: " + idOrden);
        for (int i = 0; i < contadorProductos; i++) {
            System.out.println(productos[i]);            
        }        
    }
    
    //Gets
    public int getIdOrden() {
        return idOrden;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public int getContadorProductos() {
        return contadorProductos;
    }

    public static int getCantidadArray() {
        return cantidadArray;
    }
    //Sets

    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }

    public void setProductos(Producto[] productos) {
        this.productos = productos;
    }

    public void setContadorProductos(int contadorProductos) {
        this.contadorProductos = contadorProductos;
    }

    public static void setCantidadArray(int cantidadArray) {
        Orden.cantidadArray = cantidadArray;
    }
    
}
    