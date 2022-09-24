package br.exercicio1.metodo.java;

/*
Calasse principal dos exercicios da Aula 1 - Métodos
 */

public class Main {

    public static void main(String[] args) {

        // Calculadora

        System.out.println("Exercicio - Calculadora");
        Calculadora.soma(3,6);
        Calculadora.subtracao(9,1.8);
        Calculadora.multiplicacao(7,8);
        Calculadora.divisao(5,2.5);

        // Mensagens

        System.out.println("Exercicio - Calculadora");
        Mensagem.obterMensagem(21);
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(17);

        // Emprestimo

        System.out.println("Exercicio - Emprestimo");
        Emprestimo.calcular(1000,Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000,Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000,5);
    }


}
