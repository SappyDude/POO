
package ejemplo2_herencia_biblioteca;

public class LibroDeTexto extends Libro {
    private String temaPrincipal;
    private String ejercicio;

    public LibroDeTexto(String temaPrincipal, String ejercicio, String titulo, String autor, int numPaginas) {
        super(titulo, autor, numPaginas);
        this.temaPrincipal = temaPrincipal;
        this.ejercicio = ejercicio;
    }

    public LibroDeTexto() {
        super();
        temaPrincipal = "";
        ejercicio = "";
    }

    public String getTemaPrincipal() {
        return temaPrincipal;
    }

    public void setTemaPrincipal(String temaPrincipal) {
        this.temaPrincipal = temaPrincipal;
    }

    public String getEjercicio() {
        return ejercicio;
    }

    public void setEjercicio(String ejercicio) {
        this.ejercicio = ejercicio;
    }

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
    
    @Override
    public void imprimirInformacion() {
        super.imprimirInformacion();
        System.out.println("  Teme principal: " + temaPrincipal);
        System.out.println("  Ejercicio: " + ejercicio);
    }
    
    
}
