package principal;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		//1)Fa�a um programa que pe�a para o usu�rio entrar com um ano 
		//e dizer se esse ano � bissexto ou n�o;
		
		Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite um ano: ");
	        int ano = scanner.nextInt();

	        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
	            System.out.println("O ano " + ano + " � bissexto.");
	        } else {
	            System.out.println("O ano " + ano + " n�o � bissexto.");
	        }

	        scanner.close();

	}

}
