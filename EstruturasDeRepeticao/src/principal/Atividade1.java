package principal;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		//Faça um programa que peça uma nota, entre zero e dez. 
		//Mostre uma mensagem caso o valor seja inválido 
		//e continue pedindo até que o usuário informe um valor válido.

		Scanner scanner = new Scanner(System.in);
        double nota;

        do {
            System.out.print("Informe uma nota entre zero e dez: ");
            nota = scanner.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("Valor inválido! A nota deve estar entre zero e dez.");
            }
        } while (nota < 0 || nota > 10);

        System.out.println("Nota válida informada: " + nota);

        scanner.close();

	}

}
