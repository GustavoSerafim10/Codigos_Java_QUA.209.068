package principal;

public class Vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array = 5;
		int [] numeros = new int [array];
		
		numeros[0] = 10;
		numeros[1] = 20;
		numeros[2] = 30;
		numeros[3] = 40;
		numeros[4] = 50;
		System.out.println("Fora do for: " + numeros[0]);
		
		for(int contador = 0; contador <numeros.length; contador++);
		System.out.println("Dentro do for: " + numeros[array]);
		
		for(int numero: numeros) {
			System.out.println(numero);
		}
		
	}

}
