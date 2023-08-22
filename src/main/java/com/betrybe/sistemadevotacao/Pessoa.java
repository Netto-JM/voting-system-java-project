package com.betrybe.sistemadevotacao;

/**
 * Classe abstrata que representa uma pessoa no sistema de votação.
 * Esta classe serve como uma classe base para tipos de pessoas específicas.
 */
public abstract class Pessoa {

  protected String nome; // Nome da pessoa

  /**
   * Obtém o nome da pessoa.
   *
   * @return O nome da pessoa.
   */
  public String getNome() {
    return nome;
  }

  /**
   * Define o nome da pessoa.
   *
   * @param nome O nome a ser definido para a pessoa.
   */
  public void setNome(String nome) {
    this.nome = nome;
  }
}
