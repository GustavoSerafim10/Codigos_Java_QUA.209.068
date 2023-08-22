package Principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Funcionario;
import entities.FuncionarioChefe;

public class Program {

	public static void main(String[] args) {
		class Main {
		    public void main(String[] args) {
		        List<Funcionario> funcionarios = new ArrayList<>();

		        Scanner scanner = new Scanner(System.in);
		        while (true) {
		            System.out.println("1. Cadastrar Funcionário");
		            System.out.println("2. Mostrar Dados");
		            System.out.println("3. Sair");
		            int opcao = scanner.nextInt();

		            if (opcao == 1) {
		                System.out.print("Nome do funcionário: ");
		                String nome = scanner.next();
		                System.out.print("Idade do funcionário: ");
		                int idade = scanner.nextInt();
		                System.out.print("Salário bruto do funcionário: ");
		                double salario = scanner.nextDouble();
		                System.out.print("Cargo (funcionário/chefe): ");
		                String cargo = scanner.next();

		                if (cargo.equalsIgnoreCase("chefe")) {
		                    funcionarios.add(new FuncionarioChefe(nome, idade, salario));
		                } else {
		                    funcionarios.add(new Funcionario(nome, idade, salario));
		                }

		                System.out.println("Funcionário cadastrado com sucesso!");
		            } else if (opcao == 2) {
		                for (Funcionario funcionario : funcionarios) {
		                    System.out.println("Nome: " + funcionario.getNome());
		                    System.out.println("Idade: " + funcionario.getIdade());
		                    System.out.println("Salário bruto: R$" + funcionario.getSalarioBruto());
		                    if (funcionario instanceof FuncionarioChefe) {
		                        double salarioComBonificacao = funcionario.calcularSalario();
		                        System.out.println("Salário com bonificação: R$" + salarioComBonificacao);
		                    }
		                    System.out.println("-------------------------");
		                }
		            } else if (opcao == 3) {
		                System.out.println("Saindo do programa...");
		                break;
		            } else {
		                System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
		            }
		        }

		        scanner.close();
		    }
		}

	}

}
