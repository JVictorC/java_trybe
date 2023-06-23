package org.example;

public class Main {
  public static void main(String[] args) {
    Pessoa pessoa = new Pessoa("Joao", "Silva", 20);

    System.out.println(pessoa.getNome());
    System.out.println(pessoa.getIdade());

    System.out.println(pessoa.toString());

    Pessoa lucas = pessoa.withNome("Lucas");
    System.out.println(lucas);
    System.out.println(pessoa.toString());
  }
}