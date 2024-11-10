package BibliotecaParcial;

public class Libro {

//Atributos
    protected String titulo;
    protected String autor;
    protected int numPaginas;
    protected int cantidadCopias;
    protected int cantidadDisponible;

//Constructor parametrizado
    public Libro(String titulo, String autor, int numPaginas, int cantidadCopias) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.cantidadCopias = cantidadCopias;
        this.cantidadDisponible = cantidadCopias;
    }

//Constructor vacio
    public Libro() {
        titulo = "";
        autor = "";
        numPaginas = 0;

    }

//Gets and Sets 
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public int getCantidadCopias() {
        return cantidadCopias;
    }

    public void setCantidadCopias(int cantidadCopias) {
        this.cantidadCopias = cantidadCopias;
    }

    public int getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(int cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    /*  Estos metodos adheridos abajo, son solo contadores que modifican la cantidad de libros que hay disponible
     */
    public void sumarlibro() {
        cantidadCopias += 1;
    }

    public void restarlibro() {
        cantidadCopias -= 1;
    }

    public int cantidadTotal() {
        return cantidadCopias;
    }

//Metodos 
    public void imprimirInformacion() {
        System.out.println("  Titulo: " + titulo);
        System.out.println("  Autor: " + autor);
        System.out.println("  Numero de paginas: " + numPaginas);
        System.out.println("Copias disponibles: " + cantidadCopias);
    }
}
