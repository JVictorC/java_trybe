package org.example;

import java.math.BigDecimal;

public class Abastecimento {
  private String local;
  private String nomeMotorista;
  private BigDecimal valor;

  public Abastecimento(String local, String nomeMotorista, BigDecimal valor) {
    this.local = local;
    this.nomeMotorista = nomeMotorista;
    this.valor = valor;
  }

  public void setLocal(String local) {
    this.local = local;
  }

  public void setNomeMotorista(String nomeMotorista) {
    this.nomeMotorista = nomeMotorista;
  }

  public void setValor(BigDecimal valor) {
    this.valor = valor;
  }
}
