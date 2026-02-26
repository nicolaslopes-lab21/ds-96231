package com.example.encapsulamento;

public class Livro {
    private String titulo;
    private String autor;
    private String numerodepaginas;
    private double preco;


    
    public Livro(String titulo, String autor, String numerodepaginas, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.numerodepaginas = numerodepaginas;
        this.preco = preco;
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
    public String getNumerodepaginas() {
        return numerodepaginas;
    }
    public void setNumerodepaginas(String numerodepaginas) {
        this.numerodepaginas = numerodepaginas;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    

}
