package principal;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		//Fa�a um programa que leia dois n�meros e imprima o maior deles;
		//Configure em java.
		//Utilizando else, if
		
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o primeiro n�mero: ");
	        int numero1 = scanner.nextInt();

	        System.out.print("Digite o segundo n�mero: ");
	        int numero2 = scanner.nextInt();

	        if (numero1 > numero2) {
	            System.out.println("O maior n�mero �: " + numero1);
	        } else if (numero2 > numero1) {
	            System.out.println("O maior n�mero �: " + numero2);
	        } else {
	            System.out.println("Os n�meros s�o iguais.");
	        }

	        scanner.close();

	}

}
