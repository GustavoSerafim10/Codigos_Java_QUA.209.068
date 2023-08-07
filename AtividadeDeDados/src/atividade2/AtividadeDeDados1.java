package atividade2;

import java.util.Scanner;

public class AtividadeDeDados1 {

	public static void main(String[] args) {
		//Faça um programa que peça um número e então mostre a mensagem 0 número informado foi

		
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite um número: ");
	        int numero = scanner.nextInt();

	        System.out.println("O número informado foi " + numero);

	        scanner.close();
	}

}
