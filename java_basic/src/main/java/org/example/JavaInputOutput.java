package org.example;


import java.util.Scanner;

public class JavaInputOutput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com um Numero: ");

        double numero1 = Double.parseDouble(scanner.next());

        System.out.print("Entre com um segundo Numero: ");


        double numero2 = Double.parseDouble(scanner.next());

        System.out.print("Soma Total: ");
        System.out.print(numero1 + numero2);

        scanner.close();
    }
}
