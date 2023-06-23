package org.example;

import lombok.*;

@Getter
@AllArgsConstructor
@ToString
@With
public class Pessoa {
  private String nome;
  private String sobreNome;
  private int idade;

}
