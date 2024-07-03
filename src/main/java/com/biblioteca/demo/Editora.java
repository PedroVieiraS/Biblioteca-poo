package com.biblioteca.demo;

public class Editora {
    private static int contador = 0;
    private int editora_id;
    private String nome;

    public Editora(String nome){
        this.nome = nome;
        editora_id = contador;
        contador++;
    }

    public int getEditora_id(){
        return editora_id;
    }

    public void setEditora_id(int editora_id){
        this.editora_id = editora_id;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }




}
