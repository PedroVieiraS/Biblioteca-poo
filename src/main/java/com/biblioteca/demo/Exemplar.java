package com.biblioteca.demo;

public class Exemplar {
    private static int contador = 0;
    private static int contador2 = 0;
    private int exemplar_id;
    private int livro_id;
    
    public Exemplar(){
        exemplar_id = contador;
        livro_id = contador2;
        contador++;
        contador2++;
    }

    public int getLivro_id() {
        return livro_id;
    }
    
    public void setLivro_id(int livro_id) {
        this.livro_id = livro_id;
    }
    
    public int getExemplar_id() {
        return exemplar_id;
    }
    
    public void setExemplar_id(int exemplar_id) {
        this.exemplar_id = exemplar_id;
    }
}
