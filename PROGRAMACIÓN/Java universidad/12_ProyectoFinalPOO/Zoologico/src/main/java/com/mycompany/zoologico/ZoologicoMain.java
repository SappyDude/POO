package com.mycompany.zoologico;

import java.util.Scanner;

/*
 * @author SappyDude
    Una proxima implmementacion es poder hacer una clase que almacene una cantidad de interacciones que 
    los visitantes puedan hacer, pero que este vinculada con los animales de forma abstracta, es decir
    una clase abstracta de la cual los animales puedan tomarla y usarla a gusto, pero que tengan acceso
    a la lista de las distintas interacciones que existen de forma general
 */
public class ZoologicoMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hola");
        String hola = input.nextLine();
        System.out.print("\033[H\033[2J");
        System.out.flush();

    }
}
