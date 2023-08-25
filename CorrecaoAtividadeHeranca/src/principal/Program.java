package principal;

import entities.Chefia;
import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Funcionario funcionario = new Funcionario();
		Funcionario gerente = new Chefia();
		funcionario.setNome("Gustavo");
		funcionario.setIdade(24);
		funcionario.setSalarioBruto(1300.00);

		funcionario.obterDadosFuncionario();
		
		gerente.setNome("Gustavo");
		gerente.setIdade(24);
		gerente.setSalarioBruto(3300.00);
		
		gerente.obterDadosFuncionario();
		
	}

}
