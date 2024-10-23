package com.mycompany.alquiler;

public class Conductor {

    private String nombre, licenciaConduccion;
    private int experienciaAnios;

    public Conductor(String nombre, String licenciaConduccion, int experienciaAnios) {
        this.nombre = nombre;
        this.licenciaConduccion = licenciaConduccion;
        this.experienciaAnios = experienciaAnios;
    }

    public Conductor() {
        nombre = "";
        licenciaConduccion = "";
        experienciaAnios = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLicenciaConduccion() {
        return licenciaConduccion;
    }

    public void setLicenciaConduccion(String licenciaConduccion) {
        this.licenciaConduccion = licenciaConduccion;
    }

    public int getExperienciaAnios() {
        return experienciaAnios;
    }

    public void setExperienciaAnios(int experienciaAnios) {
        this.experienciaAnios = experienciaAnios;
    }

    public void mostrarDetallesConductor() {
        System.out.println("nombre:" + nombre);
        System.out.println("licencia de conduccion: " + licenciaConduccion);
        System.out.println("anios de experiencia: " + experienciaAnios);
    }

}
