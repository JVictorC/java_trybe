package org.example;

import java.util.List;

public class Carro extends Veiculo {
  public Carro(String placa, int ano_fabricacao) {
    super(placa, ano_fabricacao, Combustivel.Flex);
  }

  @Override
  public void abastecer(Abastecimento dadosAbastecimento) {
    this.listaAbastecimento.add(dadosAbastecimento);
  }

  @Override
  public List<Abastecimento> listarAbastecimento() {
    return listaAbastecimento;
  }
}
