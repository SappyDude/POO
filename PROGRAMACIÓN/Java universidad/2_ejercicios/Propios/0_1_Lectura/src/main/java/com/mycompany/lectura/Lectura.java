package com.mycompany.lectura;
import java.util.Scanner;
public class Lectura {


    public static void main(String[] args) {
        System.out.println("Aquí comienza el proyecto");
        // las comillas simples estan definidas y no se permiten utilizar como las comillas dobles
        
        //Declarar variables
        String nombres, apellidos;
        int edad;
        char genero;
        float salario;
        
        Scanner objScanner = new Scanner (System.in);
        System.out.println("Digite los nombres: ");
        nombres = objScanner.nextLine(); //leer
        
        System.out.println("Digite los apellidos");
        apellidos = objScanner.nextLine(); //leer 
        
        System.out.println("Digite su salario: ");
        salario = objScanner.nextFloat();
        
        do {            
            System.out.println("Digite la edad");
            edad = objScanner.nextInt();
        } while (edad < 0);
        
        do {            
        System.out.println("Digite su género");
        genero = objScanner.nextLine().charAt(0);
           
        } while (genero != 'M' && genero != 'm' && genero != 'F' && genero != 'f');
 
 
    }
}
