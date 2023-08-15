package principal;

import java.util.Scanner;

public class CalcularMetroQuadrado {

	public static void main(String[] args) {

		/*crie um programa que receba os valores de largura e comprimento do teren
		 * informma quantos metros ele tem 
		 * Utilize função
		 */
		
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite a largura do terreno em metros: ");
	        double largura = scanner.nextDouble();

	        System.out.println("Digite o comprimento do terreno em metros: ");
	        double comprimento = scanner.nextDouble();

	        double area = calcularAreaTerreno(largura, comprimento);

	        System.out.println("A área do terreno é: " + area + " metros quadrados");

	        scanner.close();
	    }

	    public static double calcularAreaTerreno(double largura, double comprimento) {
	        return largura * comprimento;
	 }

}
