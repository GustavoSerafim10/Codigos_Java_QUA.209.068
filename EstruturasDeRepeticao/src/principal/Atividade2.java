package principal;

public class Atividade2 {

	public static void main(String[] args) {
		//Faça um programa que imprima na tela os números de 1 a 20, 
		//um abaixo do outro. Depois modifique o programa para que ele mostre os números um ao lado do outro.
		

		 System.out.println("Números de 1 a 20 um abaixo do outro:");
	        for (int i = 1; i <= 20; i++) {
	            System.out.println(i);
	        }
	        
	        System.out.println("Números de 1 a 20 um ao lado do outro:");
	        for (int i = 1; i <= 20; i++) {
	            System.out.print(i + " ");
	        }
	}

}
