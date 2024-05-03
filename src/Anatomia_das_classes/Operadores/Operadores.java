package Anatomia_das_classes.Operadores;

import java.util.Date;

public class Operadores {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//Operador de atribuição
		String nome = "LUCAS";
		char sexo = 'M';
		boolean doadorOrgao = false;
		Date dataNascimento = new Date();
		
		//Operadores aritméticos + - * / % 
		double soma = 10.5 + 15.7;
		int subtração = 113 - 25;
		int multiplicacao = 20 * 7;
		int divisao = 15/3;
		int modulo = 18 % 3;
		int num = 5;
		boolean variavel = true;
		
		//concatenação
		String ling = "Linguagem"+" Java";
		System.out.println(ling);
		
		
		//Operador de incremento ++
		num++;
		System.out.println(num);
		//Operador de decremento --
		num--;
		System.out.println(num);
		//Operador lógico de negação (!)
		System.out.println(!variavel);
		
		//Operador Ternario
		/*
		  <Expressão condicional> ? <Caso condição seja true> : <Caso condição seja false>
		  
		 */
		int a = 5;
		int b = 6;
		
		String resultado = (b<a)?"Verdadeiro":"Falso"; //Operador Ternario
		
		System.out.println(resultado);
		
		//Operadores Relacionais == > < >= <= !=
		boolean comparar = a == b; //false
		
		//Operadores Logicos  && , ||
		boolean fals = false,vdd = true;
		System.out.println("Operador Lógico && " + (fals && vdd));
		System.out.println("Operador Lógico || " + (fals || vdd));

	}

}
