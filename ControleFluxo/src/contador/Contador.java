package contador;

import java.util.Scanner;

import exceptions.ParametrosInvalidosException;

public class Contador {

	public static void main(String[] args)  {
		
		System.out.println("*** CONTROLE DE FLUXO ***");
		Scanner scanner = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("Digite o primeiro número");
		num1 = scanner.nextInt();
		
		System.out.println("Digite o segundo número");
		num2 = scanner.nextInt();
		
		try {
			contador(num1, num2);
		} catch (ParametrosInvalidosException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("O primeiro número informado deve ser maior que o segundo");
		}

	}
	
	public static void contador(int num1, int num2) throws ParametrosInvalidosException{
		
		if(num1 < num2) {
			throw new ParametrosInvalidosException();
		}
		
		int contagem = num1 - num2;
		
		for(int i=1; i <= contagem; i++) {
			System.out.println("Imprimindo número "+ i);
		}
	}

}
