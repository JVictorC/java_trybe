package org.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public abstract class Veiculo {
  protected String placa;
  protected int ano_fabricacao;
  protected  Combustivel combustivel;

  protected ArrayList<Abastecimento> listaAbastecimento;


  public Veiculo(String placa, int ano_fabricacao, Combustivel combustivel) {
    this.placa = placa;
    this.ano_fabricacao = ano_fabricacao;
    this.combustivel = combustivel;

    this.listaAbastecimento = new ArrayList<Abastecimento>();
  }

  public abstract void abastecer(Abastecimento dadosAbastecimento);

  public abstract List<Abastecimento> listarAbastecimento();


  public String getPlaca() {
    return placa;
  }

  public int getAnoFabricacao() {
    return ano_fabricacao;
  }

  public Combustivel getCombustivel() {
    return combustivel;
  }
}
