package principal;

import java.util.Scanner;

public class ContraCheques {

	public static void main(String[] args) {
		//Atividade 2
		
		Scanner sc = new Scanner(System.in);
		
		String nome;
		double salarioBruto = 0;
		double totalVendas = 0;
		double inss = 0.05;
		double irpf = 0.11;
		
		System.out.println("Entre com o nome do funcionário: ");
		nome = sc.nextLine();
		
		System.out.println("Entre com o salario do funcionario: ");
		salarioBruto = sc.nextDouble();
		
		System.out.println("Entre com o total das vendas do funcionario: ");
		totalVendas = sc.nextDouble();
		
		double descontos = calcularDescontos(salarioBruto, inss, irpf); //esses são meus static repare bem.
		double comissao = calcularComissao(totalVendas);
		double salarioLiquido = salarioBruto - descontos + comissao;
		System.out.println("*********************");
		System.out.println("Funcionário: " + nome);
		System.out.println("Salario Bruto: " + salarioBruto);
		System.out.println("Total de vendas do mes: " + totalVendas);
		System.out.println("Descontos do mes: " + descontos);
		System.out.println("Comissão do mes: " + comissao);
		System.out.println("comissão do mes: " + salarioLiquido);
		if (totalvendas < 1000) {
			System.out.printl("Continua tentando");
			
		}
		
		sc.close();

	}
	
	static double calcularDescontos(double salarioB, double inss, double irpf) {
		return(salarioB * inss) + (salarioB * irpf);
	}
	
	static double calcularComissao(double totalVendas) {
		double bonificacao = 0;
		
		if(totalVendas > 20000) {
			bonificacao = totalVendas * 0.05;
		}else if(totalVendas > 1500) {
			bonificacao = totalVendas * 0.03;
		}else if(totalVendas > 10000) {
			bonificacao = totalVendas * 0.01;
		}else {
			bonificacao = 0;
		}
		return bonificacao;
	}
	
	

}
