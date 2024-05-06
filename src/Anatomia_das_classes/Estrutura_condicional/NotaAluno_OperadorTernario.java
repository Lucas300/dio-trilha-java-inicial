package Anatomia_das_classes.Estrutura_condicional;

public class NotaAluno_OperadorTernario {

	public static void main(String[] args) {
		int nota = 7;

		String resposta = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";

		System.out.println(resposta);
	}

}
