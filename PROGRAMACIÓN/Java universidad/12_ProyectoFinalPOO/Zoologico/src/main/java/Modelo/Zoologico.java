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

    public ArrayList<Visitante> getVisitantes() {
        return visitantesTotales;
    }

    public ArrayList<Zona> getZonas() {
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
            System.out.println("");
            System.out.println((i + 1) + ". Nombre: " + zonas.get(i).getNombre());
            System.out.println("- Habitat: " + zonas.get(i).getHabitat());
            System.out.println("- Cantidad de animales: " + zonas.get(i).getCantidadOcupada());
        }
    }
//el .agregarAnimal

    public void intentarAgregarAnimal(Animal animal) {
        for (int i = 0; i < zonas.size(); i++) {
            zonas.get(i).agregarAnimal(animal);
        }
    }

    public void imprimirVisitantes(){
        for (int i = 0; i < visitantesTotales.size(); i++) {
            System.out.println(visitantesTotales.get(i).getNombre());
        }
    }
    
    public int recorrerIds(int id) throws Exception{
        for (int i = 0; i < visitantesTotales.size(); i++) {
            if (id == visitantesTotales.get(i).getIdentificacion()) {
                throw new Exception("No se puede usar el mismo id que otra persona");
            }
        }
        return id;
    }
//  public void quitarVisitante(Visitante visitante) {
//  }
}
