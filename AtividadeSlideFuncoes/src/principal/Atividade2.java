package principal;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o salário base do vendedor: ");
        double salarioBase = scanner.nextDouble();

        System.out.println("Digite a quantidade total de vendas no mês: ");
        double vendasTotal = scanner.nextDouble();

        double salarioMes = calcularSalario(salarioBase, vendasTotal);

        System.out.println("O salário do mês é: R$" + salarioMes);

        scanner.close();
    }

    public static double calcularSalario(double salarioBase, double vendasTotal) {
        double bonificacao = calcularBonificacao(vendasTotal);

        double salarioBruto = salarioBase + bonificacao;

        double inss = salarioBruto * 0.05;
        double irpf = salarioBruto * 0.11;

        double salarioLiquido = salarioBruto - inss - irpf;

        return salarioLiquido;
    }

    public static double calcularBonificacao(double vendasTotal) {
        if (vendasTotal > 20000) {
            return vendasTotal * 0.05;
        } else if (vendasTotal >= 15000 && vendasTotal <= 20000) {
            return vendasTotal * 0.03;
        } else if (vendasTotal >= 10000 && vendasTotal < 15000) {
            return vendasTotal * 0.01;
        } else {
            System.out.println("Continue se esforçando! Você pode alcançar melhores resultados.");
            return 0;
        	}

    	}
    }
