package com.mycompany.persona;

public class Main {
    public static void main(String[] args) {
//1 hacemos un array de variables tipo int
        int edades[];
//2 instanciar el array de int (LAS DIMENSIONES DEL VECTOR/ARRAY)
// instanciar: decirle a la memoria cuanto va a ocupar

        edades = new int[3]; //tamaño 3

        edades[0] = 30;
        edades[1] = 15;
        edades[2] = 20;
//propiedades/run/
//3
//i++ son los pasos que va tomando 
        for (int i = 0; i < edades.length; i++) {
            System.out.println(edades[i]);
        }
        
    
        System.out.println("Hello World!");
    
        // se crea el vector tipo persona
        Persona personas[];
        //instancia cuantos valores tiene
        personas = new Persona[3];
        //inicializar
        personas[0] = new Persona("Camilo", 25);        
        personas[1] = new Persona("Pedro", 20);        
        personas[2] = new Persona("Lia", 27);        
        
        for (int i = 0; i < personas.length; i++) {
            System.out.println(personas[i]);
        }
    }
}
