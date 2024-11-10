package BibliotecaParcial;

/*
Esta clase es una extensión de la clase padre "Libro", y tiene atributos propios como: área de conocimiento
 */

public class LibroDeReferencia extends Libro {

//Atributos
    private String areaConocimiento;

//Constructor parametrizado
    public LibroDeReferencia(String areaConocimiento, String titulo, String autor, int numPaginas, int cantidadCopias) {
        super(titulo, autor, numPaginas, cantidadCopias);
        this.areaConocimiento = areaConocimiento;
    }

//Constructor vacio
    public LibroDeReferencia() {
        super();
        areaConocimiento = "";
    }

//Gets and Sets    
    public String getAreaConocimiento() {
        return areaConocimiento;
    }

    public void setAreaConocimiento(String areaConocimiento) {
        this.areaConocimiento = areaConocimiento;
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
        System.out.println("  Area de conocimiento: " + areaConocimiento);
    }
}
