package org.example;

import java.util.Arrays;

public class StringExemplos {
  public static void main(String[] args) {
    System.out.println(getNumeroConta("15983-X"));

    String nomes = "Maria Magali, Magali da Silva, Magali Medeiros";
    String pessoa = "Laura";

    nomes = nomes.replace("Magali", pessoa);

    System.out.println(nomes);

    System.out.println(Arrays.toString("carro-barco-navio-moto--".split("-", 2)));
  }

  public static String getNumeroConta(String contaFormatada) {
    return contaFormatada.replace('X', '0');
  }
}
