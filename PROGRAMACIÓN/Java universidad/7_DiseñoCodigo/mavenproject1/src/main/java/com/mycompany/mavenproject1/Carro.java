package com.mycompany.mavenproject1;

public class Carro {

//atributos
    private String marca, modelo, color;
    private float precio, velocidad;

//constructor vacio
    public Carro() {
        this.marca = "";
        this.color = "";
        this.modelo = "";
        this.precio = 0;
        this.velocidad = 0;
    }

//constructor con parametros
    public Carro(String marca, String modelo, String color, float precio, float velocidad) {
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.precio = precio;
        this.velocidad = velocidad;
    }

//Gets and sets
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(float velocidad) {
        this.velocidad = velocidad;
    }

//metodos
    public float acelerar() {
        
        for (int i = 0; i < 100; i++) {
        velocidad += 1;
        }
       
        return this.velocidad;
    }

    public String frenar() {
        this.velocidad /= 2;
        return "";
    }

}
