package com.biblioteca.demo;

public class Atendente extends Funcionario {
    

    public Atendente(String nome, String rg, String cpf, String login, String senha, double salario){
        super(nome, cpf, rg, login, senha, salario);
    }

    @Override
    public double bonificacao(){
        return getSalario() * 0.05;
    }
}
