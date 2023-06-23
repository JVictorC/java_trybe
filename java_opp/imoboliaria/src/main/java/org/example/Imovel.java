package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@AllArgsConstructor
public class Imovel {
  private String endereco;
  private LocalDate dataCadastro;
  private boolean ativo;



  public void ativarCadastro() {
    this.ativo = true;
  }




}
