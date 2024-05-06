package Anatomia_das_classes.Estrutura_condicional;

public class Saldo_if_else {

	public static void main(String[] args) {
		double saldo = 50;
		double valorSaque = 51;

		if (saldo >= valorSaque) {
			System.out.println("Saque realizado");
			System.out.println("Saldo restante R$:" + (saldo - valorSaque));
		} else {
			System.out.println("Não contem saldo suficiente, falta R$:" + (valorSaque - saldo));
		}

	}

}
