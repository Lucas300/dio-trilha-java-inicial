package Anatomia_das_classes.Variaveis;

public class Variaveis {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String nome = "Lucas";
		
		//tipos primitivos
		byte idade = 100; //de -127 até 127
		short ano = 2024;
		int cep = 21070333;
		long cpf = 98765432109L;//necessario colocar o L no final
		//constante é em caixa alta
		final float PI = 3.14F; //necessario colocar o f no final
		double salario = 2500.50;
		
		
		
		//java é fortemente tipado
		//O valor da variavel sera definida com base no primeiro valor que entrar
		var variavel = 123;
		
		//Casting 
		int ano2 = (int)ano;
		
		
	}
}
