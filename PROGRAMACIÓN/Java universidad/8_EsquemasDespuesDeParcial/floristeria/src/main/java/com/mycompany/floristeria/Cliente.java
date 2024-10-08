package com.mycompany.floristeria;

import java.util.ArrayList;

public class Cliente {

//Atributos
    private int idCliente;
    private String nombreUsuario, direccion, correo;
    private ArrayList<Pedido> pedidosCliente;

//Constructor vacío
    public Cliente() {
        idCliente = 0;
        nombreUsuario = "";
        direccion = "";
        correo = "";
        pedidosCliente = new ArrayList<>();
    }

//Contructor parametrizado
    public Cliente(int idCliente, String nombreUsuario, String direccion, String correo) {
        this.idCliente = idCliente;
        this.nombreUsuario = nombreUsuario;
        this.direccion = direccion;
        this.correo = correo;
        this.pedidosCliente = new ArrayList<>();
    }

//Gets and sets de la clase
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidosCliente;
    }

    public void agregarPedido(Pedido pedido) {
        pedidosCliente.add(pedido);
    }

//Métodos
    public void mostrarPedidos() {
        System.out.println("Pedidos de: " + nombreUsuario);
        //Esta es la implementacion del for each(funciona parecido a un for, pero controla mejor la cantidad de iteraciones)
        for (Pedido pedido : pedidosCliente) {
            System.out.println(" - Pedido #" + pedido.getIdPedido() + " - Fecha: " + pedido.getFecha());
            pedido.getArreglo().mostrarFlores();
            System.out.println("   Total: " + pedido.getArreglo().calcularPrecio());
        }
    }

// Método para calcular total gastado por el cliente
    public float calcularTotalGastado() {
        float total = 0;
        for (Pedido pedido : pedidosCliente) {
            total += pedido.getArreglo().calcularPrecio();
        }
        return total;
    }

    public boolean tieneMultiplesPedidos() {
        return pedidosCliente.size() > 1;
    }
}
