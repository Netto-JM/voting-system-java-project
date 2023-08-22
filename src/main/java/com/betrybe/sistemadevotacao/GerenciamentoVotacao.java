package com.betrybe.sistemadevotacao;

import java.util.ArrayList;

/**
 * Classe responsável pelo gerenciamento de votação em um sistema de votação.
 * Esta classe implementa a interface GerenciamentoVotacaoInterface
 * para definir funcionalidades específicas.
 */
public class GerenciamentoVotacao implements GerenciamentoVotacaoInterface {
  private final ArrayList<PessoaCandidata> pessoasCandidatas = new ArrayList<>();
  private final ArrayList<PessoaEleitora> pessoasEleitoras = new ArrayList<>();
  private final ArrayList<String> cpfsComputados = new ArrayList<>();

  /**
   * Cadastra uma pessoa candidata no sistema.
   *
   * @param nome   O nome da pessoa candidata.
   * @param numero O número de identificação da pessoa candidata.
   */
  public void cadastrarPessoaCandidata(String nome, int numero) {
    for (PessoaCandidata pessoa : pessoasCandidatas) {
      if (pessoa.getNumero() == numero) {
        System.out.println("Número da pessoa candidata já utilizado!");
        return; // Encerra o método sem adicionar a pessoa candidata duplicada
      }
    }

    PessoaCandidata pessoaCandidata = new PessoaCandidata(nome, numero);
    pessoasCandidatas.add(pessoaCandidata);
  }

  /**
   * Cadastra uma pessoa eleitora no sistema.
   *
   * @param nome O nome da pessoa eleitora.
   * @param cpf  O número de CPF da pessoa eleitora.
   */
  public void cadastrarPessoaEleitora(String nome, String cpf) {
    for (PessoaEleitora pessoa : pessoasEleitoras) {
      if (pessoa.getCpf().equals(cpf)) {
        System.out.println("Pessoa eleitora já cadastrada!");
        return; // Encerra o método sem adicionar a pessoa eleitora duplicada
      }
    }

    PessoaEleitora pessoaEleitora = new PessoaEleitora(nome, cpf);
    pessoasEleitoras.add(pessoaEleitora);
  }

  /**
   * Registra o voto de uma pessoa eleitora em uma pessoa candidata.
   *
   * @param cpfPessoaEleitora   O CPF da pessoa eleitora.
   * @param numeroPessoaCandidata O número da pessoa candidata.
   */
  public void votar(String cpfPessoaEleitora, int numeroPessoaCandidata) {
    for (String cpf : cpfsComputados) {
      if (cpf.equals(cpfPessoaEleitora)) {
        System.out.println("Pessoa eleitora já votou!");
        return; // Encerra o método sem computar o voto da pessoa eleitora
      }
    }

    for (PessoaCandidata pessoa : pessoasCandidatas) {
      if (pessoa.getNumero() == numeroPessoaCandidata) {
        pessoa.receberVoto();
        cpfsComputados.add(cpfPessoaEleitora);
        return; // Encerra o método após computar o voto da pessoa eleitora
      }
    }

    System.out.println("Pessoa candidata não cadastrada!");
  }

  /**
   * Mostra o resultado da votação, exibindo a contagem de votos para cada pessoa candidata.
   */
  public void mostrarResultado() {
    if (cpfsComputados.isEmpty()) {
      System.out.println("É preciso ter pelo menos um voto para mostrar o resultado.");
      return;
    }

    int totalVotos = cpfsComputados.size();

    for (PessoaCandidata pessoa : pessoasCandidatas) {
      int votos = pessoa.getVotos();
      int percentual = Math.round((float) votos / totalVotos * 100);
      System.out.printf("Nome: %s - %d votos ( %d%% )\n", pessoa.getNome(), votos, percentual);
    }

    System.out.printf("Total de votos: %d\n", totalVotos);
  }
}
