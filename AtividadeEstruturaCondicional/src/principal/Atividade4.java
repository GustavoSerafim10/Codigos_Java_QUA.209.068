package principal;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		//Fa�a um programa que leia 3 n�meros e mostre o maior deles;
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro n�mero: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo n�mero: ");
        int numero2 = scanner.nextInt();

        System.out.print("Digite o terceiro n�mero: ");
        int numero3 = scanner.nextInt();

        int maiorNumero = numero1;

        if (numero2 > maiorNumero) {
            maiorNumero = numero2;
        }

        if (numero3 > maiorNumero) {
            maiorNumero = numero3;
        }

        System.out.println("O maior n�mero �: " + maiorNumero);

        scanner.close();

	}

}

