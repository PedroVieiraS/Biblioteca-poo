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
}
