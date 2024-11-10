package BibliotecaParcial;

/*
Esta clase es una extensión de la clase padre "Libro", y tiene atributos propios como: nombre del narrador y la duracion.
 */

public class audioLibro extends Libro {
//Atributos

    private String nombreNarrador;
    private int minutos;

//Constructor vacio
    public audioLibro() {
        super();
        nombreNarrador = "";
        minutos = 0;
    }

//Constructor parametrizado    
    public audioLibro(String nombreNarrador, int minutos, String titulo, String autor, int numPaginas, int cantidadCopias) {
        super(titulo, autor, numPaginas, cantidadCopias);
        this.nombreNarrador = nombreNarrador;
        this.minutos = minutos;
    }

//Gets and Sets    
    public String getNombreNarrador() {
        return nombreNarrador;
    }

    public void setNombreNarrador(String nombreNarrador) {
        this.nombreNarrador = nombreNarrador;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

//Gets and Sets con Override    
    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public String getAutor() {
        return autor;
    }

    @Override
    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public int getNumPaginas() {
        return numPaginas;
    }

    @Override
    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

}
