package com.mycompany.libreria;

public class Libro {

    protected String titulo, autor;
    protected int numPaginas;

    public Libro() {
    
    }

    public Libro(String titulo, String autor, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

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

    public void imprimirInformacion() {
        System.out.println(" Titulo: " + titulo);
        System.out.println(" Autor:  " + autor);
        System.out.println(" Numero de paginas: " + numPaginas);
    }

}
