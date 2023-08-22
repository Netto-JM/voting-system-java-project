package com.betrybe.sistemadevotacao;

/**
 * Representa uma pessoa eleitora em um sistema de votação.
 * Esta classe estende a classe Pessoa e adiciona funcionalidades específicas para eleitores.
 */
public class PessoaEleitora extends Pessoa {

  private String cpf; // Número de CPF da pessoa eleitora

  /**
   * Construtor da classe PessoaEleitora.
   *
   * @param nome O nome da pessoa eleitora.
   * @param cpf  O número de CPF da pessoa eleitora.
   */
  public PessoaEleitora(String nome, String cpf) {
    this.nome = nome;
    this.cpf = cpf;
  }

  /**
   * Obtém o número de CPF da pessoa eleitora.
   *
   * @return O número de CPF.
   */
  public String getCpf() {
    return cpf;
  }

  /**
   * Define o número de CPF da pessoa eleitora.
   *
   * @param cpf O número de CPF a ser definido.
   */
  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  /**
   * Obtém o nome da pessoa eleitora.
   *
   * @return O nome da pessoa eleitora.
   */
  public String getNome() {
    return nome;
  }

  /**
   * Define o nome da pessoa eleitora.
   *
   * @param nome O nome a ser definido para a pessoa eleitora.
   */
  public void setNome(String nome) {
    this.nome = nome;
  }
}
