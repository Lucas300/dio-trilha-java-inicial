package Anatomia_das_classes.desafio_de_Codigo;

import java.util.Scanner;

public class VerificadorNumeroConta {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		try {

			String numeroConta = scanner.next();

			verificarNumeroConta(numeroConta);

		} catch (IllegalArgumentException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		scanner.close();
	}

	private static void verificarNumeroConta(String numeroConta) {
		if (numeroConta.length() != 8) {
			throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");
		} else {
			System.out.printf("Numero de conta valido.");
		}
	}
}
