package BibliotecaParcial;

import java.util.ArrayList;

/**
 * @author Dhylan Styven Collazos
 * @brief Es una biblioteca que alberga distintos tipos de libros, dependiendo
 * de lo que el usuario desee ver se hará su respectivo método
 * @link
 */
public class BibliotecaParcial {

    public static void main(String[] args) {

//Adición de la información de los tipos de libro
        ArrayList<Libro> misLibros = new ArrayList<>();

//Novelas
        misLibros.add(new Novela("Ficcion distopica", "Resumen", "1984", "George Orwell", 328));
        misLibros.add(new Novela("Ciencia ficcion", "Resumen", "Dune", "Frank Herbert", 688));
        misLibros.add(new Novela("Fantasia", "Resumen", "The Hobbit", "J.R.R. Tolkien", 310));
        misLibros.add(new Novela("Misterio policiaco", "Resumen", "The Girl with the Dragon Tattoo", "Stieg Larsson", 672));
        misLibros.add(new Novela("Realismo Magico", "Resumen", "Cien anios de soledad", "Gabriel Garcia Marquez", 417));

//Libros de referencia
        misLibros.add(new LibroDeReferencia("Diccionario de la Real Academia Espanola", "Real Academia Espanola", 2376, "Lengua espanola"));
        misLibros.add(new LibroDeReferencia("Enciclopedia Britanica", "Varios autores", 1200, "Conocimiento general"));
        misLibros.add(new LibroDeReferencia("Atlas Mundial", "National Geographic Society", 400, "Geografia"));
        misLibros.add(new LibroDeReferencia("Manual Merck de diagnostico y tratamiento", "Merck & Co", 3500, "Medicina"));
        misLibros.add(new LibroDeReferencia("Guia de estilo de la APA", "American Psychological Association (APA)", 428, "Estilo y formato academico"));

//libros de texto
        misLibros.add(new LibroDeTexto("Matematicas", "Ejercicio 1", "Calculo: Trascendentes tempranas", "James Stewart", 1376));
        misLibros.add(new LibroDeTexto("Fisica", "Ejercicio 2", "Fundamentos de Fisica", "David Halliday, Robert Resnick, Jearl Walker", 1232));
        misLibros.add(new LibroDeTexto("Biologia", "Ejercicio 3", "Biologia basica", "Neil A. Campbell, Jane B. Reece", 1464));
        misLibros.add(new LibroDeTexto("Quimica", "Ejercicio 4", "Quimica General", "Raymond Chang", 1056));

//Se imprimen todos los libros de la biblioteca
        mostrarLibros(misLibros);

//Se imprimen todas las novelas que hay en la bilioteca
        imprimirNovelas(misLibros);
    }

//metodo que muestra los libros existentes 
    public static void mostrarLibros(ArrayList<Libro> misLibros) {
        System.out.println("--- DATOS DE LOS LIBROS ---");
        // Recorrer la lista y mostrar la información de cada libro
        for (Libro libro : misLibros) {
            libro.imprimirInformacion();
            System.out.println();
        }
    }

//muestra cierto tipo de libro derivado de una clase en especial con la funcion instanceof
    public static void imprimirNovelas(ArrayList<Libro> misLibros) {
        System.out.println("--- DATOS DE LAS NOVELAS ---");
        // Recorrer la lista y mostrar la información de cada libro
        for (int i = 0; i < misLibros.size(); i++) {
            Libro unLibro = misLibros.get(i);
            if (unLibro instanceof Novela) {
                unLibro.imprimirInformacion();
                System.out.print("\n");
            }
        }
    }
}
