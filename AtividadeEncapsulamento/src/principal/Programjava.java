package principal;

import java.util.Scanner;

import entities.Carro;

public class Programjava {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o modelo do carro: ");
	        String modelo = scanner.nextLine();

	        System.out.print("Digite o ano do carro: ");
	        int ano = scanner.nextInt();
	        scanner.nextLine(); // Limpar o buffer

	        System.out.print("Digite a cor do carro: ");
	        String cor = scanner.nextLine();

	        System.out.print("Digite o motor do carro: ");
	        String motor = scanner.nextLine();

	        System.out.print("Digite o câmbio do carro: ");
	        String cambio = scanner.nextLine();

	        Carro carro = new Carro(modelo, ano, cor, motor, cambio);

	        System.out.println("\nCarro criado:");
	        System.out.println("Modelo: " + carro.getModelo());
	        System.out.println("Ano: " + carro.getAno());
	        System.out.println("Cor: " + carro.getCor());
	        System.out.println("Motor: " + carro.getMotor());
	        System.out.println("Câmbio: " + carro.getCambio());

	        System.out.print("\nAcelerando o carro... Digite o valor do incremento de velocidade: ");
	        int incremento = scanner.nextInt();
	        carro.acelerar(incremento);
	        System.out.println("Nova velocidade: " + carro.getVelocidade());

	        System.out.print("Freando o carro... Digite o valor do decremento de velocidade: ");
	        int decremento = scanner.nextInt();
	        carro.frear(decremento);
	        System.out.println("Nova velocidade: " + carro.getVelocidade());

	        scanner.close();
	    }
	}
