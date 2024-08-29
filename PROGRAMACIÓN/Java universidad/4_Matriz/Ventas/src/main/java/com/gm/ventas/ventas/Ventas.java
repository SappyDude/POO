package com.gm.ventas.ventas;
//import the files from other carpets

import com.gm.ventas.Producto;
import java.util.Scanner;

//Frontend
public class Ventas {

//main
    public static void main(String[] args) {
//creation of object and assign the products identifiers.
        Scanner Escaneador = new Scanner(System.in);
        Producto producto1 = new Producto("pan", 600);
        producto1.setIdProducto(1);
        Producto producto2 = new Producto("papas", 1100);
        producto2.setIdProducto(2);
        Producto producto3 = new Producto("leche", 3000);
        producto3.setIdProducto(3);
        String productoSeleccionado = "";
//select menu
        System.out.println("Seleccione uno de los siguientes productos que desee comprar:");
        System.out.println("pan");
        System.out.println("papas");
        System.out.println("leche");
        
//selection mode
        boolean condition = false;
        do {            
            productoSeleccionado = Escaneador.nextLine();
            switch (productoSeleccionado) {
                case "pan":
                    System.out.println("elegiste pan");
                    condition = true;              
                    break;
                case "papas":
                    System.out.println("elegiste papas");
                    condition = true;
                    break;
                case "leche":
                    System.out.println("elegiste leche");
                    condition = true;
                    break;
                default:
                    System.out.println("elija una de las opciones disponibles");
            }
        } while (condition == false);
    }
}
