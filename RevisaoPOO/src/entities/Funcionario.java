package entities;

public class Funcionario extends Pessoa {
	
	//o extends, tudo que eu usar no pessoa vai ser usado aqui tbm tlg ?
	
	private double salario;
	private String empresa;
	
	//vamos usar o generate constructor from superclass..
	
	public Funcionario() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Funcionario(String nome, int idade, String cpf, String genero, double altura) {
		super(nome, idade, cpf, genero, altura);
		// TODO Auto-generated constructor stub
	}
	//outro construtor.. serar o using fields
	public Funcionario(double salario, String empresa) {
		super();
		this.salario = salario;
		this.empresa = empresa;
	}
	
	//esrevo obterDad + ctrl + espaço ele completa
/*	@Override
	public void obterDadosPessoas() {
		// TODO Auto-generated method stub
		super.obterDadosPessoas();
	}*/
	//Vamos testar o toString

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()
				+"\nSalario: " + salario
				+"\nEmpresa: " + empresa;
	}
		
	}

	


