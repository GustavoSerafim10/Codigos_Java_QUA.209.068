package principa;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		// Escreva um algoritmo para ler 2 valores e se algum dos valores
		//for zero não aceite, deve ser lido
		//um novo valor, imprimir o resultado da divisão do primeiro valor lido
		//pelo segundo valor lido. (utilize a estrutura de repetição que mais se adeque).

		
		
		//Neste exemplo, os comentários indicam as etapas da lógica:
		
		//Leitura do primeiro valor e verificação se é zero.
		//Leitura do segundo valor e verificação se é zero.
		//Cálculo da divisão e impressão do resultado.
		
		 Scanner scanner = new Scanner(System.in);

	        double valor1, valor2, resultado;

	        // Ler o primeiro valor
	        System.out.print("Digite o primeiro valor: ");
	        valor1 = scanner.nextDouble();

	        // Verificar se o primeiro valor é zero
	        while (valor1 == 0) {
	            System.out.println("Valor inválido. O valor não pode ser zero.");
	            System.out.print("Digite o primeiro valor novamente: ");
	            valor1 = scanner.nextDouble();
	        }

	        // Ler o segundo valor
	        System.out.print("Digite o segundo valor: ");
	        valor2 = scanner.nextDouble();

	        // Verificar se o segundo valor é zero
	        while (valor2 == 0) {
	            System.out.println("Valor inválido. O valor não pode ser zero.");
	            System.out.print("Digite o segundo valor novamente: ");
	            valor2 = scanner.nextDouble();
	        }

	        // Calcular a divisão
	        resultado = valor1 / valor2;

	        // Imprimir o resultado
	        System.out.println("Resultado da divisão: " + resultado);

	        scanner.close();
	}

}
