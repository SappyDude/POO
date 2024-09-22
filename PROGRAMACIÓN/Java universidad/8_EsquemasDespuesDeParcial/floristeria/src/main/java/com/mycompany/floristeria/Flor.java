package com.mycompany.floristeria;

public class Flor {

    private int costo;
    private String tipo;

    public Flor() {
        costo = 0;
        tipo = "";
    }

    public Flor(int costo, String tipo) {
        this.costo = costo;
        this.tipo = tipo;
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

}
