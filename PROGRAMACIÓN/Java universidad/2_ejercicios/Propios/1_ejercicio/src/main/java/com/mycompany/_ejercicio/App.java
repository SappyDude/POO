package com.mycompany._ejercicio;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Variables
        int nro1, nro2, result;
        String resultD;
        char op; 
        
        // Creación de objeto (Invocación de la clase "Scanner" por medio de un objeto)
        Scanner Escaneador = new Scanner (System.in);
        Aritmetica Operar = new Aritmetica ();
        
        System.out.println("Ingrese su primer numero");
        nro1 = Escaneador.nextInt();
        
        System.out.println("Ingrese su segundo numero");
        nro2 = Escaneador.nextInt(); 
        
        System.out.println("Ingrese la operación que desee realizar");
        System.out.println("(s)suma");
        System.out.println("(r)resta");
        System.out.println("(m)multiplicar");
        System.out.println("(d)dividir");
        op = Escaneador.next().charAt(0);   
        
        switch (op) {
            case 's':
                result = Operar.suma(nro1, nro2);
                System.out.println("Su suma es: " + result);
                break;
                
            case 'r':
                result = Operar.resta(nro1,nro2);
                System.out.println("Su suma es: " + result);
                break;
                
            case 'm':
                result = Operar.multiplicacion(nro1,nro2);
                System.out.println("Su suma es: " + result);
                break;
                
            case 'd':
                resultD = Operar.dividir(nro1,nro2);
                System.out.println("Su suma es: " + resultD);
                break;
                
            default:
                throw new AssertionError();
        }
    }
}
