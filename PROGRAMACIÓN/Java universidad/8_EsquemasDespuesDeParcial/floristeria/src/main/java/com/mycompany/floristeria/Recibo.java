package com.mycompany.floristeria;

import java.util.Random;
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

    public Recibo() {
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
    
    public int modifyIdRecibo() {
        return IdRecibo = randomNumber(6);
    }
//Funcionalidad de java para crear un numero random de n cifras 
    public int randomNumber(int n) {
        Random random = new Random();
        int min = (int) Math.pow(10, n - 1);  // Número mínimo con n cifras (por ejemplo, 100000 para 6 cifras)
        int max = (int) Math.pow(10, n) - 1;  // Número máximo con n cifras (por ejemplo, 999999 para 6 cifras)
        return random.nextInt(max - min + 1) + min;
    }

}
