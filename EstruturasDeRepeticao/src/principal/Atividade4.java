package principal;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		//Fa�a um programa que receba dois n�meros 
		//inteiros e gere os n�meros inteiros que est�o no intervalo compreendido por eles.
		   Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o primeiro n�mero inteiro: ");
	        int numero1 = scanner.nextInt();

	        System.out.print("Digite o segundo n�mero inteiro: ");
	        int numero2 = scanner.nextInt();

	        System.out.println("N�meros no intervalo entre " + numero1 + " e " + numero2 + ":");

	        if (numero1 <= numero2) {
	            for (int i = numero1; i <= numero2; i++) {
	                System.out.print(i + " ");
	            }
	        } else {
	            for (int i = numero1; i >= numero2; i--) {
	                System.out.print(i + " ");
	            }
	        }

	        scanner.close();
		

	}

}
