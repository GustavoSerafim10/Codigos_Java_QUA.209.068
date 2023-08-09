package principal;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		//Faça um programa que receba a 
		//altura de 10 pessoas e mostre a media da altura delas

		Scanner scanner = new Scanner(System.in);
        
        double somaAlturas = 0.0;
        int numeroPessoas = 10;
        
        for (int i = 1; i <= numeroPessoas; i++) {
            System.out.print("Digite a altura da pessoa " + i + " (em metros): ");
            double altura = scanner.nextDouble();
            somaAlturas += altura;
        }
        
        double mediaAlturas = somaAlturas / numeroPessoas;
        
        System.out.println("A média das alturas é: " + mediaAlturas + " metros");
        
        scanner.close();
	}

}
