package Principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> nomes = new ArrayList<>();
		
		for(int i = 0; i<5; i++) {
			System.out.println("Digite o nome " + (i + 1) + " : ");
			String nome = sc.nextLine();
			nomes.add(nome);
				}
		Collections.sort(nomes);
		
		System.out.println("Nomes ordem alfabética: ");
		for(String nome : nomes) {
			System.out.println(nome);
		}

	}

}
