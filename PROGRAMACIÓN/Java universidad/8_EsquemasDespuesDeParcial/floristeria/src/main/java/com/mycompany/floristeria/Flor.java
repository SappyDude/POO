package com.mycompany.floristeria;

public class Flor {

    private int costo;
    private String tipo, color;

    public Flor() {
        costo = 0;
        tipo = "";
        color = "";
    }

    public Flor(int costo, String tipo, String color) {
        this.costo = costo;
        this.tipo = tipo;
        this.color = color;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
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
