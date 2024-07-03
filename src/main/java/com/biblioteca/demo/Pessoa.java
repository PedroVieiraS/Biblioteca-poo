package com.biblioteca.demo;

public class Pessoa {
    private static int contador = 0;
    private int pessoa_id;
    private String rg;  
    private String cpf;
    private String nome;
    
    public Pessoa(String rg, String cpf, String nome){
        this.rg = rg;
        this.cpf = cpf;
        this.nome = nome;
        pessoa_id = contador;
        contador++;
    }
    
    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getPessoa_id() {
        return pessoa_id;
    }
    
    public void setPessoa_id(int pessoa_id) {
        this.pessoa_id = pessoa_id;
    }

}


