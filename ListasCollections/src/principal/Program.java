package principal;

import java.util.ArrayList;
import java.util.Collections;

public class Program {

	public static void main(String[] args) {
		/*
		 * listas trabalham com dados do mesmo tipo ( coleção de dados em si né )
		 * Ou seja - lista de string só pode ter string... dai por diante..
		 * Uma lista é um tipo genérico de uma collection ( É uma coleção de dados)
		 * Sua sintaxe = ArrayList<>  (esse <> e um tipo dele tlg)
		 * Não tem obrigação de botar uma quantidade dentro dela tlg..
		 */
		
		//Vamos fazer uma lista abaixo:
		//Temos que importar em
		ArrayList<String> nomes = new ArrayList<>();
		
		//para adicioar um dado e mais "tranquilO"
		String nome1 = "adicionado por ultimo"; //Lembrando que essa e uma String
		
		nomes.add("Gustavo");
		nomes.add("Julia");
		nomes.add("Maria");
		nomes.add("Jose");
		nomes.add(nome1); //essa e uma variável que contem o dado
		
		System.out.println(nomes);
		
		//Aa quero imprimir o nome adicionado por último..
		System.out.println(nomes.get(4)); //esse (4) e o índice, dai vai imprimir o último tlg
		
		//Posso remover os indicies conforme lees tbm..
		nomes.remove(1);
		
		System.out.println(nomes);
		
		//Na lsita tem algumas variáveis que usamos mais.. tipo ForEach.. vamos ver algumas
		
		System.out.println("Imprimindo com forEach: ");
		for(String nome : nomes) {
			System.out.println(nomes);
		}
		//Com listas utilizamos o size.
		System.out.println("Imprimindo com for: ");
		for(int i = 0; i < nomes.size(); i++) {
			System.out.println(nomes.get(i));
		}
		//tem outra forma também sem ser com o for tlg
		//vamos passar uma expressão do que ela vai fazer e até quando
		System.out.println("Imprimindo com expressão lamda");
		//Para cada nome contido na minha lista de nome eu imprimo o nome.. e isso abaixo:
		nomes.forEach(nome -> System.out.println(nome));
		
		//Mais legal de lista que conseguimos imprimir ela de forma ordenada
		//Utilizamos o Colletion
		System.out.println("Imprimendo ordenadamente");
		Collections.sort(nomes);
		
		nomes.forEach(nome -> System.out.println(nome));
	}

}
