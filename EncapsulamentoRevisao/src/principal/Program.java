package principal;

import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		Produto produto = new Produto();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o nome do produto: ");
		String nome = sc.nextLine();
		
		System.out.println("Entre com o preço do produto: ");
		produto.setPreco(sc.nextDouble());
		
		produto.setNome(nome); 
		produto.setPreco(1.99);
		produto.adicionarQuantidade(10);
		
		produto.mostrarEstoque();
		
		produto.mostrarEstoque();
		
		produto.removerQuantidade(5);
		
		produto.mostrarEstoque();
	}

}
