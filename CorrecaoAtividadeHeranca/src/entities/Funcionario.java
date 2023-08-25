package entities;

public class Funcionario {
	
	private String nome;
	protected double salarioBruto;
	private int idade;
	private double bonus;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalarioBruto() {
		return salarioBruto;
	}
	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
 
	public void obterDadosFuncionario() {
		System.out.println("Nome: " + nome);
		System.out.println("Salario: " + salarioBruto);
		System.out.println("idade: " + idade);
		System.out.println("Bonus: " + getBonus());
		System.out.println("Salario atualizado: " + (salarioBruto + getBonus()));
	}

}
