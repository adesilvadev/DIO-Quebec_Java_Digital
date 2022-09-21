package aula.two.exercicio;

public class main {

    public static void main(String[] args) {

        byte b1 = 10;
        byte b2 = 20;

        short s1 = 20000;
        //short s2 = 40000; O número está ultrapassando e muito a capacidade do short.

        //int i1 = -1000000000000; // O número está ultrapassando e muito a capacidade negativa do int.
        int i2 = 28500;

        long l1 = 1000000000000000000L;
        long l2 = 2004005000500055000L;

        //float f1 = 4.5; Não foi utilizado o 'F' para informar que é um Float.
        float f2 = 10.68F;

        double d1 = 85.69;
        double d2 = 99.84D;

        char c1 = 'w';
        //char c2 = 'Tw';
        char c3 = '\u0057';

        String st1 = "Fulano";
        String st2 = "Cicrano";
        String st3 = "ag iasnliasna isoansanis islanlis 4455444";

        //String dt1 = "21/09/2022"; não é uma boa prática usar String para datas.

        boolean bo1 = true;
        boolean bo2 = false;

        System.out.println(b1);
        System.out.println(b2);

        System.out.println(s1);

        System.out.println(i2);

        System.out.println(l1);
        System.out.println(l2);

        System.out.println(f2);

        System.out.println(d1);
        System.out.println(d2);

        System.out.println(c1);
        System.out.println(c3);

        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);


        System.out.println(bo1);
        System.out.println(bo2);







    }
}
