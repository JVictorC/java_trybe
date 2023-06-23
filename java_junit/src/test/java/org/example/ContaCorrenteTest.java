package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContaCorrenteTest {

  @Test
  void testaDeposito() {
    ContaCorrente cc = new ContaCorrente(1);

    double depositValue =  cc.depositar(20);

    assertEquals(depositValue, 20);

    cc.depositar(40);

    double balance = cc.getSaldo();

    assertEquals(balance, 60);
  }
}