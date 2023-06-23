package org.example;

public class Container implements ITransporte {
  private String modelo;
  private double capacidade;

  public String getModelo() {
    return modelo;
  }

  public double getCapacidade() {
    return capacidade;
  }

  @Override
  public String transportar(String origem, String destino) {
    return String.format("Veiculo de plca: %s, vai transportar cagar" + " de $s para $s ", this.getPlaca(), origem, destino);
  }

}
