package org.example;

public class Imc {

    public void calcularImg(double peso, double altura) {
        var imc = peso / Math.pow(altura, 2);


        System.out.println(imc);

    }
}
