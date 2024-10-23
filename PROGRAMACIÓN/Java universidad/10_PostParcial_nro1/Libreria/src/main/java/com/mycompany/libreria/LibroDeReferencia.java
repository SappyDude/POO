package com.mycompany.libreria;

/**
 *
 * @author dhysty
 */
public class LibroDeReferencia extends Libro {

    private String areaConocimiento;

    public LibroDeReferencia(String areaConocimiento, String titulo, String autor, int numPaginas) {
        super(titulo, autor, numPaginas);
        this.areaConocimiento = areaConocimiento;
    }

    public LibroDeReferencia() {
        areaConocimiento = "";
    }

    public String getAreaConocimiento() {
        return areaConocimiento;
    }

    public void setAreaConocimiento(String areaConocimiento) {
        this.areaConocimiento = areaConocimiento;
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
        System.out.println("Area de conocimiento " + areaConocimiento);
    }

}
