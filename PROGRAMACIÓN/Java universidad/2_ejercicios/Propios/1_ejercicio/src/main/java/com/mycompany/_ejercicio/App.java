package com.mycompany._ejercicio;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // Variables
        int nro1, nro2;
        // Creación de objeto (Invocación de la clase "Scanner" por medio de un objeto)
        Scanner Escaneador = new Scanner (System.in);
        
        System.out.println("Ingrese su primer número");
        nro1 = Escaneador.nextInt();
        
        System.out.println("Ingrese su segundo número");
        nro2 = Escaneador.nextInt();
        
        System.out.println("La suma de " + nro1 + " y " + nro2 + " es: " + (nro1+nro2));
        
        
    }
}
