package com.mycompany.floristeria;


public class Cliente {
//atributos
    private int idCliente;
    private String nombreUsuario, direccion, correo;
     
//contructor con parametros
    public Cliente(int idCliente, String nombreUsuario, String direccion, String correo) {
        this.idCliente = idCliente;
        this.nombreUsuario = nombreUsuario;
        this.direccion = direccion;
        this.correo = correo;
    }

//constructor vacio
    public Cliente() {
        idCliente = 0;
        nombreUsuario = "";
        direccion = "";
        correo = "";
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
}
