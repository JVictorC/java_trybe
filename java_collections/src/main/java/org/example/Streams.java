package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Streams {
  public static void main(String[] args) {
    List<Estudante> estudantes = new ArrayList<Estudante>(Arrays.asList(
            new Estudante("Joao", 1, "TI"),
            new Estudante("Paulo", 2, "Psicologia"),
            new Estudante("Maria", 3, "Gastronomia"),
            new Estudante("Eduardo", 4, "TI"),
            new Estudante("Joao", 4, "TI")
    ));


    testeStream(estudantes);
//      testDistinc(estudantes);
  }

  private static void testeStream(List<Estudante> estudantes) {
    var a = estudantes.stream()
            .filter(e -> "TI".equals(e.getCurso()))
            .peek(System.out::println)
            .sorted(Comparator.comparing(Estudante::getNome))
            .map(Estudante::getNome)
            .peek(System.out::println)
            .collect(Collectors.toList());


    System.out.println(Arrays.toString(a.toArray()));
    System.out.println(estudantes);
  }


  public static void testDistinc(List<Estudante> estudantes) {
      long qtd = estudantes.stream().distinct().count();

    System.out.println(qtd);
  }


}
