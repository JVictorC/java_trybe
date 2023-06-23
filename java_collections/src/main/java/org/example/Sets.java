package org.example;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {
  public static void main(String[] args) {
    Set<Integer> numeros = new TreeSet<Integer>();

    numeros.add(1);
    numeros.add(1);
    numeros.add(8);

    System.out.println(numeros);

    Set<Estudante> estudantes = new HashSet<Estudante>();



    var e = new Estudante("", 1, "");
    var e1 = new Estudante("", 1, "");

    estudantes.add(e);
    estudantes.add(e1);
    estudantes.add(e);


    System.out.println(estudantes);

    Set<String> palavras = Set.of("Uno");

    palavras.add("Gol");

    System.out.println(palavras);
  }
}
