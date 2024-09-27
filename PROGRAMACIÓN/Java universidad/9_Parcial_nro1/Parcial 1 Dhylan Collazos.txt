package com.mycompany.intercalar;

import java.util.Scanner;

public class Intercalar {

    public static void main(String[] args) {
//Objetos utilizados
        Scanner teclado = new Scanner(System.in);
        
//Variables utilizadas en el programa
        int vectorA[];
        int vectorB[];
        int m;
        int n;
        int escalonA = 0;
        int escalonB = 1;
        int posicionGlobal = 0;
        int counterGlobal = 0;
        
//Input del usuario tamaño del vector A
        System.out.println("Introduzca el length del vector a");
        m = teclado.nextInt();
        
//Input del usuario tamaño del vector B
        System.out.println("Introduzca el length del vector b");
        n = teclado.nextInt();
        int vectorC[];
        vectorA = new int[m];
        vectorB = new int[n];
        vectorC = new int[m + n];

//Imprenta del vector A
        System.out.println("Vector A");
        for (int i = 0; i < m; i++) {
            vectorA[i] = 10 + i;
            System.out.print(vectorA[i] + ", ");
        }
//Imprenta del vector B
        System.out.println("");
        System.out.println("Vector B");
        for (int i = 0; i < n; i++) {
            vectorB[i] = 50 + i;
            System.out.print(vectorB[i] + ", ");
        }
//Operaciones logicas (3 casos)
        if (m >= n) {
            if (m == n) {
//A igual que B FUNCIONA
                System.out.println("");
                System.out.println("Son iguales");
                for (int i = 0; i < m; i++) {
                    vectorC[escalonA] = vectorA[i];
                    if (vectorB.length > i) {
                        vectorC[escalonB] = vectorB[i];
                    }
                    escalonA += 2;
                    escalonB += 2;
                }
            } else {
//A mayor que B FUNCIONA
                System.out.println("");
                System.out.println("vector a es mayor");
                for (int i = 0; i < vectorB.length; i++) {
                    vectorC[escalonA] = vectorA[i];
                    if (vectorB.length > i) {
                        vectorC[escalonB] = vectorB[i];
                    }
                    escalonA += 2;
                    escalonB += 2;
                    posicionGlobal = i;
                }
                for (int i = (posicionGlobal + vectorB.length + 1); i < vectorC.length; i++) {
                    vectorC[i] = vectorA[n + counterGlobal];
                    counterGlobal += 1;
                }
            }
        } else {
//B mayor que A FUNCIONA
            System.out.println("el vector b es mayor");
            for (int i = 0; i < vectorA.length; i++) {
                vectorC[escalonA] = vectorA[i];
                if (vectorB.length > i) {
                    vectorC[escalonB] = vectorB[i];
                }
                escalonA += 2;
                escalonB += 2;
                posicionGlobal = i;
                System.out.println("asignacion" + (1 + i));
            }
            for (int i = (posicionGlobal + vectorA.length + 1); i < vectorC.length; i++) {
                vectorC[i] = vectorB[m + counterGlobal];
                counterGlobal += 1;
            }
        }
//Imprenta del vector C
        System.out.println("El vector c tiene los valores: ");
        for (int i = 0; i < vectorC.length; i++) {
            System.out.print(vectorC[i] + ", ");
        }
    }
}
