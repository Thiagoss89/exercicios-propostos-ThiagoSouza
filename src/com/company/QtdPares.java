package com.company;

import java.security.Security;
import java.util.Scanner;

public class QtdPares {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");

        int par = 0;
        var numDigitado = entrada.nextInt();
        while ( numDigitado < 1000 ||  numDigitado > 9999 ) {
            System.out.println("O número precisa conter 4 dígitos, tente novamente ");
            numDigitado = entrada.nextInt();
        }
        String strNum = Integer.toString(numDigitado);
        for (int i = 0; i < strNum.length(); i++){
            int num = Integer.parseInt(strNum.valueOf(i));
            if (num % 2 == 0){
                par++;
            }
        }
        System.out.println("A quantidade de número pares no número digitado foi: ");
        System.out.println(par);







        entrada.close();
    }
}
