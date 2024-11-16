package Modelo;

import Modelo.Animal;
import java.util.ArrayList;

public class Zona {

    private String nombre;
    private String habitat;
    private int cantidadOcupada;
    private int cantidadTotal;
    private ArrayList<Animal> animales;
    private ArrayList<Visitante> visitantesPorZona;
    
    public Zona() {
    }

    public Zona(String nombre, String habitat, int cantidadTotal) {
        this.nombre = nombre;
        this.habitat = habitat;
        this.cantidadTotal = cantidadTotal;
    }

}
