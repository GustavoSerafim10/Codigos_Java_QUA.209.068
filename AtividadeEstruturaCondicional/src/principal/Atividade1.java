package principal;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		//1)Faça um programa que peça para o usuário entrar com um ano 
		//e dizer se esse ano é bissexto ou não;
		
		Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite um ano: ");
	        int ano = scanner.nextInt();

	        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
	            System.out.println("O ano " + ano + " é bissexto.");
	        } else {
	            System.out.println("O ano " + ano + " não é bissexto.");
	        }

	        scanner.close();

	}

}
