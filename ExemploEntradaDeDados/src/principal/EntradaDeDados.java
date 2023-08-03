package principal;

import java.util.Scanner;

public class EntradaDeDados {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int idade;
		double altura;
		char sexo;
		
		System.out.println("Por favor, digite seu nome");
		//Leitura de dados tipo string (Conjunto de Caracteres)
		//Fiz a leitura desse dado vou imprimir na tela
		nome = leia.nextLine();
		
		//Leitura de dados tipo INT (Conjunto de Caracteres)
		System.out.println("Digite a sua idade:");
		idade = leia.nextInt();
		
		//Leitura de dados tipo Double
		System.out.println("Digite a sua altura:");
		altura = leia.nextDouble();
		
		//Leitura de dados tipo Char
		//Está no indíce 0 para pegar a primeira posição.
		//E como se fosse binários tlg.. 0 1 2 3 4 5 6...
		System.out.println("Informe o seu sexo (m/f):");
		sexo = leia.next().charAt(0);
		
		
		//Aqui estão as minhas capturas para aparecerem lá em baixo que na tela no caso
		System.out.println("O nome digitado foi:" + nome);
		System.out.println("A idade digitada foi:" + idade);
		System.out.println("A altura digitada foi:" + altura);
		System.out.println("O sexo digitado foi" + sexo);
		
		
		
		leia.close();
		
	}

}
