package entities;

public class Conta {
	
	private String titular;
	private String agencia;
	private int numeroConta;
	private double saldo;
	
	//get == obter
	public String getTitular() {
		return titular;
	}
	
	//this == identifca o atributo da class tlg..
	// set == atribuir valor
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	//atalho = alt + shift + s ( Generate Getters and Setters)
	public void depositar(double valorDeposito) {
		saldo += valorDeposito;
		}
	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
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

	public  void sacar(double valorSaque) {
		saldo -= valorSaque;
		
	}
	public void obterDadosbancarios() {
		System.out.println("Titular: " + titular);
		System.out.println("agencia: " + agencia);
		System.out.println("conta : " + numeroConta);
		System.out.println("saldo: " + saldo);
	
		
	}

}
