package org.example;

import java.time.LocalTime;

public class PontoEletronico {
  public static boolean fazendoHorasExtras(LocalTime horas) {
    LocalTime horasLimiteParaExtra = LocalTime.parse("17:00");
    if(horas.isAfter(horasLimiteParaExtra)) {
      System.out.println("Fazendo Horas Extras");

      return true;
    }

    System.out.println("Sem Horas Extras");

    return false;
  }

  public static void main(String[] args) {
    fazendoHorasExtras(LocalTime.parse("12:00"));
    fazendoHorasExtras(LocalTime.now());
    fazendoHorasExtras(LocalTime.parse("18:00"));
  }
}
