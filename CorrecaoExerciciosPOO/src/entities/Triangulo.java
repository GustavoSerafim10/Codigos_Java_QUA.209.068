package entities;

public class Triangulo {
	
	public int ladoA;
	public int ladoB;
	public int ladoC;
	
	public void obterTipoTriangulo() {
		if(ladoA == ladoB && ladoA == ladoC) {
			System.out.println("Tri�ngulo Equilatero");
		}else if(ladoA == ladoB || ladoA != ladoC || ladoB == ladoC) {
			System.out.println("Triangulo is�celes");
		}else {
			System.out.println("Triangulo escaleno");
		}
	}

}
