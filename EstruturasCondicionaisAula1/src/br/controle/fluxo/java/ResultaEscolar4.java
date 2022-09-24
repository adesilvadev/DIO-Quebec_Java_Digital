package br.controle.fluxo.java;

// Condição ternaria com mais condições...

public class ResultaEscolar4 {

    public static void main(String[] args) {

        int nota = 10;

        String resultado = nota >= 7 ? "Aprovado" : nota > 4 && nota < 7 ? "Recuperacao" : "Reprovado";

        // ? --> Determina o valor da condição da variável (nota >= 7) neste caso;
        // : --> Atua como uma especie de senão;

        System.out.println(resultado);
    }
}
