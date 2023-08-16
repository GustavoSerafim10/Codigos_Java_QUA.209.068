package principal;

import java.util.Scanner;

import entities.Terreno;

public class AreaDeTerreno {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o comprimento do terreno em metros: ");
	        double comprimento = scanner.nextDouble();

	        System.out.print("Digite a largura do terreno em metros: ");
	        double largura = scanner.nextDouble();

	        Terreno terreno = new Terreno(comprimento, largura);

	        double area = terreno.calcularArea();

	        System.out.println("A área do terreno é: " + area + " m²");

	        scanner.close();
	}

}
