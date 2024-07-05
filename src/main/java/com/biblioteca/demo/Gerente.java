package com.biblioteca.demo;

public class Gerente extends Funcionario {

    public Gerente(String nome, String rg, String cpf, String login, String senha, double salario){
        super(nome, cpf, rg, login, senha, salario);
    }

    @Override
    public double bonificacao(){
        return getSalario() * 0.1;
    }


}
