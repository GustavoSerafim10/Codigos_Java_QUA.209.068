package principal;

import java.util.Scanner;

public class atividade5 {

	public static void main(String[] args) {
		//Fa�a um Programa que pe�a a temperatura em graus Celsius,
		//transforme e mostre em graus Fahrenheit.
		
		
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em graus Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("A temperatura em graus Fahrenheit �: " + fahrenheit);

        scanner.close();

	}

}
