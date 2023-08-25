package entities;

public class Pessoa {
	
	private String nome;
	private int idade;
	private String cpf;
	private String genero;
	private double altura;
	// vou usar o alt + shif + esq 
	//Generate constructores to implement ( dai damos um genereta 
	public Pessoa() {
		super();
		// TODO Auto-generated constructor stub
	}
	//dei outro constutor mas o using field
	public Pessoa(String nome, int idade, String cpf, String genero, double altura) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.genero = genero;
		this.altura = altura;
	}
	//dei o outro construtor para gera todos os SET e GET
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	//vamos fazer o método para mostrar esses dadso
	
	public void obterDadosPessoas() {
		System.out.println("Nome: " + nome);
		System.out.println("CPF: " + cpf);
		System.out.println("Idade: " + idade);
		System.out.println("Genero: " + genero);
		System.out.println("Altura: " + altura);
		
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Nome: " + nome
				+ "\nCPF: " + cpf
				+ "\nIdade: " + idade
				+ "\nGenero: " + genero
				+ "\nAltura: " + altura;
		
	}
}
