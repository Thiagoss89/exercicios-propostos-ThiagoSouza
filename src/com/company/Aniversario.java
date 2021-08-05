package com.company;

import java.util.Scanner;

public class Aniversario {

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        int dia;
        int mes;
        int ano;

        System.out.print("Informe o dia do seu aniversário ");
        dia = entrada.nextInt();

        System.out.print("Informe o mês do seu aniversário ");
        mes = entrada.nextInt();

        System.out.print("Informe o ano do seu aniversário ");
        ano = entrada.nextInt();

        if (dia < 1 || dia > 31) {
            System.out.println("Data inválida: dia informado está incorreto");
        } else if (mes < 1 || mes > 12) {
            System.out.println("Data inválida: mês informado está incorreto");
        } else if (ano > 2020) {
            System.out.println("Data inválida: ano informado está incorreto");
        } else {
            System.out.println("Data válida");
        }
    }
}
