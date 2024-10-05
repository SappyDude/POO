package com.mycompany.floristeria;

import java.util.ArrayList;

public class Cliente {
//atributos

    private int idCliente;
    private String nombreUsuario, direccion, correo;
    private ArrayList<Pedido> pedidosCliente;

//constructor vacio
    public Cliente() {
        idCliente = 0;
        nombreUsuario = "";
        direccion = "";
        correo = "";
        pedidosCliente = new ArrayList<Pedido>();
    }
//contructor con parametros

    public Cliente(int idCliente, String nombreUsuario, String direccion, String correo) {
        this.idCliente = idCliente;
        this.nombreUsuario = nombreUsuario;
        this.direccion = direccion;
        this.correo = correo;
        this.pedidosCliente = new ArrayList<Pedido>();
    }

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

    public ArrayList<Pedido> getPedido() {
        return pedidosCliente;
    }

    public void agregarPedidos(Pedido pedidos) {
        pedidosCliente.add(pedidos);
    }

    public void mostrarPedidos(ArrayList<Arreglo> arreglos) {
        for (int i = 0; i < pedidosCliente.size(); i++) {

            System.out.println("Numero de su pedido:   " + pedidosCliente.get(i).getNroPedido());
            System.out.println("Fecha de su pedido:    " + pedidosCliente.get(i).getFecha());
            System.out.println("Id de su pedido:       " + pedidosCliente.get(i).getIdPedido());
            System.out.println("Nombre del usuario:    " + nombreUsuario);
            System.out.println("Id del usuario:        " + idCliente);
            System.out.println("Direccion del usuario: " + direccion);
            System.out.println("Correo del usuario:    " + correo);
            System.out.println("                       ");
        }
    }

}
