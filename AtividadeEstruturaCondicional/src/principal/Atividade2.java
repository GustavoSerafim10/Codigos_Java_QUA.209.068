package principal;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		//Faça um programa que entre com um número e indique se ele é impar ou par;

		  Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite um número: ");
	        int numero = scanner.nextInt();

	        if (numero % 2 == 0) {
	            System.out.println("O número é par.");
	        } else {
	            System.out.println("O número é ímpar.");
	        }

	        scanner.close();
	}

}
