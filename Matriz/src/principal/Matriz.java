package principal;

public class Matriz {

	public static void main(String[] args) {
		//Uma ma triz é um vetor multidimnsional
		//Geralmente trabalhamos com 2 dimensões
		//Linha e coluna, parece uma tabela
		
		//Sua sintaxe:
		//São duas [] [] - ele indica a quantidade de Linhas e Colunas
		//int [] [] numeros = new int [3][3]
		
		//Os 2 últimos abre e fecha colchetes são
		//para indicar Linha e Coluna
		//no exemplo abaixo temos uma matriz 3 x 3
		int [][] numeros = new int [3][3]; //Linha e o 1° [] ... Coluna e o 2° []
		
		//vou mostrar um exemlo da matriz.. vou criar uma varíavel contador 
		int contador = 10;
		
		for(int i = 0; i < numeros.length; i++) {  //Esse 1° For acessa as colunas
			for(int j = 0; j < numeros.length; j++) { //Esse 2° For acessa as linhas
				numeros[i][j] = contador; //meu numeros na posição i e na J recebe contador
				System.out.print(numeros[i][j] + "\t"); // vou contatenar com uma tabulação \t
				contador++;
			}
			System.out.println();  //fiz só uma quebra de linha que dai ele já passa pra próxima..
		}
	}
}

	/*
	 * 1) Fazer uma matriz 3x3 ou 4x4, imprimir os numeros 
	 * da diagonal dessa matriz
	 * 2)Fazer uma matriz 4 x 4 para inserir nome e as 4 notas
	 * do aluno, não precisa mostrar a media.
	 * Imprima o nome e as notas
	 */
		
			
	