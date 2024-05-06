package Anatomia_das_classes.Estrutura_Repetitiva;

public class For_Arrays {

	public static void main(String[] args) {
		String[] alunos = {"Lucas","Marta","Diogo","Marcelo"};
		
		for (int i = 0; i < alunos.length; i++) {
			System.out.println("Aluno "+(i+1)+"º :"+alunos[i]);
		}
		
		System.out.println();
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}

	}

}
