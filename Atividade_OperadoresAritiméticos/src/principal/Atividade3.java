package principal;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Atividade3 {

	public static void main(String[] args) {
		
		//Fa�a um Programa que pergunte quanto voc� ganha por hora e o n�mero de horas trabalhadas no m�s.
		// E Calcule e mostre o total do seu sal�rio no referido m�s (sem descontos e impostos).
		
		//Quanto ganho por hora No caso trampo 8hr = 
		//Quanto ganho = 
		//Numero de horas = 
		//Total do sal�rio = 
		
		Scanner leia = new Scanner(System.in);
		
		double salario = 0;
		int hora = 180;
		double soma = (salario*8);
						
		System.out.println("Quanto ganho por horas trabalhadas: ");
		salario = leia.nextDouble();
		
		System.out.println("Quantas horas trabalho no mes: ");
		hora = leia.nextInt();
		
		soma = salario*180;
				
		System.out.println("Qual resultado do meu salario total: " + soma);
		
		
		leia.close();
		


	}

}
