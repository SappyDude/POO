import java.util.Scanner;

public class Usuario {

    Scanner scn = new Scanner(System.in);
    
    //Variables
    private String nombre, direccion, telefono, contraseña;
    private Cuenta cuenta;

    //Constructor sin y con atributos
    public Usuario() {
        nombre = "";
        direccion = "";
        telefono = "";
    }

    public Usuario(String nombre, String direccion, String telefono, String contraseña, Cuenta cuenta) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.contraseña = contraseña;
        this.cuenta = cuenta;
    }

    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }

}
