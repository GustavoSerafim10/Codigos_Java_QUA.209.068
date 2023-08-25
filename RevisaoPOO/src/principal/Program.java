package principal;

import entities.Funcionario;
import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		Funcionario func = new Funcionario();
		
		pessoa.setNome("Gustavo");
		pessoa.setAltura(1.83); //repara com double não "precisa botar assim as aspas"
		pessoa.setCpf("123.456.789-21");
		pessoa.setGenero("Masculino");
		pessoa.setIdade(24);
		
		System.out.println(pessoa);
		
		//dai vamos fazer as mesma coisa acima para funcionario.
		
		func.setNome("Vinicius");
		func.setAltura(1.83); //repara com double não "precisa botar assim as aspas"
		func.setCpf("123.456.789-21");
		func.setGenero("Masculino");
		func.setIdade(24);
		System.out.println(func);
	
	}

}
