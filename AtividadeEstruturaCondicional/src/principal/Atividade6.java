package principal;

import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
		//Faça um programa que receba o sexo de uma pessoa e imprima na tela o sexo digital
		
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o sexo (M para masculino, F para feminino): ");
	        char sexo = scanner.next().charAt(0);

	        if (sexo == 'M' || sexo == 'm') {
	            System.out.println("Sexo: Masculino");
	        } else if (sexo == 'F' || sexo == 'f') {
	            System.out.println("Sexo: Feminino");
	        } else {
	            System.out.println("Sexo desconhecido");
	        }

	        scanner.close();

	}

}
