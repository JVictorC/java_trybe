package org.example;

import java.math.BigDecimal;

public abstract class Conta {

  public abstract int getNumeroConta();
  public abstract double getSaldo();
  public abstract double depositar(double valor);
  public abstract boolean sacar(double valorASacar) throws SaldoInsuficienteExeption;
}
