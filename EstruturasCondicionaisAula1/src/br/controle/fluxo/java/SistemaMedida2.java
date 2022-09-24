package br.controle.fluxo.java;

// Switch case na essencia... ( O "if-else" é mais recomendado);

public class SistemaMedida2 {

    public static void main(String[] args) {

        String sigla = "P";

        switch (sigla) {
            case "P":{
                System.out.println("PEQUENO");
                break;
            }
            case "M":{
                System.out.println("MEDIO");
                break;
            }
            case "G":{
                System.out.println("GRANDE");
                break;
            }
        default:
            System.out.println("INDEFINIDO");

        }
    }


}
