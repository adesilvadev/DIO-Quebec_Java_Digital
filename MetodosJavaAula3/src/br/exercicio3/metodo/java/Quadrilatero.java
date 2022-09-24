package br.exercicio3.metodo.java;

/*
ANOTAÇÕES

- Diferente dos exercícios anteriores, os métodos deste exercício não são retornados por "System.out.println";
- Este não são declarados como "void" e sim com um tipo;
- O restorno que antes era feito por "System.out.println", agora será retornado pela instrução "return".

 */

public class Quadrilatero {

    public static double area (double lado) {

        return lado * lado;

    }

    public static double area (double lado1, double lado2){

        return lado1 * lado2;
    }

    public static double area (double baseMaior, double baseMenor, double altura){

        return ((baseMaior + baseMenor)* altura)/2;
    }
}
