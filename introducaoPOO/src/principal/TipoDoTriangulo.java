package principal;

import java.util.Scanner;

import entities.Triangulo;

public class TipoDoTriangulo {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do lado A: ");
        double ladoA = scanner.nextDouble();

        System.out.print("Digite o valor do lado B: ");
        double ladoB = scanner.nextDouble();

        System.out.print("Digite o valor do lado C: ");
        double ladoC = scanner.nextDouble();

        Triangulo triangulo = new Triangulo(ladoA, ladoB, ladoC);

        String tipoTriangulo = triangulo.verificarTipo();

        System.out.println("O triângulo é do tipo: " + tipoTriangulo);

        scanner.close();
    }

	}


