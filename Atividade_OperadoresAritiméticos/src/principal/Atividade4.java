package principal;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		//Fa�a um Programa que pe�a a temperatura em graus Fahrenheit, transforme e mostre
		// a temperatura em graus Celsius.
		
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite a temperatura em graus Fahrenheit: ");
	        double fahrenheit = scanner.nextDouble();

	        double celsius = 5 * ((fahrenheit - 32) / 9);

	        System.out.println("A temperatura em graus Celsius �: " + celsius);

	        scanner.close();


	}

}
