package principal;

import java.util.Scanner;

import entities.Usuario;

public class AnoDeNascimento {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite o seu nome: ");
	        String nome = scanner.nextLine();

	        System.out.print("Digite o ano de nascimento: ");
	        int anoNascimento = scanner.nextInt();

	        Usuario usuario = new Usuario(nome, anoNascimento);

	        int idade = usuario.calcularIdade();

	        System.out.println("Olá, " + nome + "! Sua idade atual é: " + idade + " anos");

	        scanner.close();

	}

}
