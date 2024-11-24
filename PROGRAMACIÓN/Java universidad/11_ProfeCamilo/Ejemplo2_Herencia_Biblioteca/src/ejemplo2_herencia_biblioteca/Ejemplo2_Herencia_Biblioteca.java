package ejemplo2_herencia_biblioteca;

import java.util.ArrayList;

/**
 * @author
 * Juan Carlos Narvaez
 * @brief
 * Este ejemplo representa la implementación del segundo ejemplo de herencia
 * donde se describe el funcionamiento de una biblioteca
 * @link
 * Coloca el link del enunciado y del diagrama de clases
 */
public class Ejemplo2_Herencia_Biblioteca {

    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Libro> misLibros = new ArrayList<>();
        misLibros.add(new Novela("Ficcion distopica", "Resumen", "1984", "George Orwell", 328));
        misLibros.add(new Novela("Ciencia ficcion", "Resumen", "Dune", "Frank Herbert", 688));
        misLibros.add(new Novela("Fantasia", "Resumen", "The Hobbit", "J.R.R. Tolkien", 310));
        misLibros.add(new Novela("Misterio policiaco", "Resumen", "The Girl with the Dragon Tattoo", "Stieg Larsson", 672));
        misLibros.add(new Novela("Realismo Magico", "Resumen", "Cien anios de soledad", "Gabriel Garcia Marquez", 417));
        
        misLibros.add(new LibroDeReferencia("Diccionario de la Real Academia Espanola", "Real Academia Espanola", 2376, "Lengua espanola"));
        misLibros.add(new LibroDeReferencia("Enciclopedia Britanica", "Varios autores", 1200, "Conocimiento general"));
        misLibros.add(new LibroDeReferencia("Atlas Mundial", "National Geographic Society", 400, "Geografia"));
        misLibros.add(new LibroDeReferencia("Manual Merck de diagnostico y tratamiento", "Merck & Co", 3500, "Medicina"));
        misLibros.add(new LibroDeReferencia("Guia de estilo de la APA", "American Psychological Association (APA)", 428, "Estilo y formato academico"));
        
        misLibros.add(new LibroDeTexto("Matematicas", "Ejercicio 1", "Calculo: Trascendentes tempranas", "James Stewart", 1376));
        misLibros.add(new LibroDeTexto("Fisica", "Ejercicio 2", "Fundamentos de Fisica", "David Halliday, Robert Resnick, Jearl Walker", 1232));
        misLibros.add(new LibroDeTexto("Biologia", "Ejercicio 3", "Biologia basica", "Neil A. Campbell, Jane B. Reece", 1464));
        misLibros.add(new LibroDeTexto("Quimica", "Ejercicio 4", "Quimica General", "Raymond Chang", 1056));
        
        //Se imprimen todos los libros de la biblioteca
        mostrarLibros(misLibros);
        //Se imprimen todas las novelas que hay en la bilioteca
        imprimiNovelas(misLibros);
    }
    
    public static void mostrarLibros(ArrayList<Libro> misLibros) {
        System.out.println("--- DATOS DE LOS LIBROS ---");
        // Recorrer la lista y mostrar la información de cada libro
        for(Libro libro : misLibros) {
            libro.imprimirInformacion();
            System.out.println();
        }
    }
    
    public static void imprimiNovelas(ArrayList<Libro> misLibros) {
        System.out.println("--- DATOS DE LAS NOVELAS ---");
        // Recorrer la lista y mostrar la información de cada libro
        for(int i=0; i<misLibros.size(); i++) {
            Libro unLibro = misLibros.get(i);
            if(unLibro instanceof Novela) {
                unLibro.imprimirInformacion();
                System.out.print("\n");
            }
        }
    }
    
}
