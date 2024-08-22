package com.mycompany._ejercicio;

public class Aritmetica {    
    //metodos(operaciones proporcionadas para poder hacer funciones distintas del tipo de dato creado)
    //public(puede accederse solo invocandolo), int(tipo de dato que retorna), "nombre"(nombre del metodo)

    public int suma(int nro1, int nro2) {
        return nro1 + nro2;
    } 
    
    public int resta(int nro1, int nro2) {
        return nro1 - nro2;
    } 
    
    public int multiplicacion(int nro1, int nro2) {
        return nro1 * nro2;
    }
    
    public String dividir(int nro1, int nro2) {
        
        if (nro2 == 0) {
            return "la division entre cero no es posible";
        } 
        else {
            return String.valueOf(nro1 / nro2);
        }   
    }
}
