package com.mycompany.floristeria;

import java.util.ArrayList;

public class Arreglo {
//Atributos

    private ArrayList<Flor> flores;
    private String maceta, nombreArreglo;

//Constructor vacio
    public Arreglo() {
        maceta = "";
        nombreArreglo = "";
        flores = new ArrayList<Flor>();
    }

//Constructor parametrizado 
    public Arreglo(String maceta, String nombreArreglo) {
        this.maceta = maceta;
        this.nombreArreglo = nombreArreglo;
        this.flores = new ArrayList<Flor>();
    }

//gets and sets
    public String getMaceta() {
        return maceta;
    }

    public void setMaceta(String maceta) {
        this.maceta = maceta;
    }

    public String getNombreArreglo() {
        return nombreArreglo;
    }

    public void setNombreArreglo(String nombreArreglo) {
        this.nombreArreglo = nombreArreglo;
    }

//gets and sets utilizados con add para listas
    public ArrayList<Flor> availableFlores() {
        return flores;
    }

    public void addFlores(Flor flores1) {
        flores.add(flores1);
    }

//metodos
    public void mostrarFlores() {
        for (int i = 0; i < flores.size(); i++) {
            System.out.println(" - " + flores.get(i).getTipo());
        }
    }

    public void calcularPrecio() {
        int total = 0;
        for (int i = 0; i < flores.size(); i++) {
            total += flores.get(i).getCosto();
        }
        System.out.println(total);
    }
}
