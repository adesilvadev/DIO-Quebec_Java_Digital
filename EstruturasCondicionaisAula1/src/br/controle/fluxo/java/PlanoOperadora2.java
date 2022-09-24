package br.controle.fluxo.java;

// Switch case --> Neste caso a instrução "break" não foi utilizada, para que as demais condições fossem reaproveitada.
// É possível perceber que as condições foram posicionadas de forma que uma vez sem o a instrução "break", as demais condições fosse adicionadas ao resultado.

// * O mais comum é utilizar a instrução "break" para brecar o fluxo, quando se encontra a condição esperada ;)

public class PlanoOperadora2 {

    public static void main(String[] args) {

        String plano = "T"; // B / M / T

        switch (plano) {
            case "T": {
                System.out.println("5Gb Youtube");
            }
            case "M": {
                System.out.println("Whats e Instagram gratis");
            }
            case "B": {
                System.out.println("100 minutos em ligacoes");
            }
        }


    }
}
