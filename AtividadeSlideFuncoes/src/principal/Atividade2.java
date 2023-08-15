package principal;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o sal�rio base do vendedor: ");
        double salarioBase = scanner.nextDouble();

        System.out.println("Digite a quantidade total de vendas no m�s: ");
        double vendasTotal = scanner.nextDouble();

        double salarioMes = calcularSalario(salarioBase, vendasTotal);

        System.out.println("O sal�rio do m�s �: R$" + salarioMes);

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
            System.out.println("Continue se esfor�ando! Voc� pode alcan�ar melhores resultados.");
            return 0;
        	}

    	}
    }
