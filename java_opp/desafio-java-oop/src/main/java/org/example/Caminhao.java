package org.example;

import java.util.List;

public class Caminhao extends Veiculo implements ITransporte {
  public Caminhao(String placa, int ano_fabricacao) {
    super(placa, ano_fabricacao, Combustivel.Diesel);
  }

  @Override
  public void abastecer(Abastecimento dadosAbastecimento) {
    listaAbastecimento.add(dadosAbastecimento);
  }

  @Override
  public List<Abastecimento> listarAbastecimento() {
    return this.listaAbastecimento;
  }

  @Override
  public String transportar(String origem, String destino) {
    return String.format("Veiculo de plca: %s, vai transportar cagar" + " de $s para $s ", this.getPlaca(), origem, destino);
  }
}
