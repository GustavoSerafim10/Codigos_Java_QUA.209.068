package principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import entities.Pessoa;

public class ProgramPessoa {

	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa("Gustavo",24);
		Pessoa pessoa2 = new Pessoa("Bernardo",7);
		Pessoa pessoa3 = new Pessoa("Roberto",60);
		
		ArrayList<Pessoa> pessoas = new ArrayList<>();
		
		pessoas.add(pessoa1);
		pessoas.add(pessoa2);
		pessoas.add(pessoa3);
		
		System.out.println(pessoas);
		
		Collections.sort(pessoas);
		
		System.out.println(pessoas);
		
		Collections.sort(pessoas, Comparator.comparing(Pessoa::getIdade));
	}

}
