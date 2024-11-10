package BibliotecaParcial;

import java.util.ArrayList;

/**
 * @author Dhylan Styven Collazos, Gissel Daniela Cordoba
 * @brief Es una biblioteca que alberga distintos tipos de libros, dependiendo
 * de lo que el usuario desee ver se hará su respectivo método
 * @link
 */
public class BibliotecaParcial {

    public static void main(String[] args) {

//Adición de la información de los tipos de libro
        Biblioteca biblioteca = new Biblioteca();

//Novelas
        Libro n1 = new Novela("Ficcion distopica", "Resumen", "1984", "George Orwell", 328, 5);
        Libro n2 = new Novela("Ciencia ficcion", "Resumen", "Dune", "Frank Herbert", 688, 5);
        Libro n3 = new Novela("Fantasia", "Resumen", "The Hobbit", "J.R.R. Tolkien", 310, 5);
        Libro n4 = new Novela("Misterio policiaco", "Resumen", "The Girl with the Dragon Tattoo", "Stieg Larsson", 672, 5);
        Libro n5 = new Novela("Ficcion distopica", "Resumen", "1984", "George Orwell", 328, 5);
        Libro n6 = new Novela("Realismo Magico", "Resumen", "Cien anios de soledad", "Gabriel Garcia Marquez", 417, 5);

//Libros de referencia
        Libro Lr1 = new LibroDeReferencia("Lengua espanola", "Diccionario de la Real Academia Espanola", "Real Academia Espanola", 2376, 5);
        Libro Lr2 = new LibroDeReferencia("Conocimiento general", "Enciclopedia Britanica", "Varios autores", 1200, 5);
        Libro Lr3 = new LibroDeReferencia("Geografia", "Atlas Mundial", "National Geographic Society", 400, 5);
        Libro Lr4 = new LibroDeReferencia("Medicina", "Manual Merck de diagnostico y tratamiento", "Merck & Co", 3500, 5);
        Libro Lr5 = new LibroDeReferencia("Estilo y formato academico", "Guia de estilo de la APA", "American Psychological Association (APA)", 428, 5);

//libros de texto
        Libro Lt1 = new LibroDeTexto("Matematicas", "Ejercicio 1", "Calculo: Trascendentes tempranas", "James Stewart", 1376, 5);
        Libro Lt2 = new LibroDeTexto("Fisica", "Ejercicio 2", "Fundamentos de Fisica", "David Halliday, Robert Resnick, Jearl Walker", 1232, 5);
        Libro Lt3 = new LibroDeTexto("Biologia", "Ejercicio 3", "Biologia basica", "Neil A. Campbell, Jane B. Reece", 1464, 5);
        Libro Lt4 = new LibroDeTexto("Quimica", "Ejercicio 4", "Quimica General", "Raymond Chang", 1056, 5);

//Audio libros        
        Libro aL1 = new audioLibro("Camilo Daza", 150, "Saber volar", "James Stewart", 1376, 5);
        Libro aL2 = new audioLibro("Juliana Cortez", 240, "Si, si es contigo", "Daniela Calle y Maria Jose Garzon", 376, 5);
        Libro aL3 = new audioLibro("Carlos Collazos", 1330, "Rayuela", "Julio Cortazar", 6326, 5);

//Agregamos 
        biblioteca.agregarLibro(n1);
        biblioteca.agregarLibro(n2);
        biblioteca.agregarLibro(n3);
        biblioteca.agregarLibro(n4);
        biblioteca.agregarLibro(n5);
        biblioteca.agregarLibro(n6);
        biblioteca.agregarLibro(Lr1);
        biblioteca.agregarLibro(Lr2);
        biblioteca.agregarLibro(Lr3);
        biblioteca.agregarLibro(Lr4);
        biblioteca.agregarLibro(Lr5);
        biblioteca.agregarLibro(Lt1);
        biblioteca.agregarLibro(Lt2);
        biblioteca.agregarLibro(Lt3);
        biblioteca.agregarLibro(Lt4);
        biblioteca.agregarLibro(aL1);
        biblioteca.agregarLibro(aL2);
        biblioteca.agregarLibro(aL3);

//El usuario no tiene utilidad en el momento de esta funcion
//debido a que solo estamos restando la cantidad de x libro, solo para demostrar la funcionalidad de la logica
        Usuario u1 = new Usuario();

//aqui se simula que el usuario ha pedido n libro        
        n1.restarlibro();

        n2.restarlibro();
        n2.restarlibro();

//Se imprimen todos los libros de la biblioteca
        biblioteca.imprimirNovelas();
//Se imprimen todas las novelas que hay en la bilioteca
        biblioteca.mostrarLibros();
        biblioteca.libroPopular();
    }

}
//Pregunta1: Se añadió la clase audiolibro con sus atributos 
//Pregunta2: Se utiliza el método libroPopular en la clase biblioteca
//Pregunta3: se añaden tres métodos en la clase Libro que suma o resta un libro que tome el usuario
//Pregunta4: Los métodos que antes estaban en el main, pasan a la clase Biblioteca y se llaman al main para su uso
