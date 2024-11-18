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
    }

    //Constructor parametrizado de la clase 
    public Zona(String nombre, String habitat, int cantidadTotal) {
        this.nombre = nombre;
        this.habitat = habitat;
        this.cantidadTotal = cantidadTotal;
        this.cantidadOcupada = 0;
        this.animales = new ArrayList<>();
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

    public void setCantidadOcupada(int cantidadOcupada) {
        this.cantidadOcupada = cantidadOcupada;
    }

    //Métodos de la clase
    
    public boolean agregarAnimal(Animal animal) {
        if (!animal.getHabitatNatural().equals(this.habitat)) {
            System.out.println("El hábitat del animal no coincide con el de la zona.");
            return false;
        }
        if (animales.size() >= cantidadTotal) {
            System.out.println("La zona " + nombre + " ha alcanzado su capacidad máxima.");
            return false;
        }
        animales.add(animal);
        System.out.println("Animal agregado exitosamente a la zona " + nombre);
        return true;
    }
    public void mostrarAnimales() {
        for (int i = 0; i < animales.size(); i++) {
            if (animales.get(i).getClass() == Mamifero.class) {
                System.out.println("el mamifero se ha guardado");
                animales.get(i).getNombreCientifico();
            }
        }
    }

}
