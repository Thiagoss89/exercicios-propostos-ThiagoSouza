package com.company;

public class Investimento {
    int valorInicial;
    int jurosMensais;

    Investimento(int valorInicial, int jurosMensais){
        this.valorInicial = valorInicial;
        this.jurosMensais = jurosMensais;
    }

    double calcularLucro(int valorInicial, int jurosMensais, int qtdMeses) {
        double lucro = (valorInicial*Math.pow((1+jurosMensais), qtdMeses))-valorInicial;
        return lucro;
    }

}
