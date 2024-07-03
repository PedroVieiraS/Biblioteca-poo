package com.biblioteca.demo;
public class Livro {
    private static int contador = 0;
    private int livro_id;
    private String edicao;
    private String titulo;

    public Livro(String edicao, String titulo){
        this.edicao = edicao;
        this.titulo = titulo;
        livro_id = contador;
        contador++;
    }

    public int getLivro_id() {
        return livro_id;
    }


    public void setLivro_id(int livro_id) {
        this.livro_id = livro_id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEdicao(){
        return edicao;
    } 

    public void setEdicao(String edicao){
        this.edicao = edicao;
    }

}
