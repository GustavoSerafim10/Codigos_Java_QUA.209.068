package principal;

import java.util.ArrayList;
import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		
		String nome = "chiclete";
		int quantidade = 15;
		double preco = 6.00;
				
		//tem que botar ele na sequeencia e certinha
		Produto produto = new Produto(nome, quantidade, preco);
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Produto> produtos = new ArrayList<>();
	
		for(int i = 1; i < 4; i++) {
		
			   Produtos = new produto();
			
			System.out.println("Entre com o nome do produto:");
			produto.setNome(sc.nextLine());
		
			System.out.println("Entre com a quantidade:");
			produto.setQuantidade(sc.nextInt());
		
			System.out.println(produto.getPreco());
		    produto.setPreco(sc.nextDouble());

		produtos.add(produto);
		}
		System.out.println(produtos);
}
}

