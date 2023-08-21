package principal;

import entities.Conta;

public class ProgramConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conta conta = new Conta();
		
		//Passei para parâmetro usei o SET
		conta.setTitular("Gustavo");
		conta.setAgencia("2561-x");
		conta.setNumeroConta(6610);
		//conta.saldo = 30.00; não funciona mais, pois não atribuir
		
		conta.depositar(300.00);
		
		conta.obterDadosbancarios();
		
		conta.sacar(500.00);
		
		conta.obterDadosbancarios();
		
		
		
				
		
		
	}

}
