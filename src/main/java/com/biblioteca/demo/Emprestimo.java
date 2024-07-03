package com.biblioteca.demo;

public class Emprestimo {
    private static int contador = 0;
    private static int contador2 = 0;
    private int emprestimo_id;
    private int data_emprestimo;
    private int data_pre_dev;
    private int pessoa_id;

    
    public Emprestimo(int data_emprestimo, int data_pre_dev){
        emprestimo_id = contador;
        pessoa_id = contador2;
        contador++;
        contador2++;
        this.data_emprestimo = data_emprestimo;
        this.data_pre_dev = data_pre_dev;
    }   
    public int getEmprestimo_id() {
        return emprestimo_id;
    }
    
    public void setEmprestimo_id(int emprestimo_id) {
        this.emprestimo_id = emprestimo_id;
    }
    
    public int getData_emprestimo() {
        return data_emprestimo;
    }
    
    public void setData_emprestimo(int data_emprestimo) {
        this.data_emprestimo = data_emprestimo;
    }
    
    public int getData_pre_dev() {
        return data_pre_dev;
    }
    
    public void setData_pre_dev(int data_pre_dev) {
        this.data_pre_dev = data_pre_dev;
    }
    
    
    public int getPessoa_id() {
        return pessoa_id;
    }
    
    public void setPessoa_id(int pessoa_id) {
        this.pessoa_id = pessoa_id;
    }
}
