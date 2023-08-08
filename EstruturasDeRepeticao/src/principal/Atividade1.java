package principal;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		//Fa�a um programa que pe�a uma nota, entre zero e dez. 
		//Mostre uma mensagem caso o valor seja inv�lido 
		//e continue pedindo at� que o usu�rio informe um valor v�lido.

		Scanner scanner = new Scanner(System.in);
        double nota;

        do {
            System.out.print("Informe uma nota entre zero e dez: ");
            nota = scanner.nextDouble();

            if (nota < 0 || nota > 10) {
                System.out.println("Valor inv�lido! A nota deve estar entre zero e dez.");
            }
        } while (nota < 0 || nota > 10);

        System.out.println("Nota v�lida informada: " + nota);

        scanner.close();

	}

}
