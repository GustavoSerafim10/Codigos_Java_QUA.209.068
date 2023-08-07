package principal;

import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
		//Uma empresa tem gastos mensais e a cada 3 meses realiza um balanço para verificar
		//a media de gastos dos 3 meses. Faça um programa que receba os valores de cada mês
		//e imprima na tela o valor total gasto no período e a media dos gastos.

		Scanner leia = new Scanner(System.in);
		
		int mes1 = 0;
		int mes2 = 0;
		int mes3 = 0;
		double soma = mes1 + mes2 + mes3;
		double total = (soma/3);
						
		System.out.println("Quanto foi gasto no primeiro mes: ");
		mes1 = leia.nextInt();
		
		System.out.println("Quanto foi gasto no segundo mes: ");
		mes2 = leia.nextInt();
		
		System.out.println("Quanto foi gasto no segundo mes: ");
		mes3 = leia.nextInt();
		
		soma = mes1 + mes2 + mes3;
		total = (soma/3);
		
		System.out.println("Qual foi o valor total dos gastos diante os 3 meses: " + soma);
		

		System.out.println("Qual foi a media dos gastos: " +  total);
		
		
		
		
		
		
		
		
		leia.close();
		
	}

}
