package com.unicauca.proyectocaja;

public class Caja {

    // atributos
    private int ancho, alto, profundo;

    // constructores
    public Caja() {
        this.ancho = 5;
        this.alto = 6;
        this.profundo = 2;
    }

    public Caja(int ancho, int alto, int profundo) {
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
    }
    
    // función que retorna un único valor 
public int volumen_caja (){
    int volumen_caja;
    volumen_caja = this.alto*this.ancho*this.profundo;
    return volumen_caja;
}



//falta esto de adelante



// método o procedimiento que no retorna nada porque es de tipo void 
public void propiedades_caja(){
    System.out.println("el volumen de la caja se calcula usando la formula ancho*alto* profundo");
    System.out.println("el ancho es :"+ this.ancho);
    System.out.println("el alto es :" + this.alto);
    System.out.println("la profundidad es :"+ this.profundo);
    System.out.println("el volumen de la caja es :"+volumen_caja());
}

// método para obtener el valor del atributo

    public int getAncho() {
        return this.ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return this.alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getProfundo() {
        return profundo;
    }

    public void setProfundo(int profundo) {
        this.profundo = profundo;
    }

}
