package Anatomia_das_classes.Estrutura_Repetitiva;

import java.util.Iterator;

public class Break_Continue {

	public static void main(String[] args) {
		//continue ele ira ignorar aquele indice caso a condição seja verdadeira
		for (int i = 0; i < 10; i++) {
			if (i == 3) {
				continue; // vai pular o numero 3 
			}
			System.out.println(i);				
		}
		System.out.println("\n\n");
		System.out.println("break");
		//break força a parada o LOOP
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				 break; 
			}
			System.out.println(i);				
		}

	}

}
