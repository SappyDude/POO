package com.mycompany.persona;

public class Persona {
    
    //Atributos
    private String nombre;
    private int edad;
    
    //Constructor
    public Persona (String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    //get and set
    public String getNombre (){
        return nombre;
    }
    
    public void setNombre(String nombre){
    this.nombre = nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //override: reescribir
    @Override
    public String toString() {
        return "Persona{" + "nombre = " + nombre + ", edad = " + edad + '}';
    }
    
    
}
