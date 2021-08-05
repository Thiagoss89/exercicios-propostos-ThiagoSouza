package com.company;

public class InstanciaHospedagens {
    public static void main(String[] args) {
        Hospedagem h1 = new Hospedagem();
        h1.valorEmReais = 1000;

        HospedagemVip hVip = new HospedagemVip();
        hVip.valorAdicional = 2000;

        int diferencaPreco = h1.valorEmReais - hVip.valorAdicional;
        System.out.println(" A diferença de preço é " + diferencaPreco);


    }
}
