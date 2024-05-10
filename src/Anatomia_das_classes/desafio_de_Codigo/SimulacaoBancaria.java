package Anatomia_das_classes.desafio_de_Codigo;

import java.util.Scanner;

public class SimulacaoBancaria {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double saldo = 0;
		int opcao;
		// Loop infinito para manter o programa em execução até que o usuário decida
		// sair
		do {
			System.out.println("---Escolha Uma opção---");
			System.out.println("1 - Depositar");
			System.out.println("2 - Sacar");
			System.out.println("3 - Consultar Saldo");
			System.out.println("4 - Encerrar");

			opcao = scanner.nextInt();
			// TODO: Implemente as condições necessárias para avaliaa a opção escolhida:

			// Dica: Utilze o switch/case para o programa realizar as operações escolhidas
			// pelo usuário.
			switch (opcao) {
			case 1:
				System.out.print("Valor do deposito: ");
				double deposito = scanner.nextDouble();
				saldo += deposito;
				System.out.println("Saldo atual: "+saldo);
				break;
			case 2:
				System.out.print("Valor do Saque: ");
				double saque = scanner.nextDouble();
				if (saque > saldo) {
					System.out.println("Saldo insuficiente.");
				} else {
					saldo -= saque;
				}
				break;
			case 3:
				System.out.println("Saldo atual:" + saldo);
				;
				break;
			// Exibe mensagem de opção inválida se o usuário escolher uma opção inválida:
			default:
				System.out.println("Programa encerrado.");
			}
		} while (opcao != 4);
	}
}
