package org.example;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
public class Aluguel extends Imovel {
  private BigDecimal valorAluguel;
  private boolean estaAlugado;
  public Aluguel(String endereco, LocalDate dataCadastro, boolean ativo, BigDecimal valorAluguel, boolean estaAlugado) {
    super(endereco, dataCadastro, ativo);
    this.valorAluguel = valorAluguel;
    this.estaAlugado = estaAlugado;
  }

}
