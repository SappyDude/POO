package com.mycompany.alquiler;

public class Alquiler {

    private Vehiculo vehiculo;
    private Conductor conductor;
    private int diasAlquiler;
    private float montoAlquiler;

    public Alquiler(Vehiculo vehiculo, Conductor conductor, int diasAlquiler) {
        this.vehiculo = vehiculo;
        this.conductor = conductor;
        this.diasAlquiler = diasAlquiler;
        this.montoAlquiler = 0;
    }

    public Alquiler() {
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
    }

    public int getDiasAlquiler() {
        return diasAlquiler;
    }

    public void setDiasAlquiler(int diasAlquiler) {
        this.diasAlquiler = diasAlquiler;
    }

    public float getMontoAlquiler() {
        return montoAlquiler;
    }

    public void setMontoAlquiler(float montoAlquiler) {
        this.montoAlquiler = montoAlquiler;
    }

    public void calcularCostoAlquiler() {
        montoAlquiler = vehiculo.getCostoAlquiler() * diasAlquiler;
    }

    public void mostrarDetallesAlquiler() {
        System.out.println("Detalles del alquiler");
        vehiculo.mostrarDetalles();
        conductor.mostrarDetallesConductor();
        System.out.println(" ");
    }
}
