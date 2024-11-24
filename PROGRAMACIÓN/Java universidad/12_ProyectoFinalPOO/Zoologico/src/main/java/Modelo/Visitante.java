package Modelo;

import java.util.LinkedList;

public class Visitante {

    //Atributos de la clase
    private int identificacion;
    private String nombre;
    private int edad;
    private int visitasHechas;
    private String interaccion;
    private LinkedList<String> interacciones;

    //Contructor vacío de la clase
    public Visitante() {
        this.identificacion = 0;
        this.nombre = "";
        this.edad = 0;
        this.visitasHechas = 0;
        this.interaccion = "";
        this.interacciones = new LinkedList<>();
    }

    //Constructor parametrizado de la clase
    public Visitante(int identificacion, String nombre, int edad) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.edad = edad;
        this.interacciones = new LinkedList<>();
    }

    //Gets and sets de la clase
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

    public void setVisitasHechas() {
        this.visitasHechas += 1;
    }

    public String getInteraccion() {
        return interaccion;
    }

    public void setInteraccion(String interaccion) {
        this.interaccion = interaccion;
    }

    public LinkedList obtenerListaInteracciones() {
        return interacciones;
    }

    public void agregarInteraccion(String interaccion) {
        interacciones.add(interaccion);
    }

    //Métodos de la clase
    public void mostrarInteracciones() {
        for (int i = 0; i < interacciones.size(); i++) {
            System.out.println(interacciones.get(i));
        }
    }
}
