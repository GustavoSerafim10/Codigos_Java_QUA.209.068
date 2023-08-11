package principa;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		// Um posto está vendendo combustíveis com a seguinte tabela de descontos:
		//até 20 litros, desconto de 3% por litro Álcool
		//acima de 20 litros, desconto de 5% por litro
		//até 20 litros, desconto de 4% por litro Gasolina
		//acima de 20 litros, desconto de 6% por litro
		
		//Escreva um algoritmo que leia o número de litros vendidos e o tipo de combustível
		//(codificado da
		//seguinte forma: A-álcool, G-gasolina), calcule e imprima o 
		//valor a ser pago pelo cliente sabendo-se
		//que o preço do litro da gasolina é R$ 5,80 e o preço do litro do álcool é R$ 3,90. 
		
		
		//Abaixo foi feito o seguinte:
		//Leitura do tipo de combustível (A-álcool ou G-gasolina).
		//Leitura do número de litros vendidos.
		//Definição do preço por litro e cálculo do desconto de acordo com o tipo de combustível.
		//Cálculo do valor total a ser pago pelo cliente.

		Scanner scanner = new Scanner(System.in);

        // Leitura do tipo de combustível (A-álcool ou G-gasolina)
        System.out.print("Digite o tipo de combustível (A-álcool ou G-gasolina): ");
        char tipoCombustivel = scanner.next().charAt(0);

        // Leitura do número de litros vendidos
        System.out.print("Digite o número de litros vendidos: ");
        double litrosVendidos = scanner.nextDouble();

        double precoLitro = 0;
        double desconto = 0;

        // Definindo o preço por litro de acordo com o tipo de combustível
        if (tipoCombustivel == 'A' || tipoCombustivel == 'a') {
            precoLitro = 3.9; // Preço do litro do álcool

            if (litrosVendidos <= 20) {
                desconto = litrosVendidos * 0.03; // 3% de desconto
            } else {
                desconto = litrosVendidos * 0.05; // 5% de desconto
            }
        } else if (tipoCombustivel == 'G' || tipoCombustivel == 'g') {
            precoLitro = 5.8; // Preço do litro da gasolina

            if (litrosVendidos <= 20) {
                desconto = litrosVendidos * 0.04; // 4% de desconto
            } else {
                desconto = litrosVendidos * 0.06; // 6% de desconto
            }
        } else {
            System.out.println("Tipo de combustível inválido.");
            scanner.close();
            return;
        }

        double valorTotal = (precoLitro * litrosVendidos) - desconto;

        System.out.println("Valor a ser pago pelo cliente: R$" + valorTotal);

        scanner.close();

	}

}
