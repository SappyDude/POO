package com.mycompany.libreria;

import java.util.ArrayList;

public class Libreria {

    /*
    doxygen
    @author
    Dhylan Styven Collazos
    @brief
    Este ejemplo representa la impolementacion del segundo ejemplo de herencia donde se describe el funcioamiento de una bilbioteca
    @link
    
    
     */
    public static void main(String[] args) {

        ArrayList<Libro> misLibros = new ArrayList<>();
        misLibros.add(new Novela("genero1", "resumen1", "titulo1", "autor1", 10));
//        misLibros.add(new LibroDeReferencia("genero1", "resumen1", "titulo1", "autor1", 10));

    }

    public static void ImprimirNovelas(ArrayList<Libro> misLibros) {
        System.out.println(" Datos de las novelas");
        for (int i = 0; i <misLibros.size(); i++) {
            Libro unlibro 
        }

    }
}
