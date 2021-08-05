package com.company;

public class InvestimentoComIR extends Investimento{
    InvestimentoComIR(int valorInicial, int jurosMensais) {
        super(valorInicial, jurosMensais);
    }

    @Override
    double calcularLucro(int valorInicial, int jurosMensais, int qtdMeses) {

        if(qtdMeses < 6){
            var lucro = ((valorInicial*Math.pow((1+jurosMensais), qtdMeses))-valorInicial)*(77.5/100);
            return lucro;
        }else if (qtdMeses >= 6 && qtdMeses < 12){
            var lucro = ((valorInicial*Math.pow((1+jurosMensais), qtdMeses))-valorInicial)*(80/100);
            return lucro;
        }else if (qtdMeses >= 12 && qtdMeses < 24){
            var lucro = ((valorInicial*Math.pow((1+jurosMensais), qtdMeses))-valorInicial)*(82.5/100);
            return lucro;
        }else (qtdMeses >= 24){
            var lucro = ((valorInicial*Math.pow((1+jurosMensais), qtdMeses))-valorInicial)*(85/100);
            return lucro;
        }
        return 0;
    }
}
