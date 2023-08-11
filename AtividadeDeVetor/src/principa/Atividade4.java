package principa;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		// Ler um vetor Q de 20 posições (aceitar somente números positivos), 
		//caso não atenda a condição deve informar novamente o 
		//numero até que a condição seja aceita, ao final mostre os números inseridos no vetor e a soma deles.
		
		//Neste exemplo, os comentários indicam as etapas da lógica:

			//Criação do vetor Q de tamanho 20.
			//Para cada posição do vetor:
			//a. Leitura de um número e verificação se é positivo.
			//b. Armazenamento do número no vetor e atualização da soma.
			//Exibição dos números inseridos no vetor e da soma.

		Scanner scanner = new Scanner(System.in);

        int[] Q = new int[20];
        int soma = 0;

        for (int i = 0; i < Q.length; i++) {
            // Ler um número
            System.out.print("Digite um número positivo: ");
            int numero = scanner.nextInt();

            // Verificar se o número é positivo
            while (numero <= 0) {
                System.out.println("Número inválido. O número deve ser positivo.");
                System.out.print("Digite um número positivo novamente: ");
                numero = scanner.nextInt();
            }

            // Armazenar o número no vetor
            Q[i] = numero;

            // Somar o número à variável de soma
            soma += numero;
        }

        // Exibir os números inseridos no vetor
        System.out.print("Números inseridos no vetor: ");
        for (int num : Q) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Exibir a soma dos números
        System.out.println("Soma dos números: " + soma);

        scanner.close();
	}

}
