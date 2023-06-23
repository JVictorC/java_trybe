package org.example;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DiffEntreDatas {
  public static void main(String[] args) {
    LocalDateTime now = LocalDateTime.now();
    LocalDateTime nascimento = LocalDateTime.parse("2002-04-12T00:00:00");

    Duration diff = Duration.between(nascimento, now);

    System.out.println(diff.toDays() / 365);
  }
}
