package principal;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		//Fa�a um programa que entre com um n�mero e indique se ele � impar ou par;

		  Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite um n�mero: ");
	        int numero = scanner.nextInt();

	        if (numero % 2 == 0) {
	            System.out.println("O n�mero � par.");
	        } else {
	            System.out.println("O n�mero � �mpar.");
	        }

	        scanner.close();
	}

}
