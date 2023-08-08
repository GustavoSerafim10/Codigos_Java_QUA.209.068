package principal;

import java.io.PrintStream;

public class EstruturasRepeticao {

	public static void main(String[] args) {
		
		/*
		 * Uma estrutura de repeti��o
		 * repete determinado bloco de codigo enquanto
		 * uma condi��o for satisfeita
		 * Abaixo algumas:
		 */

		//for = at�; Utilizado quando sabemos
		//a quantidade de vezes que ser� necess�rio repetir o bloco
		//abaixo a sua sintaxe
		
		for(int contador = 0; contador < 10; contador++) {
			System.out.println("Contador est� valendo: " + contador);
		}
		
		
		/*While = enquanto
		 * geralmente usado quando n�o sabemos a quantidade de vezes que ser�
		 * executado determinado comando
		 * Abaixo sua sintaxe:
		 */
	
	
		int contador = 0;
		char opcao;
		
		System.out.println("Desejar entrar no loop s/n");
		opcao = leia.next().charAt(0);
		
		while(opcao == 's') {
			System.out.println("Contador valendo: " + contador);
			contador++;
			System.out.println("Deseja continaur no loop s/n");
			opcao = leia.next().charAt(0);
		}
		
		/*do while = fa�a enqunato
		 * executa pelo menos 1 vez, temos a garantia de que ser�
		 * executado ao menos uma vez
		 */
		
		PrintStream leia;
		do {
			System.out.println("Contador valendo: " + contador);
			contador++;
			System.out.println("Deseja continuar no loop s/n");
			opcao = leia.next().charAt(0);
			}while(opcao == 's');
		
		leia.close();
		
	}
		
	
	


