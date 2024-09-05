package com.mycompany.conseguirpi;

import java.util.Scanner;

public class ConseguirPI {
//crear un vector con todos los valores y luego, llamar a cada uno y hacer su sumatoria

    public static void main(String[] args) {
//variables
        Scanner escanear = new Scanner(System.in);
        double pi = 0;
        int iteracion;
//pedir exactitud
        System.out.println("Ingresa que tan preciso quieres que sea la constante pi");
        iteracion = escanear.nextInt();

//Declaramos en array
        double cantidadVeces[];
        double posicion = 1;

//instanciamos 
        cantidadVeces = new double[iteracion];

        for (int i = 0; i < iteracion; i++) {
            cantidadVeces[i] = (1 / posicion);

            if (i % 2 != 0) {
                cantidadVeces[i] *= -1;
            }

            posicion += 2;
            System.out.println("iteracion nro " + i);
        }
        for (int i = 0; i < cantidadVeces.length; i++) {
            pi += (double) (cantidadVeces[i]);
        }

        pi = pi * 4;
        System.out.println("Su valor de pi aproximado es: " + pi);
    }
}
