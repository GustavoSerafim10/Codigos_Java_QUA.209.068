package principal;

import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		// Ler um vetor Q de 20 posi��es (aceitar somente n�meros positivos), 
		//caso n�o atenda a condi��o deve informar novamente o 
		//numero at� que a condi��o seja aceita, ao final mostre os n�meros inseridos no vetor e a soma deles.
		
		Scanner leia = new Scanner(System.in);
		
		int[] numeros = new int[5];
		int soma = 0;
		
		//i = iterador mesmo que o contador
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Entre o numero: ");
			numeros[i] = leia.nextInt();
			while(numeros[i] < 0) {
			System.out.println("Numero inv�lido.");
			System.out.println("Entre o numero:");
			numeros[i] = leia.nextInt();
			}
			soma += numeros[i];
		}
			System.out.println("A soma dos numeros: " + soma);
			
			System.out.println("numeros digitados: ");
			for(int numero : numeros) {
				System.out.println(numero);
			}
			
			
		leia.close();	
	}

}
