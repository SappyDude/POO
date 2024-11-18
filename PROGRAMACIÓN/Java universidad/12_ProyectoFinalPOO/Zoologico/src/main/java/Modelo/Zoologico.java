package Modelo;
//Importaciones de otras clases

import java.util.ArrayList;

public class Zoologico {

//Atributos de la clase
    private String nombre = "ZooNiverse";
    private ArrayList<Zona> zonas;
    private ArrayList<Visitante> visitantesTotales;
    private String contraseña;

//Constructor sin parámetros
    public Zoologico() {
        this.visitantesTotales = new ArrayList<>();
        this.zonas = new ArrayList<>();
        this.contraseña = "admin.123";
    }

//Gets and sets de la clase
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public ArrayList<Visitante> obtenerVisitantes() {
        return visitantesTotales;
    }

    public ArrayList<Zona> obtenerZonas() {
        return zonas;
    }
//Métodos utilizados en esta clase

    public void agregarVisitante(Visitante visitante) {
        if (visitantesTotales == null) {
            visitantesTotales = new ArrayList<>(); // Inicializa la lista si no está inicializada
        }
        visitantesTotales.add(visitante);
    }

    public void agregarZona(Zona zona) {
        zonas.add(zona);
    }

    public void mostrarZonas() {
        for (int i = 0; i < zonas.size(); i++) {
            System.out.println("1.Nombre: " + zonas.get(i).getNombre());
            System.out.println("2.Habitat: " + zonas.get(i).getHabitat());
            System.out.println("3.Cantidad de animales: " + zonas.get(i).getCantidadOcupada());
        }
    }
//el .agregarAnimal
    public void intentarAgregarAnimal(Animal animal) {
        for (int i = 0; i < zonas.size(); i++) {
            zonas.get(i).agregarAnimal(animal);
        }
    }
//  public void quitarVisitante(Visitante visitante) {
//  }
}
