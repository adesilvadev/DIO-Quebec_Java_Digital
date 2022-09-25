package br.estruturas.repeticao.java;

import java.util.concurrent.ThreadLocalRandom;
// A biblioteca "ThreadLocalRandom" é responsável por criar números aliatórios;
// Neste exemplo, está sendo chamada no "return" do método "valorAliatorio", onde estão sendo passados valores
// entre 2 e 8 que serão retornados dentro do contexto de preços esperados para este exemplo;

public class ExemploWhile {

    public static void main(String[] args) {

        double mesada = 50.0;

        while(mesada > 0) {

            double valorDoce = valorAliatorio();

            if(valorDoce > mesada)
                valorDoce = mesada;

            System.out.println("Doce do valor: " + valorDoce + "foi adicionado ao carrinho...");
            mesada = mesada - valorDoce;

        }
        System.out.println("Mesada: " + mesada);
        System.out.println("João gastou toda a mesada em doces");

    }

    private static double valorAliatorio(){

        return ThreadLocalRandom.current().nextDouble(2.15);
    }
}
