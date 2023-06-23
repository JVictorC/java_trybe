package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class ChegarAniversario {
  public static void main(String[] args) {
    LocalDate now = LocalDate.now();
    LocalDate nascimento = LocalDate.parse("2002-04-07");

    System.out.println(now);
    System.out.println(nascimento);

    if(now.getMonth().equals(nascimento.getMonth())) {
      if(now.getDayOfMonth() == nascimento.getDayOfMonth()) {
        System.out.println("Feliz Aniversario");
      } else if(now.getDayOfMonth() < nascimento.getDayOfMonth()) {
        System.out.println("Seu Aniversario esta proximo");
      } else {
        System.out.println("Seu Aniversario ja passou");
      }
    } else if(now.getMonthValue() > nascimento.getMonthValue()) {
      System.out.println("Seu Aniversario ja passou");
    } else {
      System.out.println("Seu Aniversario nao passou");
    }
  }
}
