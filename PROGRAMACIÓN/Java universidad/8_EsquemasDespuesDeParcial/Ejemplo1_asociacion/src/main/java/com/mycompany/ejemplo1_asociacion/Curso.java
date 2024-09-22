package com.mycompany.ejemplo1_asociacion;

import java.util.ArrayList;

public class Curso {

    private String nombre;
    private int creditos;
    private Profesor profesor;
    private ArrayList<Estudiante> estudiantes;

    public Curso(String nombre, int creditos, Profesor profesor) {
        this.nombre = nombre;
        this.creditos = creditos;
        this.profesor = profesor;
        this.estudiantes = new ArrayList<>();
    }
//los objetos se inicializan en null

    public Curso() {
        nombre = "";
        creditos = 0;
        profesor = null;
        estudiantes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public void mostrarEstudiantes() {
        System.out.println("Estudiantes del curso: " + nombre);
        for (int i = 0; i < estudiantes.size(); i++) {
            System.out.println("Estudiante " + (i + 1) + ":");
            System.out.println("    Nombre:    " + estudiantes.get(i).getNombre());
            System.out.println("    Edad:      " + estudiantes.get(i).getEdad());
            System.out.println("    Genero:    " + estudiantes.get(i).getGenero());
        }
    }

    public void mostrarProfesor() {
        System.out.println("Profesor: " + profesor.getNombre() + ". Edad: " + profesor.getEdad());
    }

}
