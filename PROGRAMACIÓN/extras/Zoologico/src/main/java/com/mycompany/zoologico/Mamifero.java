/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zoologico;

/**
 *
 * @author SappyDude
 */
public class Mamifero extends Animal {

    private boolean tienePelaje;
    private float temperaturaCorporal;
    private boolean esNocturno;

    public Mamifero() {
    }

    public Mamifero(boolean tienePelaje, float temperaturaCorporal, boolean esNocturno, String nombreCientifico, int edad, float peso, boolean esPeligroso, String habitatNatural, String dieta) {
        super(nombreCientifico, edad, peso, esPeligroso, habitatNatural, dieta);
        this.tienePelaje = tienePelaje;
        this.temperaturaCorporal = temperaturaCorporal;
        this.esNocturno = esNocturno;
    }

    public boolean isTienePelaje() {
        return tienePelaje;
    }

    public void setTienePelaje(boolean tienePelaje) {
        this.tienePelaje = tienePelaje;
    }

    public float getTemperaturaCorporal() {
        return temperaturaCorporal;
    }

    public void setTemperaturaCorporal(float temperaturaCorporal) {
        this.temperaturaCorporal = temperaturaCorporal;
    }

    public boolean isEsNocturno() {
        return esNocturno;
    }

    public void setEsNocturno(boolean esNocturno) {
        this.esNocturno = esNocturno;
    }

    @Override
    public void comer() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
