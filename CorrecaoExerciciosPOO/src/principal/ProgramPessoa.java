package principal;

import java.util.Scanner;

import entities.Pessoa;

public class ProgramPessoa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			
		Pessoa pessoa = new Pessoa();
		
		System.out.println("Entre com o nome: ");
		pessoa.nome = sc.nextLine();
		
		System.out.println("Entre com o ano nascimento: ");
		pessoa.anoNascimento = sc.nextInt();
		
		pessoa.obterIdade();
				
		
		
		sc.close();

	}

}
