package principal;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite o valor em reais: ");
	        double valorEmReais = scanner.nextDouble();

	        System.out.println("Digite a cota��o atual do d�lar: ");
	        double cotacaoDolar = scanner.nextDouble();

	        double valorEmDolares = converterReaisParaDolares(valorEmReais, cotacaoDolar);
	        System.out.println("O valor em d�lares �: $" + valorEmDolares);

	        System.out.println("Digite o valor em d�lares: ");
	        double valorEmDolares2 = scanner.nextDouble();

	        double valorEmReais2 = converterDolaresParaReais(valorEmDolares2, cotacaoDolar);
	        System.out.println("O valor em reais �: R$" + valorEmReais2);

	        scanner.close();
	    }

	    public static double converterReaisParaDolares(double valorEmReais, double cotacaoDolar) {
	        return valorEmReais / cotacaoDolar;
	    }

	    public static double converterDolaresParaReais(double valorEmDolares, double cotacaoDolar) {
	        return valorEmDolares * cotacaoDolar;
	}

}
