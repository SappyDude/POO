package Modelo;

import java.util.ArrayList;

public class Zona {

    //Atributos de la clase
    private String nombre;
    private String habitat;
    private int cantidadOcupada;
    private int cantidadTotal;
    private ArrayList<Animal> animales;
    private ArrayList<Visitante> visitantesPorZona;

    //Constructor vacío de la clase
    public Zona() {
        this.nombre = "";
        this.habitat = "";
        this.cantidadTotal = 0;
        this.cantidadOcupada = 0;
        this.animales = new ArrayList<>();
        this.visitantesPorZona = new ArrayList<>();
    }

    //Constructor parametrizado de la clase 
    public Zona(String nombre, String habitat, int cantidadTotal) {
        this.nombre = nombre;
        this.habitat = habitat;
        this.cantidadTotal = cantidadTotal;
        this.cantidadOcupada = 0;
        this.animales = new ArrayList<Animal>();
        this.visitantesPorZona = new ArrayList<Visitante>();

    }

    //Gets and Sets de la clase
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public int getCantidadOcupada() {
        return cantidadOcupada;
    }

    public void setCantidadOcupada() {
        this.cantidadOcupada += 1;
    }

    public ArrayList<Visitante> getVisitantesPorZona() {
        return visitantesPorZona;
    }

    public void setVisitantesPorZona(Visitante visitante) {
        visitantesPorZona.add(visitante);
    }

    public ArrayList<Animal> getAnimales() {
        return animales;
    }

    //Métodos de la clase
    public boolean agregarAnimal(Animal animal) {
        if (!animal.getHabitatNatural().equals(this.habitat)) {
            return false;
        }
        if (animales.size() >= cantidadTotal) {
            return false;
        }
        animales.add(animal);
        setCantidadOcupada();
        return true;
    }

    public void mostrarAnimalesEnLaZona() {
        for (int i = 0; i < animales.size(); i++) {
            System.out.println((i + 1) + ". " + animales.get(i).nombre);
        }
    }

    public boolean removerVisitanteDeZona(Visitante visitante) {
        for (int i = 0; i < visitantesPorZona.size(); i++) {
            if (visitante == visitantesPorZona.get(i)) {
                visitantesPorZona.remove(i);
                return true;
            }
        }
        return false;
    }
}
