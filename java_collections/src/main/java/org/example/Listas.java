package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listas {
  public static void main(String[] args) {
    // List Imutavel Arrays.asList mutavel, porem nao conseguimos add ou remover elemento, para isso usamos ArrayList
    List<String> estudantes = new ArrayList<String>(Arrays.asList("Joao", "Marco"));

    System.out.println(estudantes);

    estudantes.set(0, "Victor");

    estudantes.add("Paulo");

    System.out.println(estudantes);

    estudantes.remove("Victor");

    System.out.println(estudantes);
  }
}
