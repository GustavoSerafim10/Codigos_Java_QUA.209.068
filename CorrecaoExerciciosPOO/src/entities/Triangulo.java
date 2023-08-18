package entities;

public class Triangulo {
	
	public int ladoA;
	public int ladoB;
	public int ladoC;
	
	public void obterTipoTriangulo() {
		if(ladoA == ladoB && ladoA == ladoC) {
			System.out.println("Triângulo Equilatero");
		}else if(ladoA == ladoB || ladoA != ladoC || ladoB == ladoC) {
			System.out.println("Triangulo isóceles");
		}else {
			System.out.println("Triangulo escaleno");
		}
	}

}
