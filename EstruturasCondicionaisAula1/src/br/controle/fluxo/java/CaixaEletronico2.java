package br.controle.fluxo.java;

// Estrutura condicional simples, evoluida para estrutura composta;

public class CaixaEletronico2 {

    public static void main(String[] args) {

        double saldo = 25.0;
        double valorSolicitado = 26.0;

        if (valorSolicitado < saldo) {

            saldo = saldo - valorSolicitado;
            System.out.println("Novo saldo" + saldo);
        } else
            System.out.println("Saldo insuficiente");
    }

}
