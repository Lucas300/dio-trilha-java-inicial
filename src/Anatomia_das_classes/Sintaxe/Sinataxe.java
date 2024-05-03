package Anatomia_das_classes.Sintaxe;

public class Sinataxe {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		String primeiroNome = "Lucas";
		String segundoNome = "Daniel";
		
		String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
		System.out.println(nomeCompleto);
	}
	public static String nomeCompleto(String primeiroNome,String segundoNome) {
		return primeiroNome.concat(" ").concat(segundoNome);
	}
}
