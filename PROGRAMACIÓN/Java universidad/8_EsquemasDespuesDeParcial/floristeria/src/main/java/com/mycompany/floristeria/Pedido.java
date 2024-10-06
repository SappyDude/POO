package com.mycompany.floristeria;

import java.util.Random;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pedido {

//Atributos
    private String fecha;
    private int idPedido;
    private Arreglo arreglo;

//(debido a que la fecha y el idPedido son atributos que realmente no requieren valor de entrada, no es tan util tener un constructor vacio)
//Constructor parametrizado
    public Pedido(Arreglo arreglo) {
        this.fecha = fechaActual();
        this.idPedido = generarNuevoId();
        this.arreglo = arreglo;
    }

//Gets and sets de la clase
    public String getFecha() {
        return fecha;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public Arreglo getArreglo() {
        return arreglo;
    }

    //Métodos de la clase
//Funcionalidad de java para crear un numero random  
    public int generarNuevoId() {
        Random random = new Random();
        return random.nextInt(1000000);
    }

//Funcionalidad para establecer una fecha en el pedido del cliente
    public String fechaActual() {
        LocalDate fechaActual = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaFormateada = fechaActual.format(formato);
        return fechaFormateada;
    }
}
