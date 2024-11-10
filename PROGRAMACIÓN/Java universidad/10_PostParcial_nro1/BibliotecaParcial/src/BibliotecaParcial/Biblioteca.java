package BibliotecaParcial;

import java.util.ArrayList;

/**
 * @author dhysty
 */
public class Biblioteca {

//Atributos
    private ArrayList<Libro> libros;

//Constructor vacio
    public Biblioteca() {
        libros = new ArrayList<>();
    }

//no es necesario el constructor parametrizado porque se vuelve una lista estatica
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

//Metodos    
    public void imprimirNovelas() {
        System.out.println("--- DATOS DE LAS NOVELAS ---");
        // Recorrer la lista y mostrar la información de cada libro
        for (int i = 0; i < libros.size(); i++) {
            Libro unLibro = libros.get(i);
            if (unLibro instanceof Novela) {
                unLibro.imprimirInformacion();
                System.out.print("\n");
            }
        }
    }
//Este muestra la lista de libros disponibles

    public void mostrarLibros() {
        System.out.println("--- DATOS DE LOS LIBROS ---");
        // Recorrer la lista y mostrar la información de cada libro
        for (Libro libro : libros) {
            libro.imprimirInformacion();
            System.out.println();
        }
    }

    public void disponibilidadCopias() {
        int cantidadCopias = 0;
        for (int i = 0; i < libros.size(); i++) {
            int copias = libros.get(i).getCantidadCopias();
            cantidadCopias = copias - 1;
            System.out.println("Para el libro" + libros.get(i).getTitulo() + "La cantidad de copias disponibles son: " + cantidadCopias);
        }
    }
//Compara dos atributos del libro elegido, la cantidad total que hay en la biblioteca con la cantidad disponible
//Una vez los compara, entra al if y modifica los valores libroTotalPedido y LibroTemp
//Luego, imprimimos la informacion

    public void libroPopular() {
        int libroTotalPedido = 0;
        Libro libroTemp = null;
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getCantidadDisponible() - libros.get(i).getCantidadCopias() >= libroTotalPedido) {
                libroTemp = libros.get(i);
                libroTotalPedido = libros.get(i).getCantidadDisponible() - libros.get(i).getCantidadCopias();
            }
        }
        System.out.println("El libro mas popular es :");
        libroTemp.imprimirInformacion();
        System.out.println("Cantidad pedida: " + libroTotalPedido);
    }
}
