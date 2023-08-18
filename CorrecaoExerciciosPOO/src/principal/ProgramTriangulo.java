package principal;

import java.util.Scanner;

import entities.Triangulo;

public class ProgramTriangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Triangulo triangulo = new Triangulo();
		
		System.out.println("Entre com o valor do lado A: ");
		triangulo.ladoA = sc.nextInt();
		
		System.out.println("Entre com o valor do lado B: ");
		triangulo.ladoB = sc.nextInt();
		
		System.out.println("Entre com o valor do lado C: ");
		triangulo.ladoC = sc.nextInt();
		
		triangulo.obterTipoTriangulo();
		
		
			
		sc.close();
		

	}

}
