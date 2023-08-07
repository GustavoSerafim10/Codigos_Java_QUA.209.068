package principal;

import java.util.Scanner;

public class Atividade7 {

	public static void main(String[] args) {
		//Faça um programa que leia 4 notas de um aluno e 
		//retorne a media, se media for menor que 6 está reprovado, 
		//se média ficar entre 6 e 7 recuperação, se a média estiver acima de 7 aprovado, 
		//se média for 10 aprovado com honras;
		
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite as quatro notas do aluno:");

	        double nota1 = scanner.nextDouble();
	        double nota2 = scanner.nextDouble();
	        double nota3 = scanner.nextDouble();
	        double nota4 = scanner.nextDouble();

	        double media = (nota1 + nota2 + nota3 + nota4) / 4;

	        System.out.println("Média: " + media);

	        if (media < 6) {
	            System.out.println("Situação: Reprovado");
	        } else if (media >= 6 && media < 7) {
	            System.out.println("Situação: Recuperação");
	        } else if (media >= 7 && media < 10) {
	            System.out.println("Situação: Aprovado");
	        } else if (media == 10) {
	            System.out.println("Situação: Aprovado com honras");
	        } else {
	            System.out.println("Situação: Média inválida");
	        }

	        scanner.close();



	}

}
