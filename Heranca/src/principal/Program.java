package principal;

import entities.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Program {

	public static void main(String[] args) {
		//essas conta aqui de cima são objetos tlg.
		Conta conta = new Conta();
		ContaCorrente cc = new ContaCorrente();
		ContaPoupanca cp = new ContaPoupanca();
		
		
		System.out.println("Conta Normal:");
		conta.setTitular("Gustavo");
		conta.setAgencia(123456);
		conta.setNumeroConta(5522);
		conta.depositar(150.25);
		conta.sacar(50.00);
		
		conta.obterDadosBancarios();
		
		System.out.println("Conta corrente:");
		
		cc.setTitular("Gustavo");
		cc.setAgencia(123456);
		cc.setNumeroConta(5522);
		cc.depositar(550.45);
		cc.sacar(250.00);
		
		cc.obterDadosBancarios();

		
		System.out.println("Conta Poupança:");
		
		cp.setTitular("Gustavo");
		cp.setAgencia(123456);
		cp.setNumeroConta(5522);
		cp.depositar(550.45);
		cp.sacar(280.00);
		
		cp.obterDadosBancarios();
	}

}
