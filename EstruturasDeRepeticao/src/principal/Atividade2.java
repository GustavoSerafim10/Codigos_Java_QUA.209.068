package principal;

public class Atividade2 {

	public static void main(String[] args) {
		//Fa�a um programa que imprima na tela os n�meros de 1 a 20, 
		//um abaixo do outro. Depois modifique o programa para que ele mostre os n�meros um ao lado do outro.
		

		 System.out.println("N�meros de 1 a 20 um abaixo do outro:");
	        for (int i = 1; i <= 20; i++) {
	            System.out.println(i);
	        }
	        
	        System.out.println("N�meros de 1 a 20 um ao lado do outro:");
	        for (int i = 1; i <= 20; i++) {
	            System.out.print(i + " ");
	        }
	}

}
