package com.betrybe.sistemadevotacao;

/**
 * Representa uma pessoa candidata em um sistema de votação.
 * Esta classe estende a classe Pessoa e adiciona funcionalidades específicas para candidatos.
 */
public class PessoaCandidata extends Pessoa {

  private int numero; // Número de identificação da pessoa candidata
  private int votos;  // Quantidade de votos recebidos pela pessoa candidata

  /**
   * Construtor da classe PessoaCandidata.
   *
   * @param nome   O nome da pessoa candidata.
   * @param numero O número de identificação da pessoa candidata.
   */
  public PessoaCandidata(String nome, int numero) {
    this.nome = nome;
    this.numero = numero;
    this.votos = 0;
  }

  /**
   * Incrementa a contagem de votos recebidos pela pessoa candidata.
   */
  public void receberVoto() {
    this.votos += 1;
  }

  /**
   * Obtém o número de identificação da pessoa candidata.
   *
   * @return O número de identificação.
   */
  public int getNumero() {
    return numero;
  }

  /**
   * Define o número de identificação da pessoa candidata.
   *
   * @param numero O número de identificação a ser definido.
   */
  public void setNumero(int numero) {
    this.numero = numero;
  }

  /**
   * Obtém a quantidade de votos recebidos pela pessoa candidata.
   *
   * @return A quantidade de votos recebidos.
   */
  public int getVotos() {
    return votos;
  }

  /**
   * Define a quantidade de votos recebidos pela pessoa candidata.
   *
   * @param votos A quantidade de votos a ser definida.
   */
  public void setVotos(int votos) {
    this.votos = votos;
  }

  /**
   * Obtém o nome da pessoa candidata.
   *
   * @return O nome da pessoa candidata.
   */
  public String getNome() {
    return nome;
  }

  /**
   * Define o nome da pessoa candidata.
   *
   * @param nome O nome a ser definido para a pessoa candidata.
   */
  public void setNome(String nome) {
    this.nome = nome;
  }
}
