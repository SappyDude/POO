package com.mycompany.ejemplo1_asociacion;

public class Profesor {

    private String nombre, nacionalidad;
    private int edad;
    private char genero;

    public Profesor(String nombre, String nacionalidad, int edad, char genero) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.edad = edad;
        this.genero = genero;
    }

    public Profesor() {
        nombre = "";
        nacionalidad = "";
        edad = 0;
        genero = ' ';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
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
