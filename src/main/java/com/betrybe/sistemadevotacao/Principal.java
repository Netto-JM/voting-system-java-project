package com.betrybe.sistemadevotacao;

import java.util.Scanner;

/**
 * Classe principal responsável pela execução do sistema de votação.
 * Permite cadastrar pessoas candidatas e eleitoras, registrar votos e mostrar resultados.
 */
public class Principal {

  /**
   * Método principal que inicia a execução do sistema de votação.
   *
   * @param args Os argumentos passados para o programa (não utilizado neste caso).
   */
  public static void main(String[] args) {
    // TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    GerenciamentoVotacao gerenciamentoVotacao = new GerenciamentoVotacao();

    // Cadastro de pessoas candidata;
    while (true) {
      System.out.printf("Cadastrar pessoa candidata?%n1 - Sim%n2 - Não%n");
      String option = sc.nextLine();
      System.out.println("Entre com o número correspondente à opção desejada:");
      if (option.equals("1")) {
        System.out.println("Entre com o nome da pessoa candidata:");
        String nome = sc.nextLine();
        System.out.println("Entre com o número da pessoa candidata:");
        String numeroString = sc.nextLine();
        int numero = Integer.parseInt(numeroString);
        gerenciamentoVotacao.cadastrarPessoaCandidata(nome, numero);
      } else if (option.equals("2")) {
        break;
      } else {
        System.out.printf("Opção inválida!%n");
      }
    }

    // Cadastro de pessoas eleitoras;
    while (true) {
      System.out.printf("Cadastrar pessoa eleitora?%n1 - Sim%n2 - Não%n");
      String option = sc.nextLine();
      System.out.println("Entre com o número correspondente à opção desejada:");
      if (option.equals("1")) {
        System.out.println("Entre com o nome da pessoa eleitora:");
        String nome = sc.nextLine();
        System.out.println("Entre com o cpf da pessoa eleitora:");
        String cpf = sc.nextLine();
        gerenciamentoVotacao.cadastrarPessoaEleitora(nome, cpf);
      } else if (option.equals("2")) {
        break;
      } else {
        System.out.printf("Opção inválida!%n");
      }
    }

    // Votação;
    while (true) {
      System.out.println("Entre com o número correspondente à opção desejada:");
      System.out.printf("1 - Votar%n2 - Resultado Parcial%n3 - Finalizar Votação%n");
      String option = sc.nextLine();
      if (option.equals("1")) {
        System.out.println("Entre com o cpf da pessoa eleitora:");
        String cpf = sc.nextLine();
        System.out.println("Entre com o número da pessoa candidata:");
        String numeroString = sc.nextLine();
        int numero = Integer.parseInt(numeroString);
        gerenciamentoVotacao.votar(cpf, numero);
      } else if (option.equals("2") || option.equals("3")) {
        gerenciamentoVotacao.mostrarResultado();
      } else {
        System.out.printf("Opção inválida!%n");
      }
      if (option.equals("3")) {
        break;
      }
    }
  }
}
