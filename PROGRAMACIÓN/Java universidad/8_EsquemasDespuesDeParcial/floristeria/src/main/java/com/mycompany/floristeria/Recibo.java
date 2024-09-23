package com.mycompany.floristeria;

import java.util.ArrayList;

public class Recibo {
//Atributos

    private String fecha;
    private int IdRecibo;
    private int nroRecibo;
//Constructor parametrizado

    public Recibo(String fecha, int IdRecibo, int nroRecibo) {
        this.fecha = fecha;
        this.IdRecibo = IdRecibo;
        this.nroRecibo = nroRecibo;
    }
//Constructor sin parametros

    private Recibo() {
        fecha = "";
        IdRecibo = 0;
        nroRecibo = 0;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getIdRecibo() {
        return IdRecibo;
    }

    public void setIdRecibo(int IdRecibo) {
        this.IdRecibo = IdRecibo;
    }

    public int getNroRecibo() {
        return nroRecibo;
    }

    public void setNroRecibo(int nroRecibo) {
        this.nroRecibo = nroRecibo;
    }

}
