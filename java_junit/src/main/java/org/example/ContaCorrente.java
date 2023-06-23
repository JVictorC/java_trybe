package org.example;

import java.math.BigDecimal;
import java.util.Random;


public class ContaCorrente extends Conta {
  private double saldo;
  private int numeroConta;

  public ContaCorrente(int numeroConta) {
    this.saldo = 0.0;

    numeroConta = numeroConta;
  }

  @Override
  public double getSaldo() {
    return saldo;
  }

  @Override
  public int getNumeroConta() {
    return numeroConta;
  }

  @Override
  public double depositar(double valor) {
    return saldo += valor;
  }

  @Override
  public boolean sacar(double valorASacar) throws SaldoInsuficienteExeption {
    if (saldo < valorASacar) throw new SaldoInsuficienteExeption();


    saldo -= valorASacar;


    return true;
  }
}
