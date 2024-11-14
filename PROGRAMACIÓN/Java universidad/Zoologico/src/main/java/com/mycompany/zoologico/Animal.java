package com.mycompany.zoologico;

/**
 * @author SappyDude
 */
public abstract class Animal {

    protected String nombreCientifico;
    protected int edad;
    protected float peso;
    protected boolean esPeligroso;
    protected String habitatNatural;
    protected String dieta;

    public Animal() {
    }

    public Animal(String nombreCientifico, int edad, float peso, boolean esPeligroso, String habitatNatural, String dieta) {
        this.nombreCientifico = nombreCientifico;
        this.edad = edad;
        this.peso = peso;
        this.esPeligroso = esPeligroso;
        this.habitatNatural = habitatNatural;
        this.dieta = dieta;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public boolean isEsPeligroso() {
        return esPeligroso;
    }

    public void setEsPeligroso(boolean esPeligroso) {
        this.esPeligroso = esPeligroso;
    }

    public String getHabitatNatural() {
        return habitatNatural;
    }

    public void setHabitatNatural(String habitatNatural) {
        this.habitatNatural = habitatNatural;
    }

    public String getDieta() {
        return dieta;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    public void mostrarDetalles() {
        System.out.println("Las caracteristicas del animal son:"
                + "Nombre cientifico: " + nombreCientifico
                + "Edad del animal: " + edad
                + "Peso: " + peso
                + "Su habitat natural es: " + habitatNatural
                + "Su alimentacion consiste de: " + dieta
        );
    }

    public abstract void comer();

}
