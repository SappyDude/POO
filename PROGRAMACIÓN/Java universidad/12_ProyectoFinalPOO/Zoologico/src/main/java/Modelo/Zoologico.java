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
        System.out.println("Contrasenia cambiada correctamente");
    }

    public ArrayList<Visitante> getVisitantes() {
        return visitantesTotales;
    }

    public ArrayList<Zona> getZonas() {
        return zonas;
    }

//Métodos utilizados en esta clase
    public void agregarZona(Zona zona) {
        zonas.add(zona);
    }

    public void mostrarZonas() {
        for (int i = 0; i < zonas.size(); i++) {
            System.out.println("");
            System.out.println((i + 1) + ". " + zonas.get(i).getNombre());
            System.out.println("- Habitat: " + zonas.get(i).getHabitat());
            System.out.println("- Cantidad de animales: " + zonas.get(i).getCantidadOcupada());
        }
    }

    public void intentarAgregarAnimal(Animal animal) {
        for (int i = 0; i < zonas.size(); i++) {
            zonas.get(i).agregarAnimal(animal);
        }
    }

    public void agregarVisitante(Visitante visitante) {
        if (visitantesTotales == null) {
            visitantesTotales = new ArrayList<>(); // Inicializa la lista si no está inicializada
        }
        visitantesTotales.add(visitante);
    }

    public void imprimirVisitantes() {
        System.out.println("\n Lista de visitantes");
        for (int i = 0; i < visitantesTotales.size(); i++) {
            System.out.println((i + 1) + ". " + visitantesTotales.get(i).getNombre());
        }
    }

    public int recorrerIds(int id) throws Exception/*NECESARIAS LAS EXCEPCIONES PERSONALIZADAS*/ {
        for (int i = 0; i < visitantesTotales.size(); i++) {
            if (id == visitantesTotales.get(i).getIdentificacion()) {
                System.out.println("\nNo se puede usar el mismo id que otra persona");
                throw new Exception();
            }
        }
        return id;
    }
}
