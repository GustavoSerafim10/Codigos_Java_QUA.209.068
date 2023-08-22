package entities;

public class Conta {

	private String titular;
	private int agencia;
	private int numeroConta;
	protected double saldo;
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(double deposito) {
		this.saldo += deposito;
	}
	public void sacar(double saque) {
		this.saldo -= saque;
	}
	
	public void obterDadosBancarios() {
		System.out.println("Titular: " + titular);
		System.out.println("Agencia: " + agencia);
		System.out.println("Conta: " + numeroConta);
		System.out.printf("Saldo: %.2f ", saldo);
	}
	
}
