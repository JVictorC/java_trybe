package org.example;

public class Main {
  public static void main(String[] args) {
    Livro l = new Livro();

    l.setIsbn("1234");
    l.setTitulo("Titulo");


    LivroService service = new LivroService();



  }
}