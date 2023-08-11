package principa;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		// Um posto est� vendendo combust�veis com a seguinte tabela de descontos:
		//at� 20 litros, desconto de 3% por litro �lcool
		//acima de 20 litros, desconto de 5% por litro
		//at� 20 litros, desconto de 4% por litro Gasolina
		//acima de 20 litros, desconto de 6% por litro
		
		//Escreva um algoritmo que leia o n�mero de litros vendidos e o tipo de combust�vel
		//(codificado da
		//seguinte forma: A-�lcool, G-gasolina), calcule e imprima o 
		//valor a ser pago pelo cliente sabendo-se
		//que o pre�o do litro da gasolina � R$ 5,80 e o pre�o do litro do �lcool � R$ 3,90. 
		
		
		//Abaixo foi feito o seguinte:
		//Leitura do tipo de combust�vel (A-�lcool ou G-gasolina).
		//Leitura do n�mero de litros vendidos.
		//Defini��o do pre�o por litro e c�lculo do desconto de acordo com o tipo de combust�vel.
		//C�lculo do valor total a ser pago pelo cliente.

		Scanner scanner = new Scanner(System.in);

        // Leitura do tipo de combust�vel (A-�lcool ou G-gasolina)
        System.out.print("Digite o tipo de combust�vel (A-�lcool ou G-gasolina): ");
        char tipoCombustivel = scanner.next().charAt(0);

        // Leitura do n�mero de litros vendidos
        System.out.print("Digite o n�mero de litros vendidos: ");
        double litrosVendidos = scanner.nextDouble();

        double precoLitro = 0;
        double desconto = 0;

        // Definindo o pre�o por litro de acordo com o tipo de combust�vel
        if (tipoCombustivel == 'A' || tipoCombustivel == 'a') {
            precoLitro = 3.9; // Pre�o do litro do �lcool

            if (litrosVendidos <= 20) {
                desconto = litrosVendidos * 0.03; // 3% de desconto
            } else {
                desconto = litrosVendidos * 0.05; // 5% de desconto
            }
        } else if (tipoCombustivel == 'G' || tipoCombustivel == 'g') {
            precoLitro = 5.8; // Pre�o do litro da gasolina

            if (litrosVendidos <= 20) {
                desconto = litrosVendidos * 0.04; // 4% de desconto
            } else {
                desconto = litrosVendidos * 0.06; // 6% de desconto
            }
        } else {
            System.out.println("Tipo de combust�vel inv�lido.");
            scanner.close();
            return;
        }

        double valorTotal = (precoLitro * litrosVendidos) - desconto;

        System.out.println("Valor a ser pago pelo cliente: R$" + valorTotal);

        scanner.close();

	}

}
