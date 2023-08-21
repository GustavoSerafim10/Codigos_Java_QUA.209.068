package principal;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import entities.Produto;

public class ProgramJavaProduto {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Map<String, Produto> estoque = new HashMap<>();

        while (true) {
            System.out.println("===== Menu de Estoque =====");
            System.out.println("1. Adicionar Produto");
            System.out.println("2. Mostrar Estoque e Valor Total");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int escolha = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (escolha) {
                case 1:
                    System.out.print("Digite o nome do produto: ");
                    String nomeProduto = scanner.nextLine();

                    System.out.print("Digite o preço do produto: ");
                    double precoProduto = scanner.nextDouble();

                    System.out.print("Digite a quantidade do produto: ");
                    int quantidadeProduto = scanner.nextInt();

                    Produto produto = new Produto(nomeProduto, precoProduto, quantidadeProduto);
                    estoque.put(nomeProduto, produto);

                    System.out.println("Produto adicionado ao estoque!");
                    break;
                case 2:
                    double valorTotalEstoque = 0.0;
                    System.out.println("===== Estoque =====");
                    for (Produto p : estoque.values()) {
                        System.out.println("Produto: " + p.getNome());
                        System.out.println("Preço: " + p.getPreco());
                        System.out.println("Quantidade: " + p.getQuantidade());
                        System.out.println("Valor Total: " + p.calcularValorTotal());
                        System.out.println();
                        valorTotalEstoque += p.calcularValorTotal();
                    }
                    System.out.println("Valor Total do Estoque: " + valorTotalEstoque);
                    break;
                case 3:
                    System.out.println("Saindo do programa...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Escolha novamente.");
            }
        }
    }
}
