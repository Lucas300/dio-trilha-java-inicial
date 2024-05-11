package Anatomia_das_classes.desafio_de_Codigo;

import java.util.Scanner;

public class ChequeEspecial {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 

	    double saldo = scanner.nextDouble(); 
	    double saque = scanner.nextDouble(); 
	    double limiteChequeEspecial = 500; 
	    double resto = saque - saldo;

	    // TODO: Verifique se o saque não ultrapassa o saldo disponível na conta:
	    if(saldo>saque){
	      System.out.println("Transacao realizada com sucesso.");
	    }else if(resto>0 && resto <=500){
	      System.out.println("Transacao realizada com sucesso utilizando o cheque especial.");
	    }else{
	      System.out.println("Transacao nao realizada. Limite do cheque especial excedido.");
	    }

	    scanner.close();
	}
}
