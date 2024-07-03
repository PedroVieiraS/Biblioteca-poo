package com.biblioteca.demo;

public class Endereco {
    private static int contador = 0;
    private int endereco_id;
    private int uf;
    private String cidade;
    private String tipo;
    private String logradouro;
    private String complemento;
    
    

    public Endereco (int uf, String cidade, String tipo, String logradouro, String complemento){
        this.uf = uf;
        this.cidade = cidade;
        this.tipo = tipo;
        this.logradouro = logradouro;
        this.complemento = complemento;
        endereco_id = contador;
        contador++;
    }
    
    public int getEndereco_id() {
        return endereco_id;
    }
    
    public void setEndereco_id(int endereco_id) {
        this.endereco_id = endereco_id;
    }
    
    public int getUf() {
        return uf;
    }
    
    public void setUf(int uf) {
        this.uf = uf;
    }
    
    public String getCidade() {
        return cidade;
    }
    
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    
}
