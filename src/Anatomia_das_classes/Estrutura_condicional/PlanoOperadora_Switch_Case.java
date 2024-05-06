package Anatomia_das_classes.Estrutura_condicional;

public class PlanoOperadora_Switch_Case {

	public static void main(String[] args) {
		String plano = "MIDIA";
		switch (plano) {
		case "TURBO":
			System.out.println(" 5GB de Youtube ");
		case "MIDIA":
			System.out.println("Whats e Instagram grátis");
		case "BASIC":
			System.out.println("100 minutos de ligação");
			//podemos usar o break
			//e podemos usar o default caso não seja nenhuma das opções 
			//podemos usar o continue
		}

	}

}
