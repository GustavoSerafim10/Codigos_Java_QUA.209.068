package principal;

import java.util.Scanner;

public class AtividadeDeDados {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
	//Vamos l� come�ar o exerc�cio do professor
		
		String jogador;
		int n�mero;
		double peso;
		char sexo;
		
		System.out.println("Digite o nome do Jogador:");
		jogador = leia.nextLine();
	
		System.out.println("Digite o n�mero do jogador:");
		n�mero = leia.nextInt();

		System.out.println("Digite o peso do Jogador:");
		peso = leia.nextDouble();
		
		System.out.println("Digite o sexo do jogador (m/f):");
		sexo = leia.next().charAt(0);
		
		//Agora ser� imprimidas na tela
		
		System.out.println("O nome do jogador digitado foi:" + jogador);
		System.out.println("Qual o n�mero do jogador:" + n�mero);
		System.out.println("Qual o peso do jogador:" + peso);
		System.out.println("Qual o sexo do jogador:" + sexo);
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		leia.close();
	}

}
