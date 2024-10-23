package com.mycompany.alquiler;

public class Motor {

    private int potencia, numeroCilindros;
    private String tipoCombustible;

    public Motor() {
        potencia = 0;
        numeroCilindros = 0;
        tipoCombustible = "";
    }

    public Motor(int potencia, int numeroCilindros, String tipoCombustible) {
        this.potencia = potencia;
        this.numeroCilindros = numeroCilindros;
        this.tipoCombustible = tipoCombustible;
    }

    public void mostrarDetallesMotor() {
        System.out.println("Motor (" + "potencia= " + potencia + ", numeroCilindros= " + numeroCilindros + ", tipoCombustible= " + tipoCombustible + '}');  
    }

    
}
