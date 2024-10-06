package com.mycompany.floristeria;

public class Flor {

//Atributos de la clase
    private double costo;
    private String tipo, color;

//Constructor vacío
    public Flor() {
        costo = 0.0;
        tipo = "";
        color = "";
    }

//Constructor parametrizado
    public Flor(double costo, String tipo, String color) {
        this.costo = costo;
        this.tipo = tipo;
        this.color = color;
    }

//gets and sets de la clase
    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
