package br.estruturas.repeticao.java;

public class ExemploBreakContinue {

    public static void main(String[] args) {

        for (int numero = 1; numero <=20; numero ++){

            if(numero ==5)
                continue;

            else if(numero == 10)
                break;

            System.out.println(numero);
        }
    }
}

// Quando uso "CONTINUE" no IF, a condição informada é pulada/ignorada/desconsiderada e a contagem prossegue;
// Quando uso "BREAK" no IF, ao encontrar a condição informada, a contagem é interrompida.
