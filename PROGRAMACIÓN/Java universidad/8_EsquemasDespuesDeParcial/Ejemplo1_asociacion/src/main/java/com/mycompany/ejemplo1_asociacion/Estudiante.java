package com.mycompany.ejemplo1_asociacion;

public class Estudiante {

    private String nombre;
    private int edad;
    private char genero;

    public Estudiante(String nombre, int edad, char genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public Estudiante() {
        nombre = "";
        edad = 0;
        genero = '-';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }
}
