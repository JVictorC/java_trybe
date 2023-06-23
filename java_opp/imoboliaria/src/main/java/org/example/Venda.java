package org.example;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
public class Venda extends Imovel {
  private BigDecimal valorVenda;
  private boolean estaVendido;

  public Venda(String endereco, LocalDate dataCadastro, boolean ativo, BigDecimal valorVenda, boolean estaVendido) {
    super(endereco, dataCadastro, ativo);
    this.valorVenda = valorVenda;
    this.estaVendido = estaVendido;
  }


  public void venda() {
    this.estaVendido = true;
  }
}
