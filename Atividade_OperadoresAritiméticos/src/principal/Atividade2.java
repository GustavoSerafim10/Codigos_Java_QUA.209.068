package principal;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		
		//Faça um Programa que peça as 4 notas bimestrais e mostre a média.
		
		Scanner leia = new Scanner(System.in);
		
		double nota1 = 0;
		double nota2 = 0;
		double nota3 = 0;
		double nota4 = 0;
		double soma = nota1 + nota2 + nota3 + nota4;
		double total = (soma/4);
				
										
		System.out.println("Nota do meu primeiro bimestre: ");
		nota1 = leia.nextDouble();
		
		System.out.println("Nota do meu segundo bimestre: ");
		nota2 = leia.nextDouble();
		
		System.out.println("Nota do meu terceiro bimestre: ");
		nota3 = leia.nextDouble();
		
		System.out.println("Nota do meu quarto bimestre: ");
		nota4 = leia.nextDouble();
		
		soma = nota1 + nota2 + nota3 + nota4; 
		total = (soma/4);
		
		System.out.println("Resultado dos 4 bimestres: " + total);
		
				

	
		leia.close();
		
		
	}

}
