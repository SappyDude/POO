package com.mycompany.floristeria;

public class Flor {

    private int costo, cantidad;
    private String tipo;

    public Flor() {
        costo = 0;
        cantidad = 0;
        tipo = "";
    }

    public Flor(int costo, int cantidad, String tipo) {
        this.costo = costo;
        this.cantidad = cantidad;
        this.tipo = tipo;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
