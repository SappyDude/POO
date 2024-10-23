package com.mycompany.alquiler;

public class Auto extends Vehiculo {

    public String tipoTransmision;
    public int numeroPuertas;

    public Auto(String tipoTransmision, int numeroPuertas, String marca, String modelo, String placa, int anioFabricacion, float costoAlquiler, Motor motor) {
        super(marca, modelo, placa, anioFabricacion, costoAlquiler, motor);
        this.tipoTransmision = tipoTransmision;
        this.numeroPuertas = numeroPuertas;
    }

    public String getTipoTransmision() {
        return tipoTransmision;
    }

    public void setTipoTransmision(String tipoTransmision) {
        this.tipoTransmision = tipoTransmision;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Auto: " + marca + " " + modelo +
                " - Transmision: " + tipoTransmision +
                " - Puertas: " + numeroPuertas);
    }

}
