package org.example;

import java.util.Scanner;

public class TestaImc {
    public static void main(String[] args) {
        Imc imc = new Imc();

        var scanner = new Scanner(System.in);

        System.out.print("Entre com sua Altura: ");
        var altura = Double.parseDouble(scanner.next());

        System.out.println("Entre com seu Peso: ");
        var peso = Double.parseDouble(scanner.next());



        imc.calcularImg(altura, peso);

        scanner.close();
    }
}
