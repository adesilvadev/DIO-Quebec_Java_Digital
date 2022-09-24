package br.controle.fluxo.java;

// Condição ternaria.

public class ResultadoEscolar3 {

    public static void main(String[] args) {

        int nota = 5;

        String resultado = nota >= 7 ? "Aprovado" : "Reprovado";

        // ? --> Determina o valor da condição da variável (nota >= 7) neste caso;
        // : --> Atua como uma especie de senão;

        System.out.println(resultado);
    }
}
