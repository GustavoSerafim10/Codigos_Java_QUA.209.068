package atividade2;

import java.util.Scanner;

public class AtividadeDeDados1 {

	public static void main(String[] args) {
		//Fa�a um programa que pe�a um n�mero e ent�o mostre a mensagem 0 n�mero informado foi

		
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite um n�mero: ");
	        int numero = scanner.nextInt();

	        System.out.println("O n�mero informado foi " + numero);

	        scanner.close();
	}

}
