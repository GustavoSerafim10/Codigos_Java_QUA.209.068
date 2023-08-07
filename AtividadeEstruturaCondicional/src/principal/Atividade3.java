package principal;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		//Faça um programa que leia dois números e imprima o maior deles;
		//Configure em java.
		//Utilizando else, if
		
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o primeiro número: ");
	        int numero1 = scanner.nextInt();

	        System.out.print("Digite o segundo número: ");
	        int numero2 = scanner.nextInt();

	        if (numero1 > numero2) {
	            System.out.println("O maior número é: " + numero1);
	        } else if (numero2 > numero1) {
	            System.out.println("O maior número é: " + numero2);
	        } else {
	            System.out.println("Os números são iguais.");
	        }

	        scanner.close();

	}

}
