package principal;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		//Faça um programa que receba um operador (+, -, /, *) e um numero 
		//e mostre a tabuada conforme os dados de entrada 
		//(numero não pode ser maior que 10 e nem menor que 0)

		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um operador (+, -, /, *): ");
        char operador = scanner.next().charAt(0);

        if (operador != '+' && operador != '-' && operador != '/' && operador != '*') {
            System.out.println("Operador inválido. O programa será encerrado.");
            scanner.close();
            return;
        }

        System.out.print("Digite um número entre 0 e 10: ");
        int numero = scanner.nextInt();

        if (numero < 0 || numero > 10) {
            System.out.println("Número fora do intervalo permitido. O programa será encerrado.");
            scanner.close();
            return;
        }

        System.out.println("Tabuada do " + numero + " usando o operador " + operador + ":");

        for (int i = 1; i <= 10; i++) {
            int resultado = 0;

            if (operador == '+') {
                resultado = numero + i;
            } else if (operador == '-') {
                resultado = numero - i;
            } else if (operador == '*') {
                resultado = numero * i;
            } else if (operador == '/' && i != 0) {
                resultado = numero / i;
            }

            System.out.println(numero + " " + operador + " " + i + " = " + resultado);
        }

        scanner.close();
	}

}
