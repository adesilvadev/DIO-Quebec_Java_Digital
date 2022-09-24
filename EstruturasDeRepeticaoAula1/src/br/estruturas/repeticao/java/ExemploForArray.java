package br.estruturas.repeticao.java;

// length --> indica tamanho;
// [ ] --> Array;

public class ExemploForArray {

    public static void main(String[] args) {

        // em arrays o índice começa sempre com zero.
        String alunos[] = {"FELIPE", "JONAS", "JULIA", "MARCOS"};

        for (int x = 0; x < alunos.length; x++) {
            System.out.println("O aluno no indice x=" + x + " e " + alunos[x]);
        }
    }
}