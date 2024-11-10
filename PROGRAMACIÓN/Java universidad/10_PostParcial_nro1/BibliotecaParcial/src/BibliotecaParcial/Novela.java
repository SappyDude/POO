package BibliotecaParcial;

/*
Esta clasa es una extensión de la clase padre "Libro", y tiene atributos propios como: Género y Resumen 
 */

public class Novela extends Libro {

//Atributos
    private String genero;
    private String resumen;

//Constructor parametrizado
    public Novela(String genero, String resumen, String titulo, String autor, int numPaginas, int cantidadCopias) {
        super(titulo, autor, numPaginas, cantidadCopias);
        this.genero = genero;
        this.resumen = resumen;
    }

//Constructor sin parametros
    public Novela() {
        super();
        genero = "";
        resumen = "";
    }

//Gets and Sets
    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
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

//Metodo de esta clase con parte de la superclase
    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("  Genero: " + genero);
        System.out.println("  Resumen: " + resumen);
    }
}
