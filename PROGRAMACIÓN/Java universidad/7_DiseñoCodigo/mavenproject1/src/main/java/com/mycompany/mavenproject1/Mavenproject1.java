package com.mycompany.mavenproject1;

public class Mavenproject1 {

    public static void main(String[] args) {
        Carro c1 = new Carro();
        c1.setColor("rojo");
        c1.setModelo("2010");
        c1.setMarca("Nissan");
        c1.setPrecio((float) 20.5);
        c1.setVelocidad(1);
        float resultado = c1.acelerar();
        System.out.println(resultado);
    }
}
