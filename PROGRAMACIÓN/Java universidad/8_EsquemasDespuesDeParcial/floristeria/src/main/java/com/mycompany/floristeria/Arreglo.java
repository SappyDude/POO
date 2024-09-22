package com.mycompany.floristeria;

import java.util.ArrayList;

public class Arreglo {

    private ArrayList<Flor> arreglos;
    private String maceta;

    public Arreglo() {
        maceta = "";
        arreglos = new ArrayList<Flor>();
    }

    public Arreglo(String maceta) {
        this.maceta = maceta;
        this.arreglos = new ArrayList<Flor>();
    }

    public String getMaceta() {
        return maceta;
    }

    public void setMaceta(String maceta) {
        this.maceta = maceta;
    }

    public ArrayList<Flor> avableArreglos() {
        return arreglos;
    }

    public void addArreglo(Flor arreglo1) {
        arreglos.add(arreglo1);
    }

}
