package com.mycompany.floristeria;

public class Flor {

//Atributos de la clase
    private float costo;
    private String tipo, color;

//Constructor vacío
    public Flor() {
        costo = 0;
        tipo = "";
        color = "";
    }

//Constructor parametrizado
    public Flor(float costo, String tipo, String color) {
        this.costo = costo;
        this.tipo = tipo;
        this.color = color;
    }

//gets and sets de la clase
    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
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
