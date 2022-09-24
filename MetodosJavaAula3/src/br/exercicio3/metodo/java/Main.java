package br.exercicio3.metodo.java;
/*

Quando o retorno do método for por "return", os parametros devem ser armazenados em variáveis para depois serem executados;

 */
public class Main {

    public static void main(String[] args){

        // Retornos

        System.out.println("Exercicio do Retornos");

        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("Area do quadrado: " + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(5,5);
        System.out.println("Area do retangulo" + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(7,8,9);
        System.out.println("Area do trapezio: " + areaTrapezio);
    }
}
