package principal;

import entities.Conta;

public class ProgramConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Conta conta = new Conta();
		
		//Passei para par�metro usei o SET
		conta.setTitular("Gustavo");
		conta.setAgencia("2561-x");
		conta.setNumeroConta(6610);
		//conta.saldo = 30.00; n�o funciona mais, pois n�o atribuir
		
		conta.depositar(300.00);
		
		conta.obterDadosbancarios();
		
		conta.sacar(500.00);
		
		conta.obterDadosbancarios();
		
		
		
				
		
		
	}

}
