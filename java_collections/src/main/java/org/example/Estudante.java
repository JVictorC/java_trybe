package org.example;

import java.util.Objects;

public class Estudante{
  private String nome;
  private int numeroMatricula;

  private String curso;

  public Estudante(String nome, int numeroMatricula, String curso) {
    this.nome = nome;
    this.numeroMatricula = numeroMatricula;
    this.curso = curso;
  }

  public String getCurso() {
    return curso;
  }

  public String getNome() {
    return nome;
  }

  public int getNumeroMatricula() {
    return numeroMatricula;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Estudante estudante)) return false;
    return numeroMatricula == ((Estudante) o).getNumeroMatricula();
  }

  @Override
  public String toString() {
    return "Estudante{" +
            "nome='" + nome + '\'' +
            ", numeroMatricula=" + numeroMatricula +
            '}';
  }
}
