package br.controle.fluxo.java;

// A estrutura condicional composta evolui para Condicional encadeada (else if)

public class ResultadoEscolar2 {

    public static void main(String[] args) {

        int nota = 10;

        if(nota >= 10) // true
            System.out.println("Aprovado com louvor");
        else if (nota >= 7 && nota < 10) // True or false
            System.out.println("Aprovado");

        else if (nota >= 5 && nota < 7) // True or false
            System.out.println("Prova de Recuperacao");
        else
            System.out.println("Reprovado");

    }
}
