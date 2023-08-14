package principal;

public class Matriz {

	public static void main(String[] args) {
		//Uma ma triz � um vetor multidimnsional
		//Geralmente trabalhamos com 2 dimens�es
		//Linha e coluna, parece uma tabela
		
		//Sua sintaxe:
		//S�o duas [] [] - ele indica a quantidade de Linhas e Colunas
		//int [] [] numeros = new int [3][3]
		
		//Os 2 �ltimos abre e fecha colchetes s�o
		//para indicar Linha e Coluna
		//no exemplo abaixo temos uma matriz 3 x 3
		int [][] numeros = new int [3][3]; //Linha e o 1� [] ... Coluna e o 2� []
		
		//vou mostrar um exemlo da matriz.. vou criar uma var�avel contador 
		int contador = 10;
		
		for(int i = 0; i < numeros.length; i++) {  //Esse 1� For acessa as colunas
			for(int j = 0; j < numeros.length; j++) { //Esse 2� For acessa as linhas
				numeros[i][j] = contador; //meu numeros na posi��o i e na J recebe contador
				System.out.print(numeros[i][j] + "\t"); // vou contatenar com uma tabula��o \t
				contador++;
			}
			System.out.println();  //fiz s� uma quebra de linha que dai ele j� passa pra pr�xima..
		}
	}
}

	/*
	 * 1) Fazer uma matriz 3x3 ou 4x4, imprimir os numeros 
	 * da diagonal dessa matriz
	 * 2)Fazer uma matriz 4 x 4 para inserir nome e as 4 notas
	 * do aluno, n�o precisa mostrar a media.
	 * Imprima o nome e as notas
	 */
		
			
	