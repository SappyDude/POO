package Matriz;

public class EjemploMatriz {
    public static void main(String[] args) {
        // 1. Declaramos una matriz de edades
        int edades[][];

        // 2. Instanciamos la matriz de edades
        edades = new int[3][2]; // matriz cudrada

        // 3. inicializar los valores de la matriz
        edades[0][0] = 30;
        edades[0][1] = 15;
        edades[1][0] = 20;
        edades[1][1] = 45;
        edades[2][0] = 5;
        edades[2][1] = 38;

        // 4.imprimir forma 1
        System.out.println("Matriz edades indice (0 0): " + edades[0][0]);
        System.out.println("Matriz edades indice (2 0): " + edades[2][0]);
        //System.out.println(edades.length);

        // forma 2 usando for anidado, for para recorrer las filas y for para recorrer
        // las columnas
        for (int i = 0; i < edades.length; i++) {
            for (int j = 0; j < edades[i].length; j++)
                System.out.println("Matriz edades indice:" + i + " - " + j + ": " + edades[i][j]);
        }

        // Matris de objetos de la clase Persona

        // 1 Declarar
        Persona personas[][] = new Persona[3][2];

        // 2 Instanciar
        personas = new Persona[3][2];

        // 3 inicializar debo llamar al constructor de la clase Persona
        personas[0][0] = new Persona("Juan");
        personas[0][1] = new Persona("Karla");

        // 4.imprimir usando for
        for (int i = 0; i < personas.length; i++) {
            // for para recorrer las columnas
            for (int j = 0; j < personas[i].length; j++)
                System.out.println("Matriz edades indice:" + i + " - " + j + ": " + personas[i][j]);
        }

        // 4.imprimir usando forEach
        for (Persona[] personas2 : personas) {
            for (Persona iterable_element : personas2)
                System.out.println(iterable_element);
        }

    }

}
