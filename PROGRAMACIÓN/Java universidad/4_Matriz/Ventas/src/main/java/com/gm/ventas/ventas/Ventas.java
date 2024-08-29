package com.gm.ventas.ventas;
//import the files from other carpets

import com.gm.ventas.Orden;
import com.gm.ventas.Producto;
import java.util.Scanner;

//Frontend
public class Ventas {

//main
    public static void main(String[] args) {
//creation of object and assign the products identifiers.
        Scanner Escaneador = new Scanner(System.in);
        Orden ordenPedido = new Orden();
        Producto producto1 = new Producto("pan", 600);
        producto1.setIdProducto(1);
        
        Producto producto2 = new Producto("papas", 1100);
        producto2.setIdProducto(2);
        
        Producto producto3 = new Producto("leche", 3000);
        producto3.setIdProducto(3);

//select menu
        System.out.println("Seleccione uno de los siguientes productos que desee comprar:");

//selection mode
        boolean condition = true;
        do {
            String productoSeleccionado = "";
            //lista de productos disponibles
            System.out.println("pan");
            System.out.println("papas");
            System.out.println("leche");
            productoSeleccionado = Escaneador.nextLine();
            //cambio de opciones

            switch (productoSeleccionado) {
                case "pan" -> {
                    System.out.println("elegiste pan");
                    ordenPedido.agregarProducto(producto1);
                    System.out.println("desea ingresar otro producto?");
                    System.out.println("true/false");
                    condition = Escaneador.nextBoolean();

                }
                case "papas" -> {
                    System.out.println("elegiste papas");
                    ordenPedido.agregarProducto(producto2);
                    System.out.println("desea ingresar otro producto?");
                    System.out.println("true/false");
                    condition = Escaneador.nextBoolean();
                    Escaneador.nextLine();
                }
                case "leche" -> {
                    System.out.println("elegiste leche");
                    ordenPedido.agregarProducto(producto3);
                    System.out.println("desea ingresar otro producto?");
                    System.out.println("true/false");
                    condition = Escaneador.nextBoolean();
                    Escaneador.nextLine();
                }
                default -> {
                    System.out.println("elija una de las opciones disponibles");
                    condition = true;
                }
            }
            /*el uso de nextboolean, lee la linea pero no "limpia" el valor en la memoria del buffer, por ello
  utilizamos el metodo Escaneador.nextln();, donde este si hace la funcion de limpiar el buffer*/

        } while (condition != false);

        ordenPedido.mostrarOrden();
        System.out.println("El total de su compra es: " + ordenPedido.calcularTotal() + " Pesos");
    }
}
