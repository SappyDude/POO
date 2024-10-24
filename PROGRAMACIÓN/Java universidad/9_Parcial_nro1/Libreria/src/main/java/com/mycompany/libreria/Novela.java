package com.mycompany.libreria;

public class Novela extends Libro {

    private String genero, resumen;

    public Novela(String genero, String resumen, String titulo, String autor, int numPaginas) {
        super(titulo, autor, numPaginas);
        this.genero = genero;
        this.resumen = resumen;
    }

    public Novela() {
        super();
        genero = "";
        resumen = "";
    }

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
        System.out.println("Genero: " + genero);
        System.out.println("Resumen: " + resumen);
    }
}
