package Anatomia_das_classes.desafio_de_Codigo;

import java.util.Scanner;

public class ControleSimplesDeSaques {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 

		double limiteDiario = scanner.nextDouble();

  		for (int i = 1; i != 0;) {
  			double valorSaque = scanner.nextDouble();
  			i = (int) valorSaque;
  			if (limiteDiario >= valorSaque && (valorSaque != 0)) {
  				System.out.println("Saque realizado. Limite restante: " + (limiteDiario - valorSaque));
  			} else if (valorSaque > limiteDiario) {
  				System.out.print("Limite diario de saque atingido. ");
  				i = 0;
  			}
  
  		}
  		System.out.print("Transacoes encerradas.");
  		scanner.close();
	}

}
