package com.mycompany.zoologico;

import java.util.LinkedList;

/**
 *
 * @author SappyDude
 */
public class Visitante {

    private int identificacion;
    private String nombre;
    private int edad;
    private int visitasHechas;
    private String interaccion;
    private LinkedList<String> interacciones;

    public Visitante() {
    }

    public Visitante(int identificacion, String nombre, int edad, int visitasHechas) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.edad = edad;
        this.visitasHechas = visitasHechas;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
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

    public int getVisitasHechas() {
        return visitasHechas;
    }

    public void setVisitasHechas(int visitasHechas) {
        this.visitasHechas = visitasHechas;
    }

    public String getInteraccion() {
        return interaccion;
    }

    public void setInteraccion(String interaccion) {
        this.interaccion = interaccion;
    }

}
