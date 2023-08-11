package principa;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		// Escreva um algoritmo para ler 2 valores e se algum dos valores
		//for zero n�o aceite, deve ser lido
		//um novo valor, imprimir o resultado da divis�o do primeiro valor lido
		//pelo segundo valor lido. (utilize a estrutura de repeti��o que mais se adeque).

		
		
		//Neste exemplo, os coment�rios indicam as etapas da l�gica:
		
		//Leitura do primeiro valor e verifica��o se � zero.
		//Leitura do segundo valor e verifica��o se � zero.
		//C�lculo da divis�o e impress�o do resultado.
		
		 Scanner scanner = new Scanner(System.in);

	        double valor1, valor2, resultado;

	        // Ler o primeiro valor
	        System.out.print("Digite o primeiro valor: ");
	        valor1 = scanner.nextDouble();

	        // Verificar se o primeiro valor � zero
	        while (valor1 == 0) {
	            System.out.println("Valor inv�lido. O valor n�o pode ser zero.");
	            System.out.print("Digite o primeiro valor novamente: ");
	            valor1 = scanner.nextDouble();
	        }

	        // Ler o segundo valor
	        System.out.print("Digite o segundo valor: ");
	        valor2 = scanner.nextDouble();

	        // Verificar se o segundo valor � zero
	        while (valor2 == 0) {
	            System.out.println("Valor inv�lido. O valor n�o pode ser zero.");
	            System.out.print("Digite o segundo valor novamente: ");
	            valor2 = scanner.nextDouble();
	        }

	        // Calcular a divis�o
	        resultado = valor1 / valor2;

	        // Imprimir o resultado
	        System.out.println("Resultado da divis�o: " + resultado);

	        scanner.close();
	}

}
