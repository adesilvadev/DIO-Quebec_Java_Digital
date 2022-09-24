package br.estruturas.repeticao.java;

public class ExemploForArray2 {

    public static void main(String[] args) {

        // em arrays o índice começa sempre com zero.
        String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        // Forma abreviada do exemplo anterior...
        for(String aluno: alunos){
            System.out.println("Nome do aluno e: " + aluno);
        }
    }
}
// os ":" depois da declaração da variável no for, indica que a variável vai receber um incremento a cada atulização.
// Substitui o uso da validação e do incremento estudado no exemplo anterior...