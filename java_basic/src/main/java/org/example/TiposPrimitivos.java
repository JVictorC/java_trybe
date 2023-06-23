package org.example;

import java.util.Arrays;

public class TiposPrimitivos {

    public static void main(String[] args) {
//        byte	0	1 byte	-128 até 127
//        short	0	2 byte	-32,768 até 32,767
//        int	0	4 byte	-2,147,483,648 até 2,147,483, 647
//        long	0L	8 byte	-9,223,372,036,854,775,808 até 9,223,372,036,854,775,807
//        float	0.0f	4 byte	-1.4E-45 até 3.4028235E38
//        double	0.0d	8 byte	-4.9E-324 até 1.7976931348623157E308
//        char	'\u0000'	2 byte	0 até 65535
//        boolean	false	1 bit	true ou false


        int numero = 0;

        long numero2 = 2L;


        double a = 2;

        System.out.println(a);


        // Numeros Fracionados Double e Float



        // Diff o double tem o dobro de precisao do float


        // por parao o java identifica ponto flutuando como double


        double doubleNumber = 2.6;

        float floatNumber = 2.6f;


        // Boolean e Char

        // Char caracter

        // Boolean True e False



        boolean bool = true;

        char t = 't';



        // Tipos Não Primitivos



        // Strigs e Arrays



        String meuNome = "Joao Victor";
        StringBuilder builder = new StringBuilder();
        var frase = builder.append(meuNome).append(" Ola");


        System.out.println(frase);




        double[] arrayList = new double[3];


        arrayList[0] = 3.4;
        arrayList[1] = 3.7;
        arrayList[2] = 3.9;


        Arrays.stream(arrayList).forEach(number -> {
            System.out.println(number);
        });


        System.out.println(arrayList[3]);


        String[] nomes =  {"Joao", "Victor", "Carlos"};



        for (var index = 0; index <nomes.length; index++) {

        }

        for (String nome : nomes) {

        }

    }

}
