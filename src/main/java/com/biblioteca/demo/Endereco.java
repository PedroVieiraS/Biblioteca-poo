package com.biblioteca.demo;

public class Endereco {
    private static int contador = 0;
    private int endereco_id;
    private String cidade;
    private String cep;
    

    public Endereco ( String cidade, String cep){
        this.cidade = cidade;
        this.cep = cep;
        endereco_id = contador;
        contador++;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Endereco (String cidade){
        this.cidade = cidade;
    }
    
    public int getEndereco_id() {
        return endereco_id;
    }
    
    public void setEndereco_id(int endereco_id) {
        this.endereco_id = endereco_id;
    }
    
    public String getCidade() {
        return cidade;
    }
    
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
}
