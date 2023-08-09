package principal;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class IntervaloEntreOsNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int num1 = 0;
		int num2 = 0;
		
		System.out.print("Entre com o primeiro numero: ");
		num1 = sc.nextInt();
		
		System.out.print("Entre com o segundo numero: ");
		num2 = sc.nextInt();
		
		for(int contador = ++num1; contador < num2; contador++) {
			System.out.println(contador);			
		}
		
		
		sc.close();
	}

}
