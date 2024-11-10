package BibliotecaParcial;

import java.util.ArrayList;

/**
 *
 * @author dhysty
 */
public class Usuario {

    private String nombre;
    ArrayList<Libro> pedidos = new ArrayList<>();

    public Usuario(String nombre) {
        this.nombre = nombre;
    }

    public Usuario() {
        nombre = "";
    }
}
