package com.biblioteca.demo;

public class Autor {
    private static int contador = 0;
    private int autor_id;
    private String nome;

    public Autor(String nome){
        this.nome = nome;
        autor_id = contador;
        contador++;
    }
    
    public int getAutor_id() {
        return autor_id;
    }

    public void setAutor_id(int autor_id) {
        this.autor_id = autor_id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    


}
