package principal;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("Gustavo");
		pessoa.calcularIdade(1998);
		
		pessoa.impremeDados();
		
	}

}
