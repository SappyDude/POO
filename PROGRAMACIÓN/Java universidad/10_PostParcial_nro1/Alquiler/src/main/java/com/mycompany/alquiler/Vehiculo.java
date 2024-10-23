package com.mycompany.alquiler;

public class Vehiculo {

    protected String marca, modelo, placa;
    protected int anioFabricacion;
    protected boolean estadoDisponibilidad;
    protected float costoAlquiler;
    protected Motor motor;

    public Vehiculo() {
        marca = "";
        modelo = "";
        placa = "";
        anioFabricacion = 0;
        estadoDisponibilidad = true;
        costoAlquiler = 0;
        motor = null;
    }

    public Vehiculo(String marca, String modelo, String placa, int anioFabricacion, float costoAlquiler, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.anioFabricacion = anioFabricacion;
        this.costoAlquiler = costoAlquiler;
        this.motor = motor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public boolean isEstadoDisponibilidad() {
        return estadoDisponibilidad;
    }

    public void setEstadoDisponibilidad(boolean estadoDisponibilidad) {
        this.estadoDisponibilidad = estadoDisponibilidad;
    }

    public float getCostoAlquiler() {
        return costoAlquiler;
    }

    public void setCostoAlquiler(float costoAlquiler) {
        this.costoAlquiler = costoAlquiler;
    }

    public void alquilar() {
        if (estadoDisponibilidad == true) {
            estadoDisponibilidad = false;
            System.out.println("Vehiculo alquilado");
        } else {
            System.out.println("Vehiculo no disponible");
        }
    }

    public void devolver() {
        estadoDisponibilidad = true;
        System.out.println("Vehiculo devuelto");
    }
    
    public void mostrarDetalles() {
        System.out.println("Vehiculo: " +  marca + " " + modelo);
        System.out.println("anio: " + anioFabricacion);
    }

    
}
