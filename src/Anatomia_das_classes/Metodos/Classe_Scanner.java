package Anatomia_das_classes.Metodos;

import java.util.Locale;
import java.util.Scanner;

public class Classe_Scanner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		System.out.print("Digite seu nome: ");
		String nome = scanner.next();
		
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = scanner.next();
		
		System.out.print("Digite sua idade: ");
		int idade = scanner.nextInt();
		
		System.out.print("Digite sua altura: ");
		double altura = scanner.nextDouble();
		
		System.out.println("ola me chamo "+nome +" "+sobrenome);
		System.out.println("Tenho "+idade+" anos");
		System.out.printf("Minha altura é %.2f",altura);

	}

}
