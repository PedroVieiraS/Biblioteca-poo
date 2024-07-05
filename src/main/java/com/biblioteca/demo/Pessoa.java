package com.biblioteca.demo;

public abstract class Pessoa {
    private static int contador = 0;
    private int pessoa_id;
    private String rg;
    private String cpf;
    private String nome;
    private Endereco endereco;
    
    public Pessoa( String nome, String cpf, String rg){
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        pessoa_id = contador;
        contador++;
    }
    
    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
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


