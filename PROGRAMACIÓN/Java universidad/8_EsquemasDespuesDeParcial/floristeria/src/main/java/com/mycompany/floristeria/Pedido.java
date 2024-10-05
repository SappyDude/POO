package com.mycompany.floristeria;

import java.util.Random;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pedido {
//Atributos

    private String fecha;
    private int idPedido;
    private int nroPedido;

//Constructor sin parametros
    public Pedido() {
        fecha = "";
        idPedido = 0;
        nroPedido = 0;
    }

//Constructor parametrizado
    public Pedido(String fecha, int idPedido, int nroPedido) {
        this.fecha = fecha;
        this.idPedido = idPedido;
        this.nroPedido = nroPedido;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public int getNroPedido() {
        return nroPedido;
    }

    public void setNroPedido(int nroPedido) {
        this.nroPedido = nroPedido;
    }

    public int modifyIdPedido() {
        return idPedido = randomNumber(6);
    }
//Funcionalidad de java para crear un numero random de n cifras 

    public int randomNumber(int n) {
        Random random = new Random();
        int min = (int) Math.pow(10, n - 1);  // Número mínimo con n cifras (por ejemplo, 100000 para 6 cifras)
        int max = (int) Math.pow(10, n) - 1;  // Número máximo con n cifras (por ejemplo, 999999 para 6 cifras)
        return random.nextInt(max - min + 1) + min;
    }
//Funcionalidad para establecer una fecha en el pedido del cliente

    public String fechaActual() {
        LocalDate fechaActual = LocalDate.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaFormateada = fechaActual.format(formato);
        return fechaFormateada;
    }
}
