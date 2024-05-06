package Anatomia_das_classes.Estrutura_condicional;

public class Tamanhos_Switch_Case {

	public static void main(String[] args) {
		String sigla = "p".toUpperCase();
		switch (sigla) {
		case "P":
			System.out.println("Pequeno");
			break;
		case "M":
			System.out.println("Médio");
			break;
		case "G":
			System.out.println("Grande");
		default:
			System.out.println("indefinido");
			break;
		}

	}

}
