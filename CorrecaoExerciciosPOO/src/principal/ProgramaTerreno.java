package principal;

import java.util.Scanner;

import entities.Terreno;

public class ProgramaTerreno {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		Terreno terreno = new Terreno();
		
		System.out.println("Entre com a largura do terreno: ");
		terreno.largura = sc.nextDouble();
		
		System.out.println("Entre com o comprimento do terreno: ");
		terreno.comprimento = sc.nextDouble();
		
		System.out.println(terreno.obterMetroQuadrado());
		
		
		sc.close();

	}

}
