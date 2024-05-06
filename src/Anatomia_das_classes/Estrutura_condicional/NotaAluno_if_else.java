package Anatomia_das_classes.Estrutura_condicional;

public class NotaAluno_if_else {
	public static void main(String[] args) {
		double nota = 6.99;

		if (nota >= 7) {
			System.out.println("Aprovado");
		} else if (nota >= 5 && nota < 7) {
			System.out.println("Recuperação");
		} else
			System.out.println("Reprovado");
	}
}
