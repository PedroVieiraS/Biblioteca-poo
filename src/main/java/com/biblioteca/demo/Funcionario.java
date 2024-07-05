package com.biblioteca.demo;

public abstract class Funcionario extends Pessoa {

    private String login;
    private String senha;
    private double salario;

    public Funcionario(String nome, String rg, String cpf, String login, String senha, double salario){
        super(nome, cpf, rg);
        this.login = login;
        this.senha = senha;
        this.salario = salario;
    }

    // public void imprimeContraCheque(){
    //     System.out.println("Nome: " + this.getNome());
    //     System.out.println("Desconto Inss: " + this.inss());
    //     System.out.println("Desconto fgts: " + this.fgts());
    //     System.out.println("Salario: " + this.calcularSalario());
    // }

    public String imprimeContraCheque() {
        StringBuilder contraCheque = new StringBuilder();
        
        contraCheque.append("Nome: ").append(this.getNome()).append("\n");
        contraCheque.append("Desconto INSS: ").append(this.inss()).append("\n");
        contraCheque.append("Desconto FGTS: ").append(this.fgts()).append("\n");
        contraCheque.append("Salário: ").append(this.calcularSalario()).append("\n");
        
        return contraCheque.toString();
    }
    

    public double calcularSalario(){
        return salario - inss() - fgts() + bonificacao();
    }

    public boolean autentica(){
        return this.login.equals(login) && this.senha.equals(senha);
    }

    public double fgts(){
        return salario * 0.08;
    }

    public double inss(){
        return salario * 0.1;
    }

    public abstract double bonificacao();

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
