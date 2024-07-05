package com.biblioteca.demo;

public class Devolucao {
    private static int contador = 0;
    private int data_devolvido;
    private int devolucao_id;


    public Devolucao(int data_devolvido){
        this.data_devolvido = data_devolvido;
        devolucao_id = contador;
        contador++;
    }

    public int getData_devolvido() {
        return data_devolvido;
    }

    public void setData_devolvido(int data_devolvido) {
        this.data_devolvido = data_devolvido;
    }

    public int getDevolucao_id() {
        return devolucao_id;
    }

    public void setDevolucao_id(int devolucao_id) {
        this.devolucao_id = devolucao_id;
    }
}
