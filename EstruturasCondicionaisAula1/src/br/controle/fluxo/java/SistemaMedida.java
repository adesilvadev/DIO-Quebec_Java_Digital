package br.controle.fluxo.java;

// Switch case - USANDO -> Estrutura de repetição composta.

public class SistemaMedida {

    public static void main(String[] args) {

        String sigla = "Z";

        if(sigla == "S")
            System.out.println("PEQUENO");

        else if(sigla == "M")
            System.out.println("MEDIO");

        else if(sigla == "G")
            System.out.println("GRANDE");
        else
            System.out.println("INDEFINIDO");
    }
}
