package com.company;

public class HospedagemVip extends Hospedagem{
        int valorAdicional;

        String total (int x, int y){
            this.valorEmReais = x;
            this.valorAdicional = y;
            String retorno = "O valor inicial: " + x + " e o valor Adicional: " + y;
            return retorno;
        }
}
