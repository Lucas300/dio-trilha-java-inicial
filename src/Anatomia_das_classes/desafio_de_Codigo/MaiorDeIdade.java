package Anatomia_das_classes.desafio_de_Codigo;

import java.util.Scanner;

public class MaiorDeIdade {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 

        int idade = scanner.nextInt(); 

        if(idade >= 18){
          System.out.println("Voce esta elegivel para criar uma conta bancaria.");
        }else{
          System.out.println("Voce nao esta elegivel para criar uma conta bancaria.");
        }

        scanner.close(); 
	}
}
