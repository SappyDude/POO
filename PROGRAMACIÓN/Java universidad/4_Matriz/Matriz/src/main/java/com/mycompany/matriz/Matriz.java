package com.mycompany.matriz;

public class Matriz {

    public static void main(String[] args) {
        //Declarar
        int edades[][];

        //Instanciar, es crear un espacio en la memoria
        edades = new int[3][2];

        //declarar, instanciarse, iniciar
        edades[0][0] = 30;
        edades[0][1] = 15;
        edades[1][0] = 20;
        edades[1][1] = 45;
        edades[2][0] = 5;
        edades[2][0] = 1;
        
        
        //aqui se declara y se instancia al mismo tiempo
        Persona personas [][] = new Persona [2][3];
        //se le designa un nuevo objeto al constructor
        personas[0][0] = new Persona("Juan");
        
        //Imprimir
        //recorre las casillas
        for (int i = 0; i < edades.length; i++) {
            for (int j = 0; j < edades[i].length; j++) {
                System.out.println("Matriz edades " + i + " , " + j + ": " + edades[i][j]);
            }
        }
        
    }
}
