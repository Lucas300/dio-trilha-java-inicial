package Anatomia_das_classes.Tratamento_de_Excecoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_Catch {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		try {
			System.out.print("Digite seu nome:");
			String nome = ler.next();
			System.out.print("Digite seu Sobrenome:");
			String sobrenome = ler.next();
			System.out.print("Digite sua idade:");
			int idade = ler.nextInt();
		}
		catch(InputMismatchException e) {
			System.err	.println("O campo de idade precisa ser do tipo numericos");
		}
		
	}

}
