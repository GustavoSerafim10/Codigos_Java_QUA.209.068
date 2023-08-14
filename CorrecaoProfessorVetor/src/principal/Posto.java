import java.util.Scanner;

public class Posto {

	public static void main(String[] args) {
		/*
		 * Um posto está vendendo combustíveis com a seguinte tabela de descontos:
até 20 litros, desconto de 3% por litro Álcool
acima de 20 litros, desconto de 5% por litro
até 20 litros, desconto de 4% por litro Gasolina
acima de 20 litros, desconto de 6% por litro
Escreva um algoritmo que leia o número de litros vendidos e o tipo de combustível (codificado da
seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se

		 */
		//Scanner para fazer a leitura dos dados que o usuário vai inserir
		Scanner leia = new Scanner("System.in");
		
		//criar variaveis para receber os valores dos combustiveis:
		double valorGasolina = 5.80;
		double valorAlcool = 3.90;
		
		//criar uma variavel para receber a quantidade de litros
		double quantidadedelitros = 0;
		
		//variavel para receber qual o tipo do combustivel
		char tipoCombustivel;
		
		//variavel total a pagar ja com o desconto
		double totalApagar = 0;
		
		
		//pedir para o usuário digitar a quantidade de litros
		//qual o tipo de combustivel, para saber o valor total a ser pago.
		//Fizemos abaixo também uma validação para que o usuário não digite um combustível inválido
		do {
		System.out.print("Entre com o Combustível (A/G");
		tipoCombustivel = leia.next().charAt(0);
		}while(Character.toUpperCase(tipoCombustivel) != 'A'
		&& Character.toUpperCase(tipoCombustivel) != 'G');
		
		//pedir a quantidade de litros que foram abastecidos
		//validar quantidade de Litros, não pode ser zero e nem negativo
		do {
		System.out.print("Quantos litros foram abastecidos? ");
		quantidadedelitros = leia.nextDouble();
		}while(quantidadedelitros <=0);
			
		//fazer o calculo do desconto com base da quantidade de litros
		//que foi abastecido e o tipo do combustível
		
		if(tipoCombustivel == 'G') {
			if(quantidadedelitros <= 20) {
			totalApagar =(quantidadedelitros * valorGasolina);
			totalApagar = totalApagar -(totalApagar * 0.04);
			System.out.println("Valor a ser pago com desconto: " + totalApagar);
			}else {
				totalApagar = (quantidadedelitros * valorGasolina);
				totalApagar = totalApagar -(totalApagar * 0.06);
				System.out.print("Valor a ser pago com desconto: " + totalApagar);
			}
		}
			if(tipoCombustivel == 'A') {
				if(quantidadedelitros <=20) {
					totalApagar = (quantidadedelitros * valorAlcool);
					totalApagar = (totalApagar - (totalApagar * 0.03));
					System.out.println("valor a ser pago com desconto: " + totalApagar);
					}else {
						totalApagar = (quantidadedelitros * valorAlcool);
						totalApagar = (totalApagar - (totalApagar *0.05));
						System.out.println("valor a ser pago com descontos: " + totalApagar);
							
				
					}
			}
		
		
		leia.close();
	}

}
