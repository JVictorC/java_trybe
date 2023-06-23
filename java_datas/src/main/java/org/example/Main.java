package org.example;

import java.time.Clock;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
  public static void testDatas() {
    LocalDate now = LocalDate.now();

    if(now.getDayOfWeek() == DayOfWeek.FRIDAY) {
      System.out.println("Sextou");
    } else {
      System.out.println("Nao sextou");
    }
  }
  public static void main(String[] args) {
    testDatas();
    Clock relogio = Clock.systemDefaultZone();


    System.out.println(relogio.instant());

    LocalDateTime nowWithHours = LocalDateTime.now();

    System.out.println(nowWithHours);

    LocalDate nowWithoutHours= LocalDate.now();

    System.out.println(nowWithoutHours);



  }
}