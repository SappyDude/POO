package BibliotecaParcial;

public class LibroDeTexto extends Libro {

//Atributos
    private String temaPrincipal;
    private String ejercicio;

//Constructor parametrizado
    public LibroDeTexto(String temaPrincipal, String ejercicio, String titulo, String autor, int numPaginas) {
        super(titulo, autor, numPaginas);
        this.temaPrincipal = temaPrincipal;
        this.ejercicio = ejercicio;
    }
    
//Constructor vacio
    public LibroDeTexto() {
        super();
        temaPrincipal = "";
        ejercicio = "";
    }
    
//Gets and Sets
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
        System.out.println("  Teme principal: " + temaPrincipal);
        System.out.println("  Ejercicio: " + ejercicio);
    }
    
    
}
