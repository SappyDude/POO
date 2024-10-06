package com.mycompany.floristeria;

import java.util.ArrayList;

public class Arreglo {

//Atributos
    private String nombreArreglo;
    private ArrayList<Flor> flores;

//Constructor vacío
    public Arreglo() {
        nombreArreglo = "";
        flores = new ArrayList<>();
    }

//Constructor parametrizado 
    public Arreglo(String nombreArreglo) {
        this.nombreArreglo = nombreArreglo;
        this.flores = new ArrayList<>();
    }

//Gets and sets de la clase
    public String getNombreArreglo() {
        return nombreArreglo;
    }

    public void setNombreArreglo(String nombreArreglo) {
        this.nombreArreglo = nombreArreglo;
    }

    public void agregarFlor(Flor flor) {
        flores.add(flor);
    }

//Métodos
    public void mostrarFlores() {
        for (int i = 0; i < flores.size(); i++) {
            System.out.println(" - " + flores.get(i).getTipo() + " (" + flores.get(i).getColor() + ")");
        }
    }

    public int calcularPrecio() {
        int total = 0;
        for (int i = 0; i < flores.size(); i++) {
            total += flores.get(i).getCosto();
        }
        return total;
    }
}
