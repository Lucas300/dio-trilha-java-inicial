package Anatomia_das_classes.Tratamento_de_Excecoes;

public class Tratamento_Excecoes {

	//Criando minha propria exceção CepInvalidoExcecao que extends de Exception
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		try {
			String cepFormatado = formatarCep("2366506");
		} catch (CepInvalidoException e) {
			System.out.println("O cep não corresponde com as regras de negocio");
		}
	}
	static String formatarCep(String cep) throws CepInvalidoException{
		if(cep.length() != 8) {
			throw new CepInvalidoException();
		}
			return "23.765-064";
	}

}
