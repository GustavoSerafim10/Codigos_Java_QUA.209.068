package entities;

public class Funcionario {
	
	    private String nome;
	    private int idade;
	    protected double salarioBruto;

	    public Funcionario(String nome, int idade, double salarioBruto) {
	        this.nome = nome;
	        this.idade = idade;
	        this.salarioBruto = salarioBruto;
	    }

	    public double calcularSalario() {
	        return salarioBruto;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public int getIdade() {
	        return idade;
	    }

	    public double getSalarioBruto() {
	        return salarioBruto;
	    }
	}

