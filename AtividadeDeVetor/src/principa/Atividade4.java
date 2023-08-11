package principa;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		// Ler um vetor Q de 20 posi��es (aceitar somente n�meros positivos), 
		//caso n�o atenda a condi��o deve informar novamente o 
		//numero at� que a condi��o seja aceita, ao final mostre os n�meros inseridos no vetor e a soma deles.
		
		//Neste exemplo, os coment�rios indicam as etapas da l�gica:

			//Cria��o do vetor Q de tamanho 20.
			//Para cada posi��o do vetor:
			//a. Leitura de um n�mero e verifica��o se � positivo.
			//b. Armazenamento do n�mero no vetor e atualiza��o da soma.
			//Exibi��o dos n�meros inseridos no vetor e da soma.

		Scanner scanner = new Scanner(System.in);

        int[] Q = new int[20];
        int soma = 0;

        for (int i = 0; i < Q.length; i++) {
            // Ler um n�mero
            System.out.print("Digite um n�mero positivo: ");
            int numero = scanner.nextInt();

            // Verificar se o n�mero � positivo
            while (numero <= 0) {
                System.out.println("N�mero inv�lido. O n�mero deve ser positivo.");
                System.out.print("Digite um n�mero positivo novamente: ");
                numero = scanner.nextInt();
            }

            // Armazenar o n�mero no vetor
            Q[i] = numero;

            // Somar o n�mero � vari�vel de soma
            soma += numero;
        }

        // Exibir os n�meros inseridos no vetor
        System.out.print("N�meros inseridos no vetor: ");
        for (int num : Q) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Exibir a soma dos n�meros
        System.out.println("Soma dos n�meros: " + soma);

        scanner.close();
	}

}
